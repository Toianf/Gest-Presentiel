package com.mycompany.model;

import com.mycompany.gestplanning.Dashboard_Form;
import com.mycompany.gestplanning.MysqlConnect;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Salarie extends Sujet implements Observateur {

    private Integer id;
    private String nom;
    private String prenom;
    private String email;
    private String profession;

    public Salarie() {

    }

    public Salarie(Integer id, String nom, String prenom, String email, String profession) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.profession = profession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
        this.notifierObser();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        this.notifierObser();
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
        this.notifierObser();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        this.notifierObser();
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
        this.notifierObser();
    }

    @Override
    public String toString() {
        return "Nom : " + nom + ", Prenom : " + prenom + ", Email : " + email + ", Profession : " + profession;
    }

    public static ListSalarieModel ChargerJlist() {
        List<Salarie> listeSalarie = new ArrayList<Salarie>();
        ListSalarieModel model = new ListSalarieModel(listeSalarie);
        try {
            Connection conn = MysqlConnect.ConnectDB();
            Statement st = conn.createStatement();
            ResultSet resultat = st.executeQuery("Select * from salarie");

            //Etape 4:Exploiter mon resultat
            while ((resultat.next())) {

                String nom = resultat.getString(1);
                String prenom = resultat.getString("prenom");
                String email = resultat.getString("email");
                String profession = resultat.getString("profession");

                Salarie s = new Salarie();
                s.setNom(nom);
                s.setPrenom(prenom);
                s.setEmail(email);
                s.setProfession(profession);

                model.addSalarie(s);

            }

        } catch (Exception ex) {
            Logger.getLogger(Dashboard_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        return model;

    }

    public Salarie addSalarie(String nom, String prenom, String email, String profession) {
        Salarie s = new Salarie();
        s.setNom(nom);
        s.setPrenom(prenom);
        s.setEmail(email);
        s.setProfession(profession);
        s.ajouterObser(this);

        if (verifyFields(s.getNom(), s.getPrenom(), s.getProfession())) {
            String registerUserQuery = "INSERT INTO salarie(nom, prenom, email, profession) VALUES (?,?,?,?)";

            try {
              Connection conn = MysqlConnect.ConnectDB();
               PreparedStatement pst = conn.prepareStatement(registerUserQuery);
                pst.setString(1, s.getNom());
                pst.setString(2, s.getPrenom());
                pst.setString(3, s.getEmail());
                pst.setString(4, s.getProfession());
                pst.executeUpdate();
                pst.close();
                notifier();
            } catch (SQLException ex) {
                Logger.getLogger(Salarie.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return s;
    }
    
        public static boolean verifyFields(String nom, String prenom, String profession) {
        Salarie s = new Salarie();
        s.setNom(nom);
        s.setPrenom(prenom);
        s.setProfession(profession);

        // check empty fields
        if (s.getNom().trim().equals("") || s.getPrenom().trim().equals("")
                || s.getProfession().trim().equals("")) {
            JOptionPane.showMessageDialog(null, "Un ou plusieur champs sont vides", "Champs Vides", 2);
            return false;
        } // if everything is ok
        else {
            return true;
        }
    }

    @Override
    public void notifier() {
        Dashboard_Form.jList1.setModel(Salarie.ChargerJlist());
    }

}

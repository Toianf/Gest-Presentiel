package com.mycompany.model;


public class Salarie {
    
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
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
   
    @Override
    public String toString() {
        return "Le salarié nom : " + nom + ", prenom : " + prenom + ", email : "+ email + ", profession : "+ profession;
    }

    
   
    
}

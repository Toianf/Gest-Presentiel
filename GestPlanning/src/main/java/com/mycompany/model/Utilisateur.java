package com.mycompany.model;


public class Utilisateur extends Personne{

    private String login;
    private String password;

    public Utilisateur(String login, String password) {
         super();  //Appelle le constructeur de la classe mère
        this.login = login;
        this.password = password;
    }

    public Utilisateur() {
    }

    public String getLogin() {
        return login;
    }

    public void setUsername(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "" + nom + ";" + prenom + ";" +login;
    }
    
    
    
}

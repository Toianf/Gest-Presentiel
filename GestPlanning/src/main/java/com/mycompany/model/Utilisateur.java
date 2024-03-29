package com.mycompany.model;


public class Utilisateur {
    
    private Integer id;   
    private String nom;
    private String prenom;
    private String genre;
    private String login;
    private String password;
    
    public Utilisateur() {
    }

    public Utilisateur(Integer id, String nom, String prenom, String genre, String login, String password) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
        this.login = login;
        this.password = password;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
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
        return "nom :" + nom + ", prenom :" + prenom + ", genre :" +genre + ", login :" +login;
    }
    
}

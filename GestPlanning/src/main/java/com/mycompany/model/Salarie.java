package com.mycompany.model;


public class Salarie {
    
    private Integer id;   
    private String nom;
    private String prenom;
    private String genre;
    private String profession;
       
    public Salarie() {
    }
    public Salarie(Integer id, String nom, String prenom, String genre, String profession) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
   
    @Override
    public String toString() {
        return "nom : " + nom + ", prenom : " + prenom + ", genre : " + genre + ", profession : " + profession;
    }

    
   
    
}

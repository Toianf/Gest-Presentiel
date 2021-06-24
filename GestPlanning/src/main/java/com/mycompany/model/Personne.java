package com.mycompany.model;


public class Personne {
    
    protected Integer id;   
    protected String nom;
    protected String prenom;
    protected String genre;
       
    public Personne() {
    }
        public Personne(Integer id, String nom, String prenom, String genre) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.genre = genre;
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
    

    @Override
    public String toString() {
        return "" + nom + ";" + prenom + ";" ;
    }

    
   
    
}

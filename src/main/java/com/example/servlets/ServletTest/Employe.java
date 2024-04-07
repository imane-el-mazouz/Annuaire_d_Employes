package com.example.servlets.ServletTest;

public class Employe {
    private String nom;
    private String email;
    private String telephone;
    private String departement;
    private String poste;

    public Employe(String nom, String email, String telephone, String departement, String poste) {
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.departement = departement;
        this.poste = poste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }
}

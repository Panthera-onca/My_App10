package com.example.myapplication.myapplication10.adapter.bo;

public class Truc {
    private String libelle;
    private String valeur;

    public Truc() {
    }

    public Truc(String libelle, String valeur) {
        this.libelle = libelle;
        this.valeur = valeur;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getValeur() {
        return valeur;
    }

    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "Truc{" +
                "libelle='" + libelle + '\'' +
                ", valeur='" + valeur + '\'' +
                '}';
    }
}

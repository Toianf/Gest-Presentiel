/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.model.Sujet;

/**
 *
 * @author Julien
 */
public class Presence extends Sujet implements Serializable{
    
    private string EtatSalarie;
    private date DateEtatSalarie;
    private integer IdSalarie;

    public string getEtatSalarie() {
        return EtatSalarie;
    }

    public date getDateEtatSalarie() {
        return DateEtatSalarie;
    }

    public integer getIdSalarie() {
        return IdSalarie;
    }

    public void setEtatSalarie(string EtatSalarie) {
        this.EtatSalarie = EtatSalarie;
        this.notifierObservateur();
    }

    public void setDateEtatSalarie(date DateEtatSalarie) {
        this.DateEtatSalarie = DateEtatSalarie;
        this.notifierObservateur();
    }

    public void setIdSalarie(integer IdSalarie) {
        this.IdSalarie = IdSalarie;
        this.notifierObservateur();
    }
    
    
}

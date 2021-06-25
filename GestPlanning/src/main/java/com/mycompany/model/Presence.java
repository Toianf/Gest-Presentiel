/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import com.mycompany.model.Sujet;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author Julien
 */
public class Presence extends Sujet implements Serializable{
    
    private String EtatSalarie;
    private Date DateEtatSalarie;
    private Integer IdSalarie;

    public String getEtatSalarie() {
        return EtatSalarie;
    }

    public Date getDateEtatSalarie() {
        return DateEtatSalarie;
    }

    public Integer getIdSalarie() {
        return IdSalarie;
    }

    public void setEtatSalarie(String EtatSalarie) {
        this.EtatSalarie = EtatSalarie;
        this.notifierObservateur();
    }

    public void setDateEtatSalarie(Date DateEtatSalarie) {
        this.DateEtatSalarie = DateEtatSalarie;
        this.notifierObservateur();
    }

    public void setIdSalarie(Integer IdSalarie) {
        this.IdSalarie = IdSalarie;
        this.notifierObservateur();
    }
    
    
}

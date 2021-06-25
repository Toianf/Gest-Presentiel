/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Observer;

/**
 *
 * @author Julien
 */
public class Sujet {
    
    private Collection <Observateur>  collectionObserver;
    
    public Sujet(){
    collectionObserver = new ArrayList();
    }

    public void AjouterCollectionObserver(Observateur o) {
        collectionObserver.add(o);
    }

    public void SupprimerCollectionObserver(Observateur o) {
        collectionObserver.remove(o);
    }
    
    public void notifierObservateur(){
    for (Observateur obs : collectionObserver){
        obs.notifier();
    }
    };
}

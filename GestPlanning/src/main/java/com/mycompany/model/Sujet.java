/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.model;

/**
 *
 * @author Julien
 */
public class Sujet {
    
    private Collection <Observer>  collectionObserver;
    
    public Sujet(){
    collectionObserver = new ArrayList();
    }

    public void AjouterCollectionObserver(Observer o) {
        collectionObserver.add(o);
    }

    public void SupprimerCollectionObserver(Observer o) {
        collectionObserver.remove(o);
    }
    
    public void notifierObservateur(){
    for (Observer obs : collectionObserver){
        obs.Notify();
    }
    };
}

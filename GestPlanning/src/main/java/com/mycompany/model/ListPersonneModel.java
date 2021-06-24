package com.mycompany.model;

import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ListModel;


public class ListPersonneModel extends AbstractListModel {
    public ListPersonneModel(List<Personne> liste) {
        this.liste = liste;
    }    
    private List<Personne> liste;

    public void setListe(List<Personne> liste) {
        this.liste = liste;
        this.fireContentsChanged(liste, 0, 0);
    }
    public ListPersonneModel() {
    }    
   
    public void addPersonne(Personne p){
            this.liste.add(p);
            this.fireContentsChanged(liste, 0, 0);
        }

    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public Object getElementAt(int index) {
        return liste.get(index);
    }

    public Iterable<Personne> getListe() {
    return liste;
            }
}

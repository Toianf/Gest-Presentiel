package com.mycompany.model;

import java.util.List;
import javax.swing.AbstractListModel;


public class ListSalarieModel extends AbstractListModel {
    public ListSalarieModel(List<Salarie> liste) {
        this.liste = liste;
    }    
    private List<Salarie> liste;

    public void setListe(List<Salarie> liste) {
        this.liste = liste;
        this.fireContentsChanged(liste, 0, 0);
    }
    public ListSalarieModel() {
    }    
   
    public void addSalarie(Salarie s){
            this.liste.add(s);
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

    public Iterable<Salarie> getListe() {
    return liste;
            }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fuentes;

/**
 *
 * @author alumno
 */
public class Helmet {
    private String size;

    public Helmet(String size) {
        this.size = size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Helmet{" + "size=" + size + '}';
    }
    
}

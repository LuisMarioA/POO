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
public class HumanBody {
   private Heart heart;
   private Helmet helmet;

    public HumanBody(Heart heart, Helmet helmet) {
        this.heart = heart;
        this.helmet = helmet;
    }

    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void setHelmet(Helmet helmet) {
        this.helmet = helmet;
    }

    public Heart getHeart() {
        return heart;
    }

    public Helmet getHelmet() {
        return helmet;
    }

    @Override
    public String toString() {
        return "HumanBody{" + "heart=" + heart + ", helmet=" + helmet + '}';
    }
 
   
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import fuentes.Heart;
import fuentes.Helmet;
import fuentes.HumanBody;

/**
 *
 * @author alumno
 */
public class TestHumanBody {
    public static void main(String[] args) {
        Helmet helmet = new Helmet("XL");
        HumanBody humanBody = new HumanBody(new Heart(78),helmet);
        HumanBody humanBody2 = new HumanBody(new Heart(78),helmet);
        humanBody.getHeart().setHeartRate(86);
        humanBody.getHelmet().setSize("M");
        System.out.println(humanBody);
        
    }
}

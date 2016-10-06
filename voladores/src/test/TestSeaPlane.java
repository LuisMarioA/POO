/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import fuentes.SeaPlane;

/**
 *
 * @author alumno
 */
public class TestSeaPlane {
    public static void main(String[] args) {
        SeaPlane sp1 = new SeaPlane();
        sp1.takeOff();
        sp1.fly();
        sp1.land();
    }
}

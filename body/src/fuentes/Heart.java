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
public class Heart {
     private int heartRate;

    public Heart(int heartRate) {
        this.heartRate = heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    @Override
    public String toString() {
        return "Heart{" + "heartRate=" + heartRate + '}';
    }
}

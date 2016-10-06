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
public class SoccerPlayer {
    private String name;
    private int number;
    private String position;
    private String nationality;
    private int height;
    private double weight;

    public SoccerPlayer(String name,int age, int number, String position, String nationality, int height, float weight) {
        this.name = name;
        this.number = number;
        this.position = position;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SoccerPlayer{" + "name=" + name + ", number=" + number + ", position=" + position + ", nationality=" + nationality + ", height=" + height + ", weight=" + weight + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
    
    
}

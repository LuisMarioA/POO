package test;

import sources.Cat;
import sources.Fish;
import sources.Spider;

public class Tests {
    public static void main(String[] args) {
        Spider spider=new Spider();
        spider.eat();
        Cat cat=new Cat("Snowbell");
        System.out.println("My cat's name is "+cat.getName());
        cat.eat();
        cat.walk();
        cat.play();
        Fish fish=new Fish();
        fish.setName("Nemo");
        System.out.println("My fish's name is "+fish.getName());
        fish.eat();
        fish.walk();
        fish.play();
    }
}
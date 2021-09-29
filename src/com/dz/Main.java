package com.dz;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Dog pug = new Pug(7, "White");
        Doberman doberman = new Doberman(30);
        Bulldog bulldog = new Bulldog(16, "English");
        Dog husky = new Husky(23);
        Pekinese pekinese = new Pekinese( 5);
        Dalmatian dalmatian = new Dalmatian(22, 40);
        ArrayList<Dog> allDogs = new ArrayList<>();
        allDogs.add(pug);
        ((Pug)pug).bark();
        allDogs.add(doberman);
        allDogs.add(bulldog);
        allDogs.add(husky);
        allDogs.add(pekinese);
        pekinese.wagging_tail();
        allDogs.add(dalmatian);
        for (int i = 0; i < allDogs.size(); i++)
            System.out.println(allDogs.get(i));
    }
}

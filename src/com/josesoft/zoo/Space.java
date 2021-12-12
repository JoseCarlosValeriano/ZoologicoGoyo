package com.josesoft.zoo;
import com.josesoft.animals.Animal;

import java.util.ArrayList;
import java.util.Iterator;

public class Space {
    protected ArrayList<Animal> animals;

    public Space(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public String showAnimals(){
        String output = new String("");
        Iterator<Animal> it = this.animals.iterator();

        while(it.hasNext()){
            Animal animal = (Animal) it.next();

            output += animal.name() + " " + animal.genderString() + "\n";
        }
        return output;
    }
}

package com.josesoft.zoo;

import com.josesoft.animals.Animal;
import com.josesoft.animals.Dog;
import com.josesoft.animals.LoveBird;


import java.util.ArrayList;
import java.util.Iterator;

public class ZooManager {
    private ArrayList<Space> spaces;

    public ZooManager(int numSpaces, int numAnimals){
        this.spaces = new ArrayList<Space>();
        generateSpaces(numSpaces, numAnimals);
        printSpaces();
    }

    private void generateSpaces(int numSpaces, int numAnimals) {
        int animalCount = 0;
        if (numAnimals <= numSpaces * 2){
            for (int i = 0; i < numSpaces; i++){
                if (animalCount > numAnimals){
                    break;
                }
                ArrayList<Animal> animalList = new ArrayList<Animal>();
                animalList.add(generateRandomAnimal());
                animalCount++;
                this.spaces.add(new Space(animalList));
            }
            if (animalCount < numAnimals ){
                int spaceIndex = 0;
                while (animalCount < numAnimals){
                    Space actualSpace = this.spaces.get(spaceIndex);
                    Animal actualAnimal = actualSpace.animals.get(0);
                    Animal partner = generatePartner(actualAnimal);
                    actualSpace.animals.add(partner);
                    this.spaces.set(spaceIndex, actualSpace);
                    animalCount++;
                    spaceIndex++;
                }
            }
        } else {
            System.out.println("Sorry this zoo configuration in impossible");
        }
    }

    private Animal generateRandomAnimal(){
        if(Math.random() < 0.5){
            return new Dog();
        }
        return new LoveBird();
    }

    private Animal generatePartner(Animal originalAnimal){
        Animal.Genre originalGender = originalAnimal.gender();
        Animal.Genre newGender = null;

        if (originalGender == Animal.Genre.MALE){
            newGender = Animal.Genre.FEMALE;
        }else{
            newGender = Animal.Genre.MALE;
        }

        if (originalAnimal instanceof Dog ){
            return new Dog(newGender);
        } else{
            return new LoveBird(newGender);
        }
    }
    private void printSpaces(){
        Iterator<Space> spaceIterator = this.spaces.iterator();
        int spaceNum = 0;
        while (spaceIterator.hasNext()){
            Space actualSpace = spaceIterator.next();
            System.out.println("------------------------------- Space: " + spaceNum + "----------------------------");
            Iterator<Animal> animalIterator = actualSpace.animals.iterator();
            while( animalIterator.hasNext()){
                Animal actualAnimal = animalIterator.next();
                System.out.println(actualAnimal);
            }
            System.out.println("===========================================================");
            spaceNum++;
        }
    }




}

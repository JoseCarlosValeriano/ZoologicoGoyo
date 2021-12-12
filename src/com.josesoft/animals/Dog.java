package com.josesoft.animals;

public class Dog extends Mammal {

    public Dog() {
        super();
    }

    public Dog(Genre gender) {super(gender);}

    public String talk() {
        return "Wof wof";
    }

    @Override
    public String toString() {
        return "Dog --> " + this.name + " [ " + this.genderString() + " ] " + this.talk();
    }

}

package com.josesoft.animals;

public class LoveBird extends Animal {

    public LoveBird() {
        super();
    }

    public LoveBird(Genre gender){
        super(gender);
    }

    public String talk() {
        return "Piou Piou";
    }

    @Override
    public String toString() {
        return "LoveBird --> " + this.name + " [ " + this.genderString() + " ] " + this.talk();
    }

}

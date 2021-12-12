package com.josesoft.animals;

public class Animal {
    public static enum Genre {
        MALE,
        FEMALE

    }

    protected String name;
    private byte age;
    public Genre gender;

    final static int MAXAGE = 16;

    private final String[] namelist = {
            "Tifón",
            "El bicho",
            "Mango",
            "Piña",
            "Juan",
            "Yasuo",
            "Misifú",
            "Bobon",
            "Rantanplán",
            "Harambe",
            "Chimuelo",
            "Yogu",
            "Petisuí",
            "Brego",
            "Eren YEGA",
            "Tora",
            "Yumeko",
            "Bley",
            "Marco",
            "Valentin",
            "Alfredo",
            "Messi",
            "Dio",
            "Boludo",
            "Jojo",
            "Marselo",
            "Patrisio",
            "Mariko",
            "Makina",
            "Titan",
            "Arepita",
            "El Batu",
            "Chispitas"
    };

    public Animal(String name, byte age, Genre gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Animal() {
        this.name = generateRandomName();
        this.age = generateRandomAge();
        this.gender = generateRandomGender();

    }

    public Animal(Genre gender){
        this.name = generateRandomName();
        this.age = generateRandomAge();
        this.gender = gender;
    }

    private String generateRandomName(){
        return (String) namelist[(int) (Math.random() * namelist.length)];
    }

    private byte generateRandomAge(){
        return (byte) (Math.random() * MAXAGE);
    }

    public Genre generateRandomGender(){
        if(Math.random() < 0.5){
            return Genre.MALE;
        }
        return  Genre.FEMALE;
    }

    public String genderString(){
        if(this.gender == Genre.FEMALE) {
            return "Female";
        }
        return  "Male ";
    }

    public String name(){
        return this.name;
    }

    public Genre gender(){
        return this.gender;
    }
}

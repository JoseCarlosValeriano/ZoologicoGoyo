package com.josesoft.animals;

public class Mammal extends Animal {

    public static final float MAXWEIGHT = 100f;
    public static final float MAXVELOCITY = 36.1f;

    private float weight;
    private Habit habits;
    private float velocity;
    private Diet diet;

    public Mammal() {
        super();
        this.weight = generateRandomWeight();
        this.habits = generateRandomHabit();
        this.velocity = generateRandomVelocity(MAXVELOCITY);
        this.diet = generateRandomDiet();
    }

    public static enum Habit {
        DAYTIME,
        NOCTURNAL
    }

    public static enum Diet{
        HERBIVORE,
        CARNIVORE,
        OMNIVORE
    }

    public Mammal(String name, byte age, Genre gender, float weight, Habit habits, float velocity, Diet diet) {
        super(name, age, gender);
        this.weight = weight;
        this.habits = habits;
        this.velocity = velocity;
        this.diet = diet;
    }

    public Mammal(Genre gender) {
        super(gender);
        this.weight = generateRandomWeight();
        this.habits = generateRandomHabit();
        this.velocity = generateRandomVelocity(MAXVELOCITY);
        this.diet = generateRandomDiet();

    }



    private float generateRandomWeight() {
        return (float) Math.random() * MAXWEIGHT;
    }

    private Habit generateRandomHabit(){
        if (Math.random() < 0.5 ){
            return Habit.DAYTIME;
        }
            return Habit.NOCTURNAL;
    }

    private float generateRandomVelocity(float maxvelocity) {
        return (float) Math.random() * MAXVELOCITY;
    }

    private float generateRandomNumber(float limit){
        return (float) (Math.random() * limit);
    }

    private Diet generateRandomDiet() {
        double value = Math.random();
        if (Math.random() < 0.33 ) {
           return Diet.CARNIVORE;
        } else if (value < 0.66) {
            return Diet.HERBIVORE;
        }
        return Diet.OMNIVORE;
    }


}

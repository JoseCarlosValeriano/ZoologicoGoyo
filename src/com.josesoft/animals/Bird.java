package com.josesoft.animals;

public class Bird extends Animal{
    final static float MAX_FLIGHT_HEIGHT = 12500.f;

    public static enum LegType{
        CLAW,
        WEB_FOOTED
    };

    private final String[] featherColors = {
            "Rojo",
            "Amarillo",
            "Naranja",
            "Verde",
            "Morado",
            "Azul",
            "Violeta",
            "Blanco roto"
    };

    private float maxFlightHeight;
    private String featherColor;
    private LegType legType;

    public Bird(String name, byte age, Genre gender, float maxFlightHeight, String featherColor, LegType legType) {
        super(name, age, gender);
        this.maxFlightHeight = maxFlightHeight;
        this.featherColor = featherColor;
        this.legType = legType;
    };

    public Bird(Genre gender) {
        super(gender);
        this.maxFlightHeight = generateRandomMaxFlightHeight();
        this.featherColor = generateRandomFeatherColor();
        this.legType = generateRandomLegType();
    };

    private float generateRandomMaxFlightHeight(){
        return (float) (Math.random() * MAX_FLIGHT_HEIGHT);
    };

    private String generateRandomFeatherColor(){
        return featherColors[(int) (Math.random() * featherColor.length())];
    };

    private LegType generateRandomLegType(){
        if (Math.random() < 0.5) {
            return LegType.CLAW;
        }
        return LegType.WEB_FOOTED;
    }


}

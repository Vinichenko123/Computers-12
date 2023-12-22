package com.george.module2.one;

import java.util.Objects;

//For the following class create an equals, hashcode and toString method:
public class Planet {

    private String designation;

    private double massKg;

    private double orbitEarthYears;

    private PlanetType type;


    @Override
    public int hashCode() {
        return designation.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Planet){
            Planet other = (Planet) obj;
            if (this.massKg == other.massKg && Objects.equals(this.designation, other.designation) && this.orbitEarthYears == other.orbitEarthYears){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "com.george.module2.one.Planet{" +
                "designation='" + designation + '\'' +
                ", massKg=" + massKg +
                ", orbitEarthYears=" + orbitEarthYears +
                ", type=" + type +
                '}';
    }

    public Planet(String designation, PlanetType type){

        this.designation = designation;

        this.type = type;

    }



    public Planet(String designation, double massKg, double orbitEarthYears, PlanetType type) {

        this.designation = designation;

        this.massKg = massKg;

        this.orbitEarthYears = orbitEarthYears;

        this.type = type;

    }

    private class PlanetType {
    }
}
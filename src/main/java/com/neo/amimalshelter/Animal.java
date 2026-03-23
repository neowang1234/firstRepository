/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neo.amimalshelter;

/**
 *
 * @author L0W-R1SE
 */
public class Animal {
    private String idNum;
    private String species;
    private String name;
    private String gender;
    private boolean spayed;
    private String breed;
    private String color;
    private String birthday;
    private String vaccineStatus;
    private String identification;
    private String microIdNum;
    private String adoptionFee;
    
    public Animal(){
        idNum = null;
        species = null;
        name = null;
        gender = null;
        spayed = false;
        breed = null;
        color = null;
        birthday = null;
        vaccineStatus = null;
        identification = null;
        microIdNum = null;
        adoptionFee = null;
    }
    
    public Animal(String idNum, String species, String name, String gender){
        this();
        this.idNum = idNum;
        this.species = species; 
        this.name = name;
        this.gender = gender;
    }
    
    public Animal(String idNum, String species, String name, String gender, boolean spayed, 
            String breed, String color, String birthday, String vaccineStatus, String identification, String microIdNum, String adoptionFee){
        this(idNum, species, name, gender);
        this.spayed = spayed;
        this.breed = breed;
        this.color = color;
        this.birthday = birthday;
        this.vaccineStatus = vaccineStatus;
        this.identification = identification;
        this.microIdNum = microIdNum;
        this.adoptionFee = adoptionFee;
    }
    
    public String getIdNum(){
        return idNum;
    }
    
    public String getSpecies(){
        return species;
    }
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public boolean getSpayed(){
        return spayed;
    }
    
    public String getBreed(){
        return breed;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getBirthday(){
        return birthday;
    }
    
    public String getVaccineStatus(){
        return vaccineStatus;
    }
    
    public String getIdentification(){
        return identification;
    }
    
    public String getMicroIdNum(){
        return microIdNum;
    }
    
    public String getAdoptionFee(){
        return adoptionFee;
    }
    
    public String toString(){
        return("Animal Information"
                + "\n1. ID Number: " + idNum
                + "\n2. Species: " + species
                + "\n3. Name: " + name
                + "\n4. Gender: " + gender
                + "\n5. Spayed: " + spayed
                + "\n6. Breed: " + breed
                + "\n7. Colour: " + color
                + "\n8. Birthday: " + birthday
                + "\n9. Vaccine Status: " + vaccineStatus
                + "\n10. Identification: " + identification
                + "\n11. Microchip Number: " + microIdNum
                + "\n12. Adoption Fee: " + adoptionFee);
    }
}

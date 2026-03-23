/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neo.amimalshelter;

import java.io.InputStream;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author L0W-R1SE
 */
public class AddAnimal {

    public String validateInput(String msg, String[] validOptions) {
        String input = "";
        boolean valid = false;
        while (!valid) {
            input = JOptionPane.showInputDialog(msg);
            if (input == null) {
                JOptionPane.showMessageDialog(null, "User Cancelled. Goodbye.");
            }
            for (int i = 0; i < validOptions.length; i++) {
                if (validOptions[i].equals(input)) {
                    return input;
                }
            }
            JOptionPane.showMessageDialog(null, "Invalid Input. Try Again");
        }
        return input;
    }

    public List<Animal> displayInformationPrompts(List<Animal> shelter) {
        String idNum = JOptionPane.showInputDialog("""
                                                   Information (1/12)
                                                   What is the ID Number of your animal
                                                   Format: Incrementing 0 padded 8-digit number.
                                                   Ex. 123 = 00000123""");
        String species = JOptionPane.showInputDialog("Information (2/12)\nWhat species is your animal");
        String name = JOptionPane.showInputDialog("Information (3/12)\nWhat is the name of your animal");

        String gender = validateInput("Information (4/12)\nWhat gender is your animal (F/M)", new String[]{"F","M"});

        String sSpayed = validateInput("Information (5/12)\nIs your animal spayed (Y/N)", new String[]{"Y","N"});
        boolean spayed = false;
        if (sSpayed.equals("Y")) {
            spayed = true;
        }

        String breed = JOptionPane.showInputDialog("Information (6/12)\nWhat breed is your animal?");

        String color = JOptionPane.showInputDialog("Information (7/12)\nWhat colour is your animal?");

        String birthday = JOptionPane.showInputDialog("Information (8/12)\nWhat is the Birthday of your Animal\nFormat: dd/mm/year");

        String vaccineStatus = validateInput("""
                                                           Information (9/12)
                                                           What is the Vaccine Status of your Animal
                                                           
                                                           1. Up to date
                                                           2. Late
                                                           3. Unknown
                                                           Enter the number corresponding to the option.""", new String[]{"1","2", "3"});
        String identification = validateInput("""
                                                            Information (10/12)
                                                            What type of identification does your animal have?
                                                            1. Barcode
                                                            2. Micro-Chipped
                                                            Enter the number corresponding to the option.""",new String[]{"1","2"});
        String microIdNum = "N/A";
        if (identification.equals("2")) {
            microIdNum = JOptionPane.showInputDialog("Information (11/12)\nWhat is the micro-chip number?");
        }

        String adoptionFee = JOptionPane.showInputDialog("Information (12/12)\nWhat is the adoption fee of your animal?");

        Animal animal = new Animal(idNum, species, name, gender, spayed, breed, color, birthday, vaccineStatus, identification, microIdNum, adoptionFee);
        shelter.add(animal);
        return shelter;
    }

}

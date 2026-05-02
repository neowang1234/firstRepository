/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neo.amimalshelter.ui;

import com.neo.amimalshelter.domain.Animal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author L0W-R1SE
 */
public class DisplayAnimalsSpecies {

    public List<String> findAllSpecies(List<Animal> shelter) {
        List<String> speciesList = new ArrayList<String>();
        boolean foundSpecies = false;
        for (int i = 0; i < shelter.size(); i++) {
            for (int s = 0; s < speciesList.size(); s++) {
                if (shelter.get(i).getSpecies().equals(speciesList.get(s))) {
                    foundSpecies = true;
                }
            }
            if (!foundSpecies) {
                speciesList.add(shelter.get(i).getSpecies());
            }
            foundSpecies = false;
        }
        return speciesList;
    }

    public void displayAllAnimalsSpecies(List<Animal> shelter, List<String> speciesList) {
        String displayList = "";
        int count = 0;
        for (int s = 0; s < speciesList.size(); s++) {
            displayList += speciesList.get(s) + "\n";
            for (int i = 0; i < shelter.size(); i++) {
                if (shelter.get(i).getSpecies().equals(speciesList.get(s))) {
                    count++;
                    displayList += count + ". " + shelter.get(i).getName() + "\n";
                }
            }
            count = 0;
        }
        JOptionPane.showMessageDialog(null, "Animals sorted by species:\n" + displayList);
    }

    public void displaySpecificSpecies(List<Animal> shelter, List<String> speciesList) {
        String displayList = "";
        boolean foundSpecies = false;
        String userSpecies = JOptionPane.showInputDialog("Which Species of Animals would you like to see?");
        for (int i = 0; i < speciesList.size(); i++) {
            if (userSpecies.equals(speciesList.get(i))) {
                foundSpecies = true;
            }
        }

        if (foundSpecies) {
            displayList += "All animals of the " + userSpecies + " species\n";
            int count = 0;
            for (int i = 0; i < shelter.size(); i++) {
                if (shelter.get(i).getSpecies().equals(userSpecies)) {
                    count++;
                    displayList += count + ". " + shelter.get(i).getName() + "\n";
                }
            }
        }else{
            displayList = "Species: " + userSpecies + " not found.";
        }
        
        JOptionPane.showMessageDialog(null, displayList);
    }

}

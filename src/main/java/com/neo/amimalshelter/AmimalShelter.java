/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.neo.amimalshelter;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author L0W-R1SE
 */
public class AmimalShelter {

    public static String displayMenu() {
        return (JOptionPane.showInputDialog("""
               Welcome to the Animal Shelter!
               Would you like too:
               1. Add an Animal.
               2. Remove an Animal
               3. Search for an Animal
               4. Display All Animals (sorted by species)
               5. Display a specific specicies of animals
               6. Save Changes
               7. Help
               8. Quit
               Enter the number beside the option you wish to choose."""));
    }

    public static void decisionMaker(String option, List<Animal> shelter) {

        if (option.equals("1")) {
            AnimalAdd addAnimal = new AnimalAdd();
            addAnimal.setVisible(true);
            addAnimal.setLocationRelativeTo(null);
            while (addAnimal.isDisplayable()) {
                try {
                    Thread.sleep(100); // small delay to avoid CPU spike
                } catch (InterruptedException e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e);
                }
            }

            Animal newAnimal = addAnimal.getAnimal();
            if (newAnimal != null) {
                shelter.add(newAnimal);
            }
        } else if (option.equals("2")) {
            RemoveAnimal removeAnimal = new RemoveAnimal();
            removeAnimal.removeAnimal(shelter);
        } else if (option.equals("3")) {
            SearchAnimal searchAnimal = new SearchAnimal();
            searchAnimal.searchAnimal(shelter);
        } else if (option.equals("4")) {
            DisplayAnimalsSpecies displayAnimalsSpecies = new DisplayAnimalsSpecies();
            List<String> allSpecies = displayAnimalsSpecies.findAllSpecies(shelter);
            displayAnimalsSpecies.displayAllAnimalsSpecies(shelter, allSpecies);
        } else if (option.equals("5")) {
            DisplayAnimalsSpecies displayAnimalsSpecies = new DisplayAnimalsSpecies();
            List<String> allSpecies = displayAnimalsSpecies.findAllSpecies(shelter);
            displayAnimalsSpecies.displaySpecificSpecies(shelter, allSpecies);
        } else if (option.equals("6")) {
            SaveChanges saver = new SaveChanges();
            saver.saveChanges(shelter);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Input. Try again.");
        }
    }

    public static void main(String[] args) {
        ImportFile importFile = new ImportFile();
        List<Animal> shelter = importFile.importFile("/animalData.txt");
        String option = displayMenu();
        if (option != null) {
            while (!option.equals("8") && !option.equals("")) {
                decisionMaker(option, shelter);
                option = displayMenu();
            }
        }

        JOptionPane.showMessageDialog(null, "User Chose to Exit/Did not enter anything. GoodBye!");
        System.out.println(shelter.get(0));
    }
}

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
    

    public static String displayMenu(){
        return(JOptionPane.showInputDialog("""
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
    
    public static void decisionMaker(String option, List<Animal> shelter){
        if(option.equals("1")){
            AddAnimal addAnimal = new AddAnimal();
            addAnimal.displayInformationPrompts(shelter);
        }else if(option.equals("2")){
            RemoveAnimal removeAnimal = new RemoveAnimal();
            removeAnimal.removeAnimal(shelter);
        }else if(option.equals("3")){
            SearchAnimal searchAnimal = new SearchAnimal();
            searchAnimal.searchAnimal(shelter);
        }else if(option.equals("4")){
            DisplayAnimalsSpecies displayAnimalsSpecies = new DisplayAnimalsSpecies();
            List<String> allSpecies = displayAnimalsSpecies.findAllSpecies(shelter);
            displayAnimalsSpecies.displayAllAnimalsSpecies(shelter, allSpecies);
        }else if(option.equals("5")){
            DisplayAnimalsSpecies displayAnimalsSpecies = new DisplayAnimalsSpecies();
            List<String> allSpecies = displayAnimalsSpecies.findAllSpecies(shelter);
            displayAnimalsSpecies.displaySpecificSpecies(shelter, allSpecies);
        }else if(option.equals("6")){
            SaveChanges saver = new SaveChanges();
            saver.saveChanges(shelter);
        }
    }
    public static void main(String[] args) {
        ImportFile importFile = new ImportFile();
        List<Animal> shelter = importFile.importFile("/animalData.txt");
        String option = displayMenu();
        if(option == null){
            JOptionPane.showMessageDialog(null, "User Cancelled/Did not enter anything. GoodBye!");
        }
        while(!option.equals("8")){
            decisionMaker(option, shelter);
            option = displayMenu();
        }
        
        System.out.println(shelter.get(0));
    }
}

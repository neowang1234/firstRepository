/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neo.amimalshelter;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author L0W-R1SE
 */
public class SearchAnimal {
    public void searchAnimal(List<Animal> shelter){
        String name = JOptionPane.showInputDialog("What is the name of the animal you wish to see?");
        boolean foundAnimal = false;
        for(int i = 0; i < shelter.size(); i++){
            if(name.equalsIgnoreCase(shelter.get(i).getName())){
                JOptionPane.showMessageDialog(null, shelter.get(i));
                foundAnimal = true;
            }
        }
        if(!foundAnimal){
            JOptionPane.showMessageDialog(null, name + " was not found.");
        }
        
    }
}

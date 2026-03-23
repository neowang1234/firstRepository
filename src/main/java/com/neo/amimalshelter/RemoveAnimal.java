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
public class RemoveAnimal {
    public void removeAnimal(List<Animal> shelter){
        String idNum = JOptionPane.showInputDialog("Enter the full ID number of the Animal you wish to remove");
        boolean foundAnimal = false;
        for(int i = 0; i < shelter.size() && !foundAnimal; i++){
            if(idNum.equals(shelter.get(i).getIdNum())){
                JOptionPane.showMessageDialog(null, shelter.get(i).getName() + " has been sucessfully removed.");
                shelter.remove(i);
                foundAnimal = true;
            }
        }
        if(!foundAnimal){
            JOptionPane.showMessageDialog(null, "Invalid ID number");
        }
    }
}

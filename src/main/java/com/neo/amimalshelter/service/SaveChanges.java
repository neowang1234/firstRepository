/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neo.amimalshelter.service;

import com.neo.amimalshelter.domain.Animal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author L0W-R1SE
 */
public class SaveChanges {

    public void saveChanges(List<Animal> shelter) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
        int result = fileChooser.showSaveDialog(new JOptionPane());
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; i < shelter.size(); i++) {
                    writer.write(shelter.get(i).getIdNum() + ",");
                    writer.write(shelter.get(i).getSpecies() + ",");
                    writer.write(shelter.get(i).getName() + ",");
                    writer.write(shelter.get(i).getGender() + ",");
                    writer.write(shelter.get(i).getSpayed() + ",");
                    writer.write(shelter.get(i).getBreed() + ",");
                    writer.write(shelter.get(i).getColor() + ",");
                    writer.write(shelter.get(i).getBirthday() + ",");
                    writer.write(shelter.get(i).getVaccineStatus() + ",");
                    writer.write(shelter.get(i).getIdentification() + ",");
                    writer.write(shelter.get(i).getMicroIdNum() + ",");
                    writer.write(shelter.get(i).getAdoptionFee() + ",");
                    writer.write(System.lineSeparator());
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }

        }

    }
}

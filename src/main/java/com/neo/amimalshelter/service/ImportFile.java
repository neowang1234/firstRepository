/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.neo.amimalshelter.service;


import com.neo.amimalshelter.domain.Animal;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author L0W-R1SE
 */
public class ImportFile {
    public List<Animal> importFile(String filePath){  
        InputStream in = ImportFile.class.getResourceAsStream(filePath);
        Scanner s = new Scanner(in);
        List<Animal> shelter = new ArrayList();
        
        while(s.hasNextLine()){
            String dataParts[] = s.nextLine().split(",");
            String idNum = dataParts[0];
            String species = dataParts[1];
            String name = dataParts[2];
            String gender = dataParts[3];
            boolean spayed = false;
            if(dataParts[4].equals("Yes")){
                spayed = true;
            }
            String breed = dataParts[5];
            String color = dataParts[6];
            String birthday = dataParts[7];
            String vaccineStatus = dataParts[8];
            String identification = dataParts[9];
            String microIdNum = dataParts[10];
            String adoptionFee = dataParts[11];
            
            Animal animal = new Animal(idNum, species, name, gender, spayed, breed, color, birthday, vaccineStatus, identification, microIdNum, adoptionFee);
            shelter.add(animal);
        }
        return shelter;
    }
}

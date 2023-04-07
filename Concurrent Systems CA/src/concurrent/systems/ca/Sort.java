/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrent.systems.ca;

import static concurrent.systems.ca.MergeSort.mergeSort;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Yuri
 */
public class Sort {
    
    public static void Sort(){
        String csvFile = "C:\\Users\\Yuri\\Desktop\\CCT\\Courses\\YEAR 3\\Concurrent Systems\\CA\\data.csv";
        String line;
        int[] data = new int[200];
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int index = 0;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    data[index++] = Integer.parseInt(value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        mergeSort(data, 0, data.length - 1);

        // Print the sorted array
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
        
    }
    


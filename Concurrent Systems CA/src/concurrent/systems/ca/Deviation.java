/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrent.systems.ca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Yuri
 */
public  class Deviation {
    
    public static void Deviation(){
        String csvFile = "C:\\Users\\Yuri\\Desktop\\CCT\\Courses\\YEAR 3\\Concurrent Systems\\CA\\data.csv";
        String line = "";
        String cvsSplitBy = ",";
        double mean = 0;
        double deviation = 0;
        double[][] data = new double[20][10];

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            int i = 0;
            while ((line = br.readLine()) != null && i < 20) {

                // use comma as separator
                String[] row = line.split(cvsSplitBy);
                for (int j = 0; j < 10; j++) {
                    data[i][j] = Double.parseDouble(row[j]);
                }
                i++;
            }

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 20; k++) {
                    mean += data[k][j];
                }
            }
            mean /= (20 * 10);

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 20; k++) {
                    deviation += Math.pow(data[k][j] - mean, 2);
                }
            }
            deviation /= (20 * 10);
            deviation = Math.sqrt(deviation);

            // result rounded to 2 decimals
            System.out.println("Deviation for all data: " +String.format("%.2f", deviation));
            System.out.println("");

        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
}

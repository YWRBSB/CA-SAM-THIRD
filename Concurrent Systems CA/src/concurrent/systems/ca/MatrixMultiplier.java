/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrent.systems.ca;

import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Yuri
 */
public class MatrixMultiplier {

    public static void MatrixMultiplier() {

        String csvFile = "C:\\Users\\Yuri\\Desktop\\CCT\\Courses\\YEAR 3\\Concurrent Systems\\CA\\data.csv";

        String line;
        int[][] matrixA = new int[10][10];
        int[][] matrixB = new int[10][10];
        int[][] matrixResult = new int[10][10];

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            int rowIndex = 0;
            boolean readingMatrixA = true;
            while ((line = br.readLine()) != null) {
                String[] tokens = line.split(",");
                for (int colIndex = 0; colIndex < tokens.length; colIndex++) {
                    int value = Integer.parseInt(tokens[colIndex]);
                    if (readingMatrixA) {
                        matrixA[rowIndex][colIndex] = value;
                    } else {
                        matrixB[rowIndex][colIndex] = value;
                    }
                }
                rowIndex++;
                // Switch to reading Matrix B after 10 rows of Matrix A
                if (rowIndex == 10 && readingMatrixA) {
                    readingMatrixA = false;
                    rowIndex = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Matrix A:");
        System.out.println("------------------------------");
        for (int[] row : matrixA) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
         
        }
           
           System.out.println("");
        System.out.println("Matrix B:");
        System.out.println("------------------------------");
        for (int[] row : matrixB) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
           
        }
         
        // Multiply matrices A and B together and store the result in matrixResult
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrixResult[i][j] = 0;
                for (int k = 0; k < 10; k++) {
                    matrixResult[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
       //   Print the result matrix C
       
       System.out.println("");
       System.out.println("MATRIX A X MATRIX B: ");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                
                System.out.print(matrixResult[i][j] + " ");
            }
            System.out.println("");
           
        }           
        System.out.println("");
        System.out.println("------------------------------");

    }
}



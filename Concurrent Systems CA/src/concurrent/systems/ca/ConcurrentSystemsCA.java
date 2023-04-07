/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package concurrent.systems.ca;

import static concurrent.systems.ca.Deviation.Deviation;
import static concurrent.systems.ca.MatrixMultiplier.MatrixMultiplier;
import static concurrent.systems.ca.Sort.Sort;


/**
 *
 * @author Yuri
 */
public class ConcurrentSystemsCA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Deviation();
        MatrixMultiplier();
        Sort();
    }

}

// multiply matrices 
// String csvFile = "data.csv";
//        String line = "";
//        String cvsSplitBy = ",";
//        int n = 10;
//        double[][] A = new double[n][n];
//        double[][] B = new double[n][n];
//        double[][] C = new double[n][n];
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            int i = 0;
//            while ((line = br.readLine()) != null && i < 20) {
//                String[] row = line.split(cvsSplitBy);
//                for (int j = 0; j < 10; j++) {
//                    if (j < 5) {
//                        A[i][j] = Double.parseDouble(row[j]);
//                    } else {
//                        B[i][j - 5] = Double.parseDouble(row[j]);
//                    }
//                }
//                i++;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        // Multiply matrices A and B together and store the result in matrix C
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                C[i][j] = 0;
//                for (int k = 0; k < n; k++) {
//                    C[i][j] += A[i][k] * B[k][j];
//                }
//            }
//        }
//
//        // Print the result matrix C
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(C[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
//}
//public class MergeSorter {
//    public static void main(String[] args) {
//        String csvFile = "data.csv";
//        String line = "";
//        String cvsSplitBy = ",";
//        int n = 200;
//        double[] data = new double[n];
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//            int i = 0;
//            while ((line = br.readLine()) != null && i < n) {
//                String[] row = line.split(cvsSplitBy);
//                for (int j = 0; j < 10; j++) {
//                    data[i] = Double.parseDouble(row[j]);
//                    i++;
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        mergeSortDescending(data, 0, n - 1);
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(data[i] + " ");
//        }
//    }
//
//    public static void mergeSortDescending(double[] arr, int l, int r) {
//        if (l < r) {
//            int m = (l + r) / 2;
//            mergeSortDescending(arr, l, m);
//            mergeSortDescending(arr, m + 1, r);
//            mergeDescending(arr, l, m, r);
//        }
//    }
//
//    public static void mergeDescending(double[] arr, int l, int m, int r) {
//        int n1 = m - l + 1;
//        int n2 = r - m;
//
//        double[] L = new double[n1];
//        double[] R = new double[n2];
//
//        for (int i = 0; i < n1; i++)
//            L[i] = arr[l + i];
//        for (int j = 0; j < n2; j++)
//            R[j] = arr[m + 1 + j];
//
//        int i = 0, j = 0;
//        int k = l;
//
//        while (i < n1 && j < n2) {
//            if (L[i] >= R[j]) {
//                arr[k] = L[i];
//                i++;
//            } else {
//                arr[k] = R[j];
//                j++;
//            }
//            k++;
//        }
//
//        while (i < n1) {
//            arr[k] = L[i];
//            i++;
//            k++;
//        }
//
//        while (j < n2) {
//            arr[k] = R[j];
//            j++;
//            k++;
//        }
//    }
//}

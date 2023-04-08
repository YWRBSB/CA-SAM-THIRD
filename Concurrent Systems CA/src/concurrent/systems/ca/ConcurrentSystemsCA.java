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


        Deviation deviation = new Deviation();
        MatrixMultiplier matrixMultiplier = new MatrixMultiplier();
        Sort sort = new Sort();

       
        Thread deviationThread = new Thread(() -> {
            deviation.Deviation();
        });

        Thread matrixMultiplierThread = new Thread(() -> {
           
            try {
                // Wait for deviation method to complete
               deviationThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            matrixMultiplier.MatrixMultiplier();
        });
      

        Thread mergeSortThread = new Thread(() -> {
           
            
              try {
                // Wait for matrix multiplier to complete
               matrixMultiplierThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sort.Sort();
        });

        // Start the threads
        deviationThread.start();
        matrixMultiplierThread.start();
        mergeSortThread.start();

        // Wait for all threads to complete
        try {
            deviationThread.join();
            matrixMultiplierThread.join();
            mergeSortThread.join();
            
       
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         System.out.println();
        System.out.println("All threads have completed.");
        
       
    
    }

}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concurrent.systems.ca;

import java.util.Arrays;

/**
 *
 * @author Yuri
 */
public class Merge {
    public static void merge(int[] arr, int left, int middle, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, middle + 1);
        int[] rightArr = Arrays.copyOfRange(arr, middle + 1, right + 1);

        int i = 0, j = 0, k = left;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] >= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        while (i < leftArr.length) {
            arr[k++] = leftArr[i++];
        }

        while (j < rightArr.length) {
            arr[k++] = rightArr[j++];
        }
    }
}

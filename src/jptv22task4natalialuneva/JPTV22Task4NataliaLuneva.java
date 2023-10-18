/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv22task4;

import java.util.Arrays;
/**
 *
 * @author pupil
 */
public class JPTV22Task4 {

    public static void main(String[] args) {
       int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (Math.random() * 50) * 2 + 1; 
            array[i] = randomNumber;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d" ,array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        Arrays.sort(array);
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = sum / array.length;
        System.out.println("\n Отсортированный массив:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-3d " ,array[i]);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
        System.out.printf("\n Среднее арифметическое: %2f%n" , average);
    }
}

package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //double[] tests = {5, 10, 15, 20};

        //for (int i = 0; i < tests.length; i++) {
        //    System.out.println(tests[i] + " ");
        //}
        //double total = 0;
        //for (int i = 0; i < tests.length; i++) {
        //  total += tests[i];
        //}
        //double average = total / 4;


        //System.out.println(average);

        double[][] testscores = {
                {60, 65, 70},
                {70, 75, 80},
                {80, 85, 90},
                {90, 95, 100}
        };

        double [][] studentscores = {
                {60, 70, 80, 90},
                {65, 75, 85, 95},
                {70, 80, 90, 100}
        };

        // for (int row = 0; row < testscores.length; row++) {
        //   for (int column = 0; column < testscores[row].length; column++) {
        //     System.out.println(testscores[row][column] + " ");
        //}
        // System.out.println();
        //}

        for (int column = 0; column < testscores[0].length; column++) {
            double total = 0;
            for (int row = 0; row < testscores.length; row++)
                total += testscores[row][column];
            double average = total / 4;
            System.out.println("Average Score for Test " + (column + 1) + " is " + average);
        }
        System.out.println();

        for (int column = 0; column < studentscores[0].length; column++) {
            double total = 0;
            for (int row = 0; row < studentscores.length; row++)
                total += studentscores[row][column];
            double average = total / 3;
            System.out.println("Average Score for student " + (column + 1) + " is " + average);
        }

        }
    }


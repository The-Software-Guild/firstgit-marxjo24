/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercise3;

import java.util.Scanner;

/**
 *
 * @author Marxj
 */
public class AllTheTrivia {
     public static void main(String[] args) {
         String answer1, answer2, answer3, answer4;
         Scanner scan = new Scanner(System.in);
         
         System.out.println("What unit is equivalent to 1,024 Gigabytes? ");
         answer2 = scan.nextLine();
         System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
         answer3 = scan.nextLine();
         System.out.println("The largest volcano ever discovered in our Solar System is located on which planet? ");
         answer4 = scan.nextLine();
         System.out.println("What is the most abundant element in the earth's atmosphere? ");
         answer1 = scan.nextLine();
         System.out.println("\nWow, 1,024 Gigabytes is a " + answer4 + "!");
         System.out.println("I didn't know that the largest ever volcano was discovered on " + answer2);
         System.out.println("That's amazing that " + answer3 + " is the most abundant element in the atmosphere...");
         System.out.println(answer1 + " is the only planet that rotates clockwise, neat!");
     }
}

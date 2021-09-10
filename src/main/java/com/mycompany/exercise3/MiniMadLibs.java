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
public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String noun1, adjective1, noun2, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, verbPresent, verbPast;
        int num;
        System.out.println("Enter a noun");
        noun1 = scan.nextLine();
        System.out.println("Enter an adjective");
        adjective1 = scan.nextLine();
        System.out.println("Enter another noun");
        noun2 = scan.nextLine();
        System.out.println("Enter a number");
        num = Integer.parseInt(scan.nextLine());
        System.out.println("Enter an adjective");
        adjective2 = scan.nextLine();
        System.out.println("Enter a plural noun");
        pluralNoun1 = scan.nextLine();
        System.out.println("Enter another plural noun");
        pluralNoun2 = scan.nextLine();
        System.out.println("Enter another plural noun");
        pluralNoun3 = scan.nextLine();
        System.out.println("Enter a verb present tense");
        verbPresent = scan.nextLine();
        System.out.println("Enter the same verb but in past tense");
        verbPast = scan.nextLine();
        
        System.out.println("\n" + noun1 + ": the " + adjective1 + " frontier. "
                + "These are the voyages of the starship " + noun2 + ". Its " 
                + num + "-year mission: to explore strange " + adjective2 + " "
                + pluralNoun1 + ", to seek out " + adjective2 + " " + pluralNoun2 
                + " and " + adjective2 + " " + pluralNoun3 + ", to boldly " 
                + verbPresent + " where no one has " + verbPast + " before.");
        
    }
}

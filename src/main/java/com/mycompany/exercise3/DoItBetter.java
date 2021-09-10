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
public class DoItBetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int miles, hotDogs, languages;
        System.out.println("How many miles can you run?");
        miles = Integer.parseInt(scan.nextLine());
        System.out.println("Oh, that's cute. I can run " + (miles*2 + 1) + " miles.");
        
        System.out.println("How many hot dogs can you eat?");
        hotDogs = Integer.parseInt(scan.nextLine());
        System.out.println("That's it? I can eat " + (hotDogs * 2 + 1) + " hot dogs.");
        
        System.out.println("How many languages do you know?");
        languages = Integer.parseInt(scan.nextLine());
        System.out.println("Not to brag or anything, but I know " + (languages * 2 + 1) + " languages.");
    }
}

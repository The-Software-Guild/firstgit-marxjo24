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
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age, maxHR, zoneLow, zoneHigh;
        
        System.out.println("What is your age? ");
        age = Integer.parseInt(scan.nextLine());
        maxHR = 220 - age;
        zoneLow = (int)(maxHR * 0.5);
        zoneHigh = (int)(maxHR * 0.85);
        System.out.println("Your maximum heart rate should be " + maxHR + " beats per minute.");
        System.out.println("Your target HR Zone is " + zoneLow + " - " + zoneHigh + " beats per minute.");
    }
}

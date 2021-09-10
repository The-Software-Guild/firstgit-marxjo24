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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        String name, color, food;
        int number;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hello there!\nWhat's your name? ");
        name = scan.nextLine();
        System.out.println("Hi, " + name + "! I'm Alice");
        
        System.out.println("What's your favorite color? ");
        color = scan.nextLine();
        System.out.println("Huh, " + color + "? Mine's Electric Lime.\n\nI really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, " + name + "? ");
        food = scan.nextLine();
        System.out.println("Really? " + food + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number? ");
        number = Integer.parseInt(scan.nextLine());
        System.out.println(number + " is a cool number. Mine's -7.");
        System.out.println("Did you know " + number + " * -7 is " + number*(-7) + "? That's a cool number too!");
        System.out.println("Well, thanks for talking to me, " + name);
    }
    
}

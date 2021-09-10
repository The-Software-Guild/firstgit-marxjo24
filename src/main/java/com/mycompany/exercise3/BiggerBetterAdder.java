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
public class BiggerBetterAdder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter number 1");
        num1 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter number 2");
        num2 = Integer.parseInt(scan.nextLine());
        System.out.println("Enter number 3");
        num3 = Integer.parseInt(scan.nextLine());
        int sum = num1 + num2 + num3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + sum);
    }
}

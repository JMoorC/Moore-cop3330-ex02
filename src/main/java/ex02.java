/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String input = inScan.nextLine();
        System.out.printf("%s has %d characters.\n", input, input.length());
    }
}

/*
 *  UCF COP3330 Summer 2021 Assignment 30 Solution
 *  Copyright 2021 Brandon Barbour
 */

public class Main {
    public static void main(String[] args) {
        for (int r = 1; r <= 12; r++) {
            for (int c = 1; c <= 12; c++) {
                System.out.print("\t" + r * c);
            }
            System.out.printf("\n");
        }
    }
}

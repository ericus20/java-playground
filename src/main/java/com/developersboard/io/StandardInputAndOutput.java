package com.developersboard.io;

import java.util.Scanner;

public class StandardInputAndOutput {

    public static void main(String[] args) {

        var s = new Scanner(System.in);
        String text;
        System.out.println("To quit type: exit");
        System.out.println("Type value and press enter:");

        while (!(text = s.nextLine()).equals("exit")) {
            System.out.println("Echo: " + text);
        }
    }
}

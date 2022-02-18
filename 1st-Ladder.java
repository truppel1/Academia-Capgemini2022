package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> ladder = new ArrayList<>();

        System.out.print("Enter the number of times:  ");
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            ladder.add(" ".repeat(n - i) + "*".repeat(i + 1));
        }


        for (String d : ladder ) {
            System.out.println(d);
        }

    }
}

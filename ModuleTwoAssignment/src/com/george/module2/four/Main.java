package com.george.module2.four;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {


    public static void main(String[] args) throws FileNotFoundException {
        Set<String> unique = new HashSet<>();

        Scanner scanner = new Scanner(new File("illiad.txt"));

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase().replaceAll("[^a-z]", "");
            unique.add(word);
        }
        scanner.close();

        System.out.println("Number of unique words: " + unique.size());


    }
}

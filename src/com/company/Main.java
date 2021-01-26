package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> todoList = new ArrayList<String>();

        System.out.println("-".repeat(25));
        System.out.println("Welcome to you todo-list!");
        System.out.println("-".repeat(25));

        menu();

    }
        public static void menu(){
            System.out.println("\nWhat would you like to do?");
            System.out.println("\nA) Add item" + "\nB) Remove item" + "\nC) Clear all" +
                    "\nQ) Quit");
        }
}


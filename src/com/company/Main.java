package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> todoList = new ArrayList<String>();
        System.out.println("What would you like to do?" +
                "\nA) Add item" + "\nB) Remove item" + "\nC) Clear list" + "\nQ) Quit" );

        String menuChoice = input.nextLine();

        if (menuChoice.equalsIgnoreCase("a")){
            System.out.println("What item would you like to add?");
            arrAdd = input.nextLine();
            todoList.add
        }

    }
}

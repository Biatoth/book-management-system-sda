package com.sda.bia.bookmanagement;

import com.sda.bia.bookmanagement.menu.UserOption;
import com.sda.bia.bookmanagement.utils.SessionManager;

import java.util.Scanner;

import static com.sda.bia.bookmanagement.menu.UserOption.UNKNOWN;
import static org.hibernate.event.spi.EventType.values;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SessionManager.getSessionFactory();
        Scanner scanner = new Scanner(System.in);

        UserOption userOption;

        do {
            UserOption.printAllOptions();
            System.out.println("Please select an option");
            try {
                int numericOption = Integer.parseInt(scanner.nextLine());
                userOption = UserOption.findUserOption(numericOption);
            } catch (NumberFormatException e) {
                userOption = UserOption.UNKNOWN;
            }

            switch(userOption){
                case CREATE_AUTHOR:
                    System.out.println("Not implemented");
                    break;
                case EXIT:
                    System.out.println("Goodbye!");
                    break;
                case UNKNOWN:
                    System.out.println("Option Unknown");
                    break;
                default:
                    System.out.println("User option " + userOption + "is not implemented!");
            }
        } while (userOption != UserOption.EXIT);
        SessionManager.shutDown();

    }
}
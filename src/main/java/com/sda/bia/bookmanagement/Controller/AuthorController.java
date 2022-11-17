package com.sda.bia.bookmanagement.Controller;

import com.sda.bia.bookmanagement.service.AuthorService;
import com.sda.bia.bookmanagement.service.exception.InvalidParameterException;

import java.util.Scanner;

public class AuthorController {
    private final AuthorService authorService;
    private final Scanner scanner = new Scanner(System.in);

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    public void createAuthor() {
        try {
            System.out.println("Please insert author first name:");
            String firstName = scanner.nextLine();
            System.out.println("Please insert author last name:");
            String lastName = scanner.nextLine();

            authorService.createAuthor(firstName, lastName);
            System.out.println("Author was created!");
        } catch (InvalidParameterException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Internal server error!");
        }
    }

    public void showAllAuthors() {
        authorService.getAllAuthors().stream().forEach(author ->
                System.out.println("Author with id: " + author.getId() + " first name: " + author.getFirstName() + " last name: " + author.getLastName())
        );
    }
}
package com.sda.bia.bookmanagement.Controller;

import com.sda.bia.bookmanagement.service.BookReviewService;

import java.util.Scanner;

public class ReviewController {
    private final Scanner scanner= new Scanner(System.in);
    private final BookReviewService bookReviewService;


    public ReviewController(BookReviewService bookReviewService, BookReviewService bookReviewService1) {
        this.bookReviewService = bookReviewService1;

    }
    public void  createReview(){
        System.out.println("Please insert title: ");
        String title= scanner.nextLine();
        System.out.println("Please insert score: ");
        int score= Integer.parseInt(scanner.nextLine());
        System.out.println("Please insert a comment: ");
        String comment= scanner.nextLine();
        bookReviewService.createBookReview(title, score, comment);

    }
}

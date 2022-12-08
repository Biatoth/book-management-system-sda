package com.sda.bia.bookmanagement.repository;

import com.sda.bia.bookmanagement.model.Book;

public class BookRepositoryImpl extends BaseRepositoryImpl<Book> implements BookRepository{

    public BookRepositoryImpl() {
        super(Book.class);
    }
}

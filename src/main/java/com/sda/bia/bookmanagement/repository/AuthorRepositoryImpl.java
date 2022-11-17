package com.sda.bia.bookmanagement.repository;

import com.sda.bia.bookmanagement.model.Author;

public class AuthorRepositoryImpl extends BaseRepositoryImpl<Author> implements AuthorRepository {

    public AuthorRepositoryImpl() {
        super(Author.class);
    }
}

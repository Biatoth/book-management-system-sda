package com.sda.bia.bookmanagement.service;

import com.sda.bia.bookmanagement.model.Author;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

public interface AuthorService {

    void createAuthor(String firstName, String lastName) throws InvalidParameterException;
    List<Author> getAllAuthors();
}
package com.sda.bia.bookmanagement.service;

import com.sda.bia.bookmanagement.model.Author;
import com.sda.bia.bookmanagement.service.exception.EntityNotFoundException;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.List;

public interface AuthorService {

    void createAuthor(String firstName, String lastName) throws InvalidParameterException, com.sda.bia.bookmanagement.service.exception.InvalidParameterException;

    void updateAuthor(int authorId, String firstName, String lastName) throws InvalidParameterException, EntityNotFoundException, com.sda.bia.bookmanagement.service.exception.InvalidParameterException;

    void deleteAuthor(int authorId) throws InvalidParameterException, EntityNotFoundException, com.sda.bia.bookmanagement.service.exception.InvalidParameterException;

    List<Author> getAllAuthors();

}

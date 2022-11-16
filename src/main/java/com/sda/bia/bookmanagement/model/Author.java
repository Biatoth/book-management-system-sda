package com.sda.bia.bookmanagement.model;

import javax.persistence.*;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
    private Integer id;
   @Column(name = "first_name")
    private String firstname;
   @Column(name = "last_name")
    private String lastname;


   //NOT REQUIRED in the current specification
//@OneToMany (mappedBy = "author")
 //  private  List<Book> books;
    public Author (){}

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
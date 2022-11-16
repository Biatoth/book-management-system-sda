package com.sda.bia.bookmanagement.utils;

import com.sda.bia.bookmanagement.model.Author;
import com.sda.bia.bookmanagement.model.Book;
import com.sda.bia.bookmanagement.model.Review;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionManager extends AbstractSessionManager{
    private static final SessionManager INSTANCE = new SessionManager();

    private SessionManager() {
    }

    public static SessionFactory getSessionFactory() {
        return INSTANCE.getSessionFactory("book_management_system");
    }

    public static void shutDown() {
        INSTANCE.shutdownSessionManager();
    }

    public static void sessionFactory() {
    }

//    private void shutdownSessionManager() {
//    }



    @Override
    protected void setAnnotatedClasses(Configuration configuration) {
        //Hibernate model will be added here

        configuration.addAnnotatedClass(Author.class);
        configuration.addAnnotatedClass(Book.class);
        configuration.addAnnotatedClass(Review.class);


    }
}

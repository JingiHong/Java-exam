package com.HimediaSummer.project01.member;

import com.HimediaSummer.project01.DTO.memberDTO;

import java.util.ArrayList;
import java.util.List;

public class Cafe {

    private List<managerMent> members;

    public Cafe() {
        members = new ArrayList<>();
    }

    public void addBook(memberDTO memberNum) {
        members.add(book);
    }

    public memberDTO getBook(int isbn) {
        for (memberDTO book : members) {
            if (book.getIsbn() == isbn) {
                return book;
            }
        }
        return null;
    }

    public void updateBook(int isbn, String title, String author) {
        memberDTO book = getBook(isbn);
        if (book != null) {
            book.setTitle(title);
            book.setAuthor(author);
        }
    }

    public void deleteBook(int isbn) {
        books.removeIf(book -> book.getIsbn() == isbn);
    }

    public List<memberDTO> getAllBooks() {
        return books;
    }
}

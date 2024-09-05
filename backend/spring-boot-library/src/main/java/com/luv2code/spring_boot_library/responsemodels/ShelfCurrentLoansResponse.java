package com.luv2code.spring_boot_library.responsemodels;

import com.luv2code.spring_boot_library.entity.Book;
import lombok.Data;
//created to store the loan info of a book and send it to frontend
@Data
public class ShelfCurrentLoansResponse {
    private Book book;
    private int daysLeft;
    public ShelfCurrentLoansResponse(Book book, int daysLeft) {
        this.book = book;
        this.daysLeft = daysLeft;
    }
}

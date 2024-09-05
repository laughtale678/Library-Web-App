package com.luv2code.spring_boot_library.requestmodels;

import lombok.Data;

import java.util.Optional;
//created to deal with review request we received from the front end
@Data
public class ReviewRequest {
    private double rating;
    private Long bookId;
    private Optional<String> reviewDescription;
}

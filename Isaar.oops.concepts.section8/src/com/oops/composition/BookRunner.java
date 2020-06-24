package com.oops.composition;

public class BookRunner {

			public static void main(String[] args) {
			Book book = new Book(133, "kiraak java", 5, "ranga");
			book.addReview(new Review(201, "great", 5));
			book.addReview(new Review(133, "awesome", 5));
			System.out.println(book);

		}

	}



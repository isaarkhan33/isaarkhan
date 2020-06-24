package com.oopslevel2.composition;


	import java.util.ArrayList;



	public class Book {
		private int id;
		private String description;
		private int rating;
		private String author;
		private ArrayList<Review> reviews = new ArrayList<>();

		public Book(int id, String description, int rating, String author) {
			this.id = id;
			this.description = description;
			this.rating = rating;
			this.author = author;
		}

		public void addReview(Review review) {
			this.reviews.add(review);

		}

		@Override
		public String toString() {
			return "Book [id=" + id + ", description=" + description + ", rating=" + rating + ", author=" + author
					+ ", reviews=" + reviews + "]";
		}
}

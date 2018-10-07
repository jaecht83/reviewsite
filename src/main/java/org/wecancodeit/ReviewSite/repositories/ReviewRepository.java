package org.wecancodeit.ReviewSite.repositories;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.wecancodeit.ReviewSite.model.Review;

@Repository
public class ReviewRepository {

	private Map<Long, Review> reviews = new HashMap<>();

	public ReviewRepository() {
		add(new Review(100L, "FordFocus", "focus.jpg",
				"This is a review of the Ford Focus. The Focus has been around since 2000 and is a flashy economy car.",
				"Final assembly: Made in USA.", "Body types: four-door sedan and hatchback."));
		add(new Review(200L, "ToyotaCorolla", "corolla.jpg",
				"This is a review of the Toyota Corolla. Unlike the Focus, the Corolla is not as exciting but more reliable.",
				"Final assembly: Made in USA and Japan.", "Body type: four-door sedan only."));
		add(new Review(300L, "ChevyCruze", "cruze.jpg",
				"Another competitor, the Chevy Cruze, is also reliable but flashier the Corolla.",
				"Final assembly: Made in USA and Korea.", "Body type: five-door hatch."));
		add(new Review(400L, "Mazda3", "mazda3.jpg",
				"The Mazda 3, which is the sportiest of the bunch, is, surprisingly, the least reliable.",
				"Final assembly: Made in Japan.", "Body types: three- and five-door hatch."));
	}

	public void add(Review review) {
		reviews.put(review.getId(), review);

	}

	public int size() {
		return reviews.size();
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public Review findOne(long id) {
		return reviews.get(id);
	}
}

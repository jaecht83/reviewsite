package org.wecancodeit.ReviewSite.repositories;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;
import org.wecancodeit.ReviewSite.model.Review;

public class ReviewRepositoryTest {

	private ReviewRepository reviewRepo = new ReviewRepository();

	@Test
	public void shouldAcceptReviews() {
		// Arrange
		Review ToyotaCorolla = new Review(800L, "DodgeDart", "dart.jpg", "This is a review of the Dart.",
				"final assembly: USA", "body type: four-door");
		// Act
		int repoSizeBeforeAdding = reviewRepo.size();
		reviewRepo.add(ToyotaCorolla);
		int repoSizeAfterAdding = reviewRepo.size();
		// Assert
		assertThat(repoSizeAfterAdding, is(equalTo(repoSizeBeforeAdding + 1)));
	}

	@Test
	public void findOneShouldReturnOneStudent() {
		Review ToyotaCorolla = new Review(200L, "ToyotaCorolla", "corolla.jpg",
				"This is a review of the Toyota Corolla. Unlike the Focus, the Corolla is not as exciting but more reliable.",
				"Final assembly: Made in USA and Japan.", "Body type: four-door sedan only.");
		reviewRepo.add(ToyotaCorolla);
		Review result = reviewRepo.findOne(200L);
		assertThat(result.getTitle(), is("ToyotaCorolla"));
	}
}

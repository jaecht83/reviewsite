package org.wecancodeit.ReviewSite.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.wecancodeit.ReviewSite.repositories.ReviewRepository;

@Controller
public class ReviewSiteController {

	private ReviewRepository ReviewRepo = new ReviewRepository();

	@GetMapping("/reviews")
	public String getReviews(Model model) {
		model.addAttribute("reviews", ReviewRepo.findAll());
		return "reviews";
	}

	@GetMapping("/review/{id}") // Using a PathVariable to dynamically get student id
	public String getReviews(@PathVariable(value = "id") Long id, Model model) {
		model.addAttribute("review", ReviewRepo.findOne(id));
		return "review";
	}
}

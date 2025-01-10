package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.DTOs.RatingDTO;
import com.example.demo.entity.Rating;
import com.example.demo.service.RatingService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings() {
        return new ResponseEntity<>(ratingService.getAllRatings(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Rating> createRating(@Valid @RequestBody RatingDTO ratingDto) {
        Rating rating = new Rating();
        rating.setRatingValue(ratingDto.getRatingValue());
        rating.setFeedback(ratingDto.getFeedback());
        rating.setUserId(ratingDto.getUserId());
        rating.setOrganizationId(ratingDto.getOrganizationId());

        return new ResponseEntity<>(ratingService.saveRating(rating), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rating> updateRating(@PathVariable Long id, @Valid @RequestBody RatingDTO ratingDto) {
        Rating rating = ratingService.getRatingById(id);
        rating.setRatingValue(ratingDto.getRatingValue());
        rating.setFeedback(ratingDto.getFeedback());
        rating.setUserId(ratingDto.getUserId());
        rating.setOrganizationId(ratingDto.getOrganizationId());

        return new ResponseEntity<>(ratingService.saveRating(rating), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRating(@PathVariable Long id) {
        ratingService.deleteRating(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

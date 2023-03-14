package pxl.be.researchproject.service;

import pxl.be.researchproject.api.ReviewDTO;
import pxl.be.researchproject.api.ReviewRequest;

import java.util.List;

public interface ReviewService {

    List<ReviewRequest> findAllReviews();
    ReviewDTO findReviewById(Long reviewId);
    Long createReview(ReviewRequest reviewRequest);
    ReviewDTO updateReview(Long reviewId, ReviewRequest reviewRequest);
    boolean deleteReview(Long reviewId);
}

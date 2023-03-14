package pxl.be.researchproject.service.impl;

import org.springframework.stereotype.Service;
import pxl.be.researchproject.api.ReviewDTO;
import pxl.be.researchproject.api.ReviewRequest;
import pxl.be.researchproject.service.ReviewService;

import java.util.List;
@Service
public class ReviewServiceImpl implements ReviewService {
    @Override
    public List<ReviewRequest> findAllReviews() {
        return null;
    }

    @Override
    public ReviewDTO findReviewById(Long reviewId) {
        return null;
    }

    @Override
    public Long createReview(ReviewRequest reviewRequest) {
        return null;
    }

    @Override
    public ReviewDTO updateReview(Long reviewId, ReviewRequest reviewRequest) {
        return null;
    }

    @Override
    public boolean deleteReview(Long reviewId) {
        return false;
    }
}

package com.example.product.model;


public interface ApiPath {
  public String API = "/api";
  public String LOGIN =  "/user/login";
  public String CREATE_USER = "/createUser";
  public String PRODUCTS =  "/products";
  public String CATEGORY = "/category";
  public String VIEW_ALL_PRODUCTS = PRODUCTS + "/viewAllProducts";
  public String VIEW_PRODUCT =  PRODUCTS + "/view/{productId}";
  public String ADD_PRODUCT = PRODUCTS + "/add";

  public String ADD_CATEGORY = CATEGORY + "/add";

  public String GET_PRODUCT_CATEGORY = CATEGORY + "/getProduct";

  public String REVIEWS = "/reviews";
  public String VIEW_ALL_REVIEWS = REVIEWS + "/viewAllReviews";
  public String ADD_REVIEW = REVIEWS + "/add";

  public String GET_REVIEW_COMMENTS = REVIEWS + "/getReviewComments";

}

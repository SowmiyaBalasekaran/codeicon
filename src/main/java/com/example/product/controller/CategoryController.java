package com.example.product.controller;

import com.example.product.document.Category;
import com.example.product.model.AddTag;
import com.example.product.model.AddTagResponse;
import com.example.product.model.ApiPath;
import com.example.product.model.LoginResponse;
import com.example.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = ApiPath.API)
@CrossOrigin(value = "*")
public class CategoryController {

  @Autowired
  private CategoryService categoryService;
  @PostMapping(value = ApiPath.ADD_CATEGORY)
  public void addCategory(@RequestBody Category category){
     categoryService.addCategory(category);
  }
  @PostMapping(value = ApiPath.GET_PRODUCT_CATEGORY)
  public void getCategoryList(@RequestParam String productId){
    categoryService.getTagList(productId);
  }

  @PostMapping(value = ApiPath.ADD_TAG)
  public AddTagResponse<String> addTag(@RequestBody AddTag addTag){
    return categoryService.addTag(addTag);
  }

}

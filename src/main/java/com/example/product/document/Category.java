package com.example.product.document;

import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.util.List;

@Data
@GeneratePojoBuilder
public class Category {
  private String categoryId;
  private String categoryName;
  private List<Tag> tagList;
}
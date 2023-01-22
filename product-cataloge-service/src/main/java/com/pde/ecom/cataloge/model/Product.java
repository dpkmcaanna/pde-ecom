package com.pde.ecom.cataloge.model;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product { 
    String id; 
    String title; 
    String desc; 
    String imagePath; 
}
   
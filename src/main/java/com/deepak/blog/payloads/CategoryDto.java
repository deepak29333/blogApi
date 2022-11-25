package com.deepak.blog.payloads;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.SecondaryTable;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
    private  Integer category_id;
    private String categoryTitle;
    private  String categoryDescription;
}

package com.kj.reggie.dto;

import com.kj.reggie.entity.Dish;
import com.kj.reggie.entity.DishFlavor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kj
 * @date 2022/11/4
 * @apiNote
 */
@Data
public class DishDto extends Dish {
    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}

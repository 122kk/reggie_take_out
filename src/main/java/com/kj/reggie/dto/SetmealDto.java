package com.kj.reggie.dto;

import com.kj.reggie.entity.Setmeal;
import com.kj.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

/**
 * @author kj
 * @date 2022/11/6
 * @apiNote
 */
@Data
public class SetmealDto extends Setmeal {
    private List<SetmealDish> setmealDishes;
    private String categoryName;
}

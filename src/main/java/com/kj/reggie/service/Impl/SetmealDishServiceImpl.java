package com.kj.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.kj.reggie.entity.SetmealDish;
import com.kj.reggie.mapper.SetmealDishMapper;
import com.kj.reggie.mapper.SetmealMapper;
import com.kj.reggie.service.SetmealDishService;
import org.springframework.stereotype.Service;

/**
 * @author kj
 * @date 2022/11/6
 * @apiNote
 */
@Service
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper,SetmealDish>implements SetmealDishService {
}

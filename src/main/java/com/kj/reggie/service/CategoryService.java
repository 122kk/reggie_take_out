package com.kj.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kj.reggie.entity.Category;

/**
 * @author kj
 * @date 2022/11/3
 * @apiNote
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}

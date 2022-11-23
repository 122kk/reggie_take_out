package com.kj.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kj.reggie.dto.DishDto;
import com.kj.reggie.entity.DishFlavor;
import com.kj.reggie.mapper.DishFlavorMapper;
import com.kj.reggie.service.DishFlavorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author kj
 * @date 2022/11/4
 * @apiNote
 */
@Service
@Slf4j
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {

}

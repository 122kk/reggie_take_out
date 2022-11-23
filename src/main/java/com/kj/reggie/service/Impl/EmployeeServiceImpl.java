package com.kj.reggie.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kj.reggie.entity.Employee;
import com.kj.reggie.mapper.EmployeeMapper;
import com.kj.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author kj
 * @date 2022/11/1
 * @apiNote
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}

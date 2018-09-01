package com.base.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.base.mapper.StudentMapper;
import com.base.model.po.Student;
import com.base.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {
}

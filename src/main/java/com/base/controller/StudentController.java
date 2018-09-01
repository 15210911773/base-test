package com.base.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.base.model.po.Student;
import com.base.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("/student")
public class StudentController extends BaseControllerImpl<Student> {

    @Autowired
    private StudentService studentService;

    @PostConstruct
    public void init() {
        super.setIService((IService)studentService);
    }

}

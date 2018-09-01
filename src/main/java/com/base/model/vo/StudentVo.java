package com.base.model.vo;

import lombok.Data;

import java.util.Date;

@Data
public class StudentVo {

    private Integer id;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;

}

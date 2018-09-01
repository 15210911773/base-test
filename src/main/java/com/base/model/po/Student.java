package com.base.model.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("student")
public class Student implements Serializable{

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    private String name;
    private Integer age;
    private Integer sex;
    private Date birthday;

}

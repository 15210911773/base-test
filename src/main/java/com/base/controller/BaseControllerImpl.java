package com.base.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import lombok.Setter;
import org.springframework.web.bind.annotation.RequestMapping;

@Setter
public class BaseControllerImpl<T> implements BaseController<T>{

    private IService<T> iService;

    @RequestMapping("/get")
    @Override
    public T getById(Integer id) {
        return iService.getById(id);
    }

}

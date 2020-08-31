package com.sto.szdataobject.controller;

import com.sto.szdataobject.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: 屈立轩
 * @Date: 2020-05-20 14:03
 */
@RestController
public class TestController {


    @Autowired
    private DataService  dataService;

    @RequestMapping("/test")
    public void test(){
         int i = dataService.increasePrice();
         System.out.println(i);
    }
}

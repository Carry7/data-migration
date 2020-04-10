package cn.com.agree.datamigration.controller;


import cn.com.agree.datamigration.entity.Accessservicerules;
import cn.com.agree.datamigration.mapper.AccessservicerulesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {


    @Autowired
    AccessservicerulesMapper accessservicerules;

    @GetMapping("/emp/test")
    public List<Accessservicerules> getTest(){
       // List<Accessservicerules> list = accessservicerules.getTest();
        return accessservicerules.getTest();
    }
}

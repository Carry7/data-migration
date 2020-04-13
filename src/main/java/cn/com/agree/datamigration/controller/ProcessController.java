package cn.com.agree.datamigration.controller;

import cn.com.agree.datamigration.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ProcessController {

    @Autowired
    ProcessService processService;

    /**
     * 对私客户联系信息差异
     */
    @PostMapping("/ciscontact")
    public void ciscontact(@RequestBody Map<String,String> data){
        int threadTotal = Integer.valueOf(data.get("threadTotal"));
        for(int i=0;i<threadTotal;i++){
            processService.CisContactInfoDiff(threadTotal,i);
        }
    }

}

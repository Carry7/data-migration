package cn.com.agree.datamigration.controller;

import cn.com.agree.datamigration.service.ProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ProcessController {

    @Autowired
    ProcessService processService;

    /**
     * 对私客户联系信息差异
     * @param request
     */
    @PostMapping("/ciscontact")
    public void ciscontact(HttpServletRequest request){
        String threadTotal = "1";
        processService.CisContactInfoDiff(threadTotal);
    }
}

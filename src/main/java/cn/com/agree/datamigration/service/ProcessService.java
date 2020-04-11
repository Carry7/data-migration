package cn.com.agree.datamigration.service;

import cn.com.agree.datamigration.mapper.CiscusttelwayinterimMapper;
import cn.com.agree.datamigration.process.CisContactProcess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: ASUS
 * @date: 2020/4/11 10:55
 * @projectName: data-migration
 *
 */
@Service
public class ProcessService {

    @Autowired
    CiscusttelwayinterimMapper ciscusttelwayinterimMapper;

    /**
     * 对私联系信息差异数据
     * @param threadTotal
     */
   public void CisContactInfoDiff(String threadTotal){
           int thread = Integer.valueOf(threadTotal);
           for(int i=0;i<thread;i++) {
               CisContactProcess CisContactProcess = new CisContactProcess(threadTotal, String.valueOf(i), ciscusttelwayinterimMapper);
               new Thread(CisContactProcess).start();
           }
   }
}

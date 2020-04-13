package cn.com.agree.datamigration.service;

import cn.com.agree.datamigration.entity.Ciscusttelwayinterim;
import cn.com.agree.datamigration.mapper.CiscusttelwayinterimMapper;
import cn.com.agree.datamigration.process.CisContactProcess;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: ASUS
 * @date: 2020/4/11 10:55
 * @projectName: data-migration
 *
 */
@Service

public class ProcessService {
    private static Logger logger = Logger.getLogger(ProcessService.class);

    @Autowired
    CiscusttelwayinterimMapper ciscusttelwayinterimMapper;

    /**
     * 对私联系信息差异数据
     * @param threadTotal
     */
    @Async
   public void CisContactInfoDiff(int threadTotal,int threadNum){
       // logger.info("当前线程编号："+threadNum);
        List<String> cis = ciscusttelwayinterimMapper.getCustno(threadTotal,threadNum);
       // logger.info(cis.toString());
        for(int i=0;i<cis.size();i++){
            List<Ciscusttelwayinterim> ciscusttelwayinterimByCustno = ciscusttelwayinterimMapper.getCiscusttelwayinterimByCustno(cis.get(i));
            logger.info("当前线程编号："+ciscusttelwayinterimByCustno.toString());
        }
      //  logger.info(cis.toString());
   }
}

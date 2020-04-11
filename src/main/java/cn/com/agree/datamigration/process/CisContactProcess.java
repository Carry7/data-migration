package cn.com.agree.datamigration.process;

import cn.com.agree.datamigration.entity.Ciscusttelwayinterim;
import cn.com.agree.datamigration.mapper.CiscusttelwayinterimMapper;

import java.util.List;

/**
 * @author: ASUS
 * @date: 2020/4/11 10:58
 * @projectName: data-migration
 *
 * 个人客户联系临时信息处理
 */
public class CisContactProcess implements Runnable{

    // 当前线程编号
    private String threadNum;

    private CiscusttelwayinterimMapper CiscusttelwayinterimMapper;

    //线程个数
    private String threadTotal;

    public CisContactProcess(String threadTotal,String threadNum,CiscusttelwayinterimMapper CiscusttelwayinterimMapper){
        this.threadTotal = threadTotal;
        this.threadNum = threadNum;
        this.CiscusttelwayinterimMapper = CiscusttelwayinterimMapper;
    }

    @Override
    public void run() {
        System.out.println("当前线程编号："+threadNum);
        System.out.println("线程个数："+threadTotal);
        List<Ciscusttelwayinterim>  cis = CiscusttelwayinterimMapper.getCustno(threadTotal,threadNum);
        System.out.println(cis);
    }
}

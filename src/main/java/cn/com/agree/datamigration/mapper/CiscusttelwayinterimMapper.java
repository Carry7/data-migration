package cn.com.agree.datamigration.mapper;

import cn.com.agree.datamigration.entity.Ciscusttelwayinterim;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: ASUS
 * @date: 2020/4/11 13:04
 * @projectName: data-migration
 *
 * 个人客户联系临时信息处理
 */
@Mapper
public interface CiscusttelwayinterimMapper {

    @Select("select custno from (select distinct custno from aecip_cif_cispersoninterim) where mod(custno,#{threadTotal}) = #{threadNum}")
    public List<String > getCustno(@Param("threadTotal") int threadTotal, @Param("threadNum") int threadNum);

    @Select("select * from aecip_cif_cispersoninterim where custno=#{custno}")
    public List<Ciscusttelwayinterim> getCiscusttelwayinterimByCustno(@Param("custno") String custno);
}

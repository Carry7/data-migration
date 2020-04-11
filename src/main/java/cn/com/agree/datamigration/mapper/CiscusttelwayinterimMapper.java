package cn.com.agree.datamigration.mapper;

import cn.com.agree.datamigration.entity.Ciscusttelwayinterim;
import org.apache.ibatis.annotations.Mapper;
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
    public List<Ciscusttelwayinterim> getCustno(String threadTotal, String threadNum);
}

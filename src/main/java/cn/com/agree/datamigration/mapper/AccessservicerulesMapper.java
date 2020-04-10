package cn.com.agree.datamigration.mapper;

import cn.com.agree.datamigration.entity.Accessservicerules;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccessservicerulesMapper {
    @Select("select * from aecip_ipc_accessservicerules ")
    public List<Accessservicerules> getTest();

    @Select("select * from aecip_ipc_accessservicerules where merchandisecode=2019120399900001622 ")
    public Accessservicerules getByCode();
}

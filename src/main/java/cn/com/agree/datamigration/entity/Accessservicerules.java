package cn.com.agree.datamigration.entity;

import lombok.Data;

@Data
public class Accessservicerules {
    public String merchandisecode;
    public String merchandisename;
    public String process_node;
    public String ruleno;
    public String prelogical_connector;
    public String sourcecontainer;
    public String colname;
    public String judgecondition;
    public String conditional_value;
    public String backlogical_connector;
    public String creator;
    public String createtime;
    public String modifier;
    public String modifytime;
    public String deleter;
    public String deletetime;
    public String status;
    public String table_version;
    public String delete_tag;
}

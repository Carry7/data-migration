package cn.com.agree.datamigration.entity;

import lombok.Data;

/**
 * @author: ASUS
 * @date: 2020/4/11 12:31
 * @projectName: data-migration
 *
 * 个人客户联系临时信息表
 */
@Data
public class Ciscusttelwayinterim {

    private String custno;             //客户号
    private String systemcode;         //源系统
    private String permaddr;         //户籍地址
    private String residaddr;       //住宅地址
    private String residaddrzip;     //住宅地址邮政编码
    private String unitaddr;        //单位地址
    private String unitaddrzip;     //单位地址邮政编码
    private String postaddr;       //通讯地址
    private String postaddrzip;     //通讯地址邮政编码
    private String residtelno;      //住址电话
    private String unittelno;      //单位电话
    private String telephone;      //手机号码
    private String reservephone;   //备用手机号
    private String fax;          //传真号码
    private String email;        //电子邮箱
    private String facephone;    //面签预留手机号
}

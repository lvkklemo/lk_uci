package com.gedu.domain;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

@Data
public class Friend {
    /**
     * ID
     */
    private Integer id;

    /**
     * 职位名称
     */
    private  String jobname;

    /**
     * 薪资范围
     */
    private  String salary;

    /**
     * 经验要求
     */
    private  String condition;

    /**
     * 学历要求
     */
    private  String education;

    /**
     * 任职方式
     */
    private  String type;

    /**
     * 办公地址
     */
    private  String address;

    /**
     * 企业ID
     */
    private Integer eid;


    /**
     * 创建日期
     */
    @JSONField(format="yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /**
     * 状态
     */
    private  String state;

    /**
     * 网址
     */
    private  String url;

    /**
     * 标签
     */
    private  String label;

    /**
     * 职位描述
     */
    private  String content1;

    /**
     * 职位描述
     */
    private  String content2;
}

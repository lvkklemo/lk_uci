package com.gedu.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
    private  Integer id;
    private  String userName;
    private Integer age;
    private  String vipNumber;
}

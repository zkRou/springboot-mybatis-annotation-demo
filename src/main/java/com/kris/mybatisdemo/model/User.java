package com.kris.mybatisdemo.model;

import lombok.Data;

/**
 * 用户对象
 *
 * @author Kairou Zeng on 2019-03-16.
 */
@Data
public class User {

    private Long id;

    private String username;

    private int age;
}

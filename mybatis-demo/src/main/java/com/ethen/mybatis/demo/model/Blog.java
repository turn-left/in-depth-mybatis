package com.ethen.mybatis.demo.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * model blog
 *
 * @author ethenyang@126.com
 * @since 2022/11/04
 */
@Getter
@Setter
@ToString
public class Blog {
    private int id;

    private String title;

    private String content;
}

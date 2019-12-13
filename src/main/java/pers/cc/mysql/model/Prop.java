package pers.cc.mysql.model;

import lombok.Data;

/**
 * @description:
 * @author: haochencheng
 * @create: 2019-12-13 22:09
 **/
@Data
public class Prop<T> {

    private String key;

    private T value;

    private String type;

    private String length;

}

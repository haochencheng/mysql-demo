package pers.cc.mysql.model;

import lombok.Data;

import java.util.List;

/**
 * @description:
 * @author: haochencheng
 * @create: 2019-12-13 21:16
 **/
@Data
public class Table {

    private String tableName;

    private Prop id;
    private String idType;

    private List<Row> rowList;


}

package pers.cc.mysql.model;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: haochencheng
 * @create: 2019-12-12 14:26
 **/
public class Data {

    private Map<String,String> data=new HashMap<String, String>();

    private void setData(String key,String name){
        data.put(key, name);
    }

    private void getData(String key){
        data.get(key);
    }

}

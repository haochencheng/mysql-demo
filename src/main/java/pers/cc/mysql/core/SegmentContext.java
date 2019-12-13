package pers.cc.mysql.core;

import pers.cc.mysql.model.Segment;

import java.util.HashMap;

/**
 * @description:
 * @author: haochencheng
 * @create: 2019-12-12 14:32
 **/
public class SegmentContext {

    private HashMap<String, Segment> segmentHashMap=new HashMap<String, Segment>();


    private void setSegment(String key,Segment segment){
        segmentHashMap.put(key, segment);
    }

    private Segment getSegment(String key){
        return segmentHashMap.get(key);
    }

}

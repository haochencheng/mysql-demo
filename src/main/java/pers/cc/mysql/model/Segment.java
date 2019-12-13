package pers.cc.mysql.model;

import pers.cc.mysql.model.Data;

/**
 * @description:
 * @author: haochencheng
 * @create: 2019-12-12 14:19
 **/
public class Segment {

    /**
     * 行号
     */
    private int rowId;

    /**
     * 事物id
     */
    private int trxId;

    /**
     * 回滚id
     */
    private int rollId;

    private Data data;

    public int getRowId() {
        return rowId;
    }

    public void setRowId(int rowId) {
        this.rowId = rowId;
    }

    public int getTrxId() {
        return trxId;
    }

    public void setTrxId(int trxId) {
        this.trxId = trxId;
    }

    public int getRollId() {
        return rollId;
    }

    public void setRollId(int rollId) {
        this.rollId = rollId;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}

package com.hjc.model;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/30
 * Time: 15:17
 * To change this template use File | Settings | File Templates.
 */
public class Goods {
    private int     gooId;
    private String  gooName;
    private int     goomaxNum;
    private int     goominNum;
    private int     gooCount;
    private String  gooInfo;
    private String  gooAuthor;
    private String  gooGroup;

    @Override
    public String toString() {
        return "Goods{" +
                "gooId=" + gooId +
                ", gooName='" + gooName + '\'' +
                ", goomaxNum=" + goomaxNum +
                ", goominNum=" + goominNum +
                ", gooCount=" + gooCount +
                ", gooInfo='" + gooInfo + '\'' +
                ", gooAuthor='" + gooAuthor + '\'' +
                ", gooGroup='" + gooGroup + '\'' +
                '}';
    }

    public int getGooId() {
        return gooId;
    }

    public void setGooId(int gooId) {
        this.gooId = gooId;
    }

    public String getGooName() {
        return gooName;
    }

    public void setGooName(String gooName) {
        this.gooName = gooName;
    }

    public int getGoomaxNum() {
        return goomaxNum;
    }

    public void setGoomaxNum(int goomaxNum) {
        this.goomaxNum = goomaxNum;
    }

    public int getGoominNum() {
        return goominNum;
    }

    public void setGoominNum(int goominNum) {
        this.goominNum = goominNum;
    }

    public int getGooCount() {
        return gooCount;
    }

    public void setGooCount(int gooCount) {
        this.gooCount = gooCount;
    }

    public String getGooInfo() {
        return gooInfo;
    }

    public void setGooInfo(String gooInfo) {
        this.gooInfo = gooInfo;
    }

    public String getGooAuthor() {
        return gooAuthor;
    }

    public void setGooAuthor(String gooAuthor) {
        this.gooAuthor = gooAuthor;
    }

    public String getGooGroup() {
        return gooGroup;
    }

    public void setGooGroup(String gooGroup) {
        this.gooGroup = gooGroup;
    }
}

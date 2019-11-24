package com.hjc.model;

/**
 * Created by IntelliJ IDEA.
 * User: HJC
 * Date: 2019/10/23
 * Time: 16:07
 * To change this template use File | Settings | File Templates.
 */
public class Init_info {
    private int id;
    private String name;
    private int uid;
    private int pid;
    private int sid;
    private String password;
    private String area;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Init_info{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uid=" + uid +
                ", pid=" + pid +
                ", sid=" + sid +
                ", password='" + password + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}

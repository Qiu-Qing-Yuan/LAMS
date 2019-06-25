/**
 * 管理员操作类
 * 主要用于在系统中对管理员的各种操作
 */
package com.zysns.main;

import java.util.Date;

public class Manager {
    private String mno;  //管理员工号
    private String mname;    //管理员姓名
    private String mpassword;    //管理员密码
    private String msex;    //管理员性别
    private Date mdirthday;    //管理员出生日期
    private String mdept;    //管理员所属部门
    private String mlead;    //管理员领导
    private int mlevel;    //管理员等级

    //无参构造
    public Manager() {
    }

    //有参构造
    public Manager(String mno, String mname, String mpassword, String msex, Date mdirthday, String mdept, String mlead, int mlevel) {
        this.mno = mno;
        this.mname = mname;
        this.mpassword = mpassword;
        this.msex = msex;
        this.mdirthday = mdirthday;
        this.mdept = mdept;
        this.mlead = mlead;
        this.mlevel = mlevel;
    }

    public String getMno() {
        return mno;
    }

    public void setMno(String mno) {
        this.mno = mno;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMpassword() {
        return mpassword;
    }

    public void setMpassword(String mpassword) {
        this.mpassword = mpassword;
    }

    public String getMsex() {
        return msex;
    }

    public void setMsex(String msex) {
        this.msex = msex;
    }

    public Date getMdirthday() {
        return mdirthday;
    }

    public void setMdirthday(Date mdirthday) {
        this.mdirthday = mdirthday;
    }

    public String getMdept() {
        return mdept;
    }

    public void setMdept(String mdept) {
        this.mdept = mdept;
    }

    public String getMlead() {
        return mlead;
    }

    public void setMlead(String mlead) {
        this.mlead = mlead;
    }

    public int getMlevel() {
        return mlevel;
    }

    public void setMlevel(int mlevel) {
        this.mlevel = mlevel;
    }

}

package com.jinggan.dear.storage.database.Entity;

/**
 * @Package: com.jinggan.dear.storage.database.Entity
 * @Description: 数据库实体类 基类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 14:17
 * @version: V1.0
 */
public class BaseDatabaseEntity {

    public String tableVer;

    public int id;

    public int revInt0;
    public int revInt1;
    public int revInt2;
    public int revInt3;

    public String  revStr0;
    public String  revStr1;
    public String  revStr2;
    public String  revStr3;

    public String getTableVer() {
        return tableVer;
    }

    public void setTableVer(String tableVer) {
        this.tableVer = tableVer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRevInt0() {
        return revInt0;
    }

    public void setRevInt0(int revInt0) {
        this.revInt0 = revInt0;
    }

    public int getRevInt1() {
        return revInt1;
    }

    public void setRevInt1(int revInt1) {
        this.revInt1 = revInt1;
    }

    public int getRevInt2() {
        return revInt2;
    }

    public void setRevInt2(int revInt2) {
        this.revInt2 = revInt2;
    }

    public int getRevInt3() {
        return revInt3;
    }

    public void setRevInt3(int revInt3) {
        this.revInt3 = revInt3;
    }

    public String getRevStr0() {
        return revStr0;
    }

    public void setRevStr0(String revStr0) {
        this.revStr0 = revStr0;
    }

    public String getRevStr1() {
        return revStr1;
    }

    public void setRevStr1(String revStr1) {
        this.revStr1 = revStr1;
    }

    public String getRevStr2() {
        return revStr2;
    }

    public void setRevStr2(String revStr2) {
        this.revStr2 = revStr2;
    }

    public String getRevStr3() {
        return revStr3;
    }

    public void setRevStr3(String revStr3) {
        this.revStr3 = revStr3;
    }
}

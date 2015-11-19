package com.jinggan.dear.storage.database.Entity;

/**
 * @Package: com.jinggan.dear.storage.database.Entity
 * @Description: 聊天信息表实体类
 * @author: Aaron
 * @date: 2015-11-19
 * @Time: 14:20
 * @version: V1.0
 */
public class ChatDataBaseEntity extends BaseDatabaseEntity {

    public int fromUid;
    public int toUid;
    public String nick;
    public int sex;
    public String message;
    public int type;
    public long createTime;
    public int status;
    public int messageLocalId;
    public int messageServeId;
    public int des;
    public int progress;

    public int getFromUid() {
        return fromUid;
    }

    public void setFromUid(int fromUid) {
        this.fromUid = fromUid;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public int getToUid() {
        return toUid;
    }

    public void setToUid(int toUid) {
        this.toUid = toUid;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getMessageLocalId() {
        return messageLocalId;
    }

    public void setMessageLocalId(int messageLocalId) {
        this.messageLocalId = messageLocalId;
    }

    public int getMessageServeId() {
        return messageServeId;
    }

    public void setMessageServeId(int messageServeId) {
        this.messageServeId = messageServeId;
    }

    public int getDes() {
        return des;
    }

    public void setDes(int des) {
        this.des = des;
    }
}

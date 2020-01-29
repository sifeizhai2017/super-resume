package com.resume.pojo;

import java.math.BigInteger;
import java.sql.Date;

/**
 * 和单封简历邮件有关的类
 *
 * @author danny
 * @date 2020/1/29
 */
public class Resume {
    private BigInteger id;
    private String username;
    private String company;
    private Date sendTime;
    private Date receiveTime;
    private boolean read;

    public Resume() { }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public boolean getRead() {
        return read;
    }

    public void setRead(boolean read) {
        this.read = read;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Resume{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", sendTime=").append(sendTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", read=").append(read);
        sb.append('}');
        return sb.toString();
    }
}
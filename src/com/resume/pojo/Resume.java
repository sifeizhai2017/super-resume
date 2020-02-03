package com.resume.pojo;

import java.math.BigInteger;
import java.util.Date;

/**
 * 和单封简历邮件有关的类
 *
 * @author danny
 * @date 2020/1/29
 */
public class Resume {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.id
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.username
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.company
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private String company;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.position
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private String position;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.from_address
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private String fromAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.to_address
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private String toAddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.send_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private Date sendTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.receive_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private Date receiveTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.interview_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private Date interviewTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.is_read
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private Byte isRead;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.gmt_create
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private Date gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resume.gmt_modified
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    private Date gmtModified;

    public Resume() {
    }

    public Resume(String username, String company) {
        this.username = username;
        this.company = company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.id
     *
     * @return the value of resume.id
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.id
     *
     * @param id the value for resume.id
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.username
     *
     * @return the value of resume.username
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.username
     *
     * @param username the value for resume.username
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.company
     *
     * @return the value of resume.company
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public String getCompany() {
        return company;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.company
     *
     * @param company the value for resume.company
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.position
     *
     * @return the value of resume.position
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public String getPosition() {
        return position;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.position
     *
     * @param position the value for resume.position
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.from_address
     *
     * @return the value of resume.from_address
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public String getFromAddress() {
        return fromAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.from_address
     *
     * @param fromAddress the value for resume.from_address
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setFromAddress(String fromAddress) {
        this.fromAddress = fromAddress == null ? null : fromAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.to_address
     *
     * @return the value of resume.to_address
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public String getToAddress() {
        return toAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.to_address
     *
     * @param toAddress the value for resume.to_address
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setToAddress(String toAddress) {
        this.toAddress = toAddress == null ? null : toAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.send_time
     *
     * @return the value of resume.send_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.send_time
     *
     * @param sendTime the value for resume.send_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.receive_time
     *
     * @return the value of resume.receive_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public Date getReceiveTime() {
        return receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.receive_time
     *
     * @param receiveTime the value for resume.receive_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.interview_time
     *
     * @return the value of resume.interview_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public Date getInterviewTime() {
        return interviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.interview_time
     *
     * @param interviewTime the value for resume.interview_time
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setInterviewTime(Date interviewTime) {
        this.interviewTime = interviewTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.is_read
     *
     * @return the value of resume.is_read
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public Byte getIsRead() {
        return isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.is_read
     *
     * @param isRead the value for resume.is_read
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setIsRead(Byte isRead) {
        this.isRead = isRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.gmt_create
     *
     * @return the value of resume.gmt_create
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.gmt_create
     *
     * @param gmtCreate the value for resume.gmt_create
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resume.gmt_modified
     *
     * @return the value of resume.gmt_modified
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resume.gmt_modified
     *
     * @param gmtModified the value for resume.gmt_modified
     *
     * @mbg.generated Sun Feb 02 18:03:42 CST 2020
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Resume{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append(", position='").append(position).append('\'');
        sb.append(", fromAddress='").append(fromAddress).append('\'');
        sb.append(", toAddress='").append(toAddress).append('\'');
        sb.append(", sendTime=").append(sendTime);
        sb.append(", receiveTime=").append(receiveTime);
        sb.append(", interviewTime=").append(interviewTime);
        sb.append(", isRead=").append(isRead);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append('}');
        return sb.toString();
    }
}

package com.wangz.springBoot.bean;

import java.util.Date;

/**
 * 愿望清单
 * @author wangz
 * @date 2018-03-26
 */
public class WishList {

    /* 主键id */
    private String id;

    /* 名称 */
    private String name;

    /* 来源 */
    private String source;

    /* 生成时间 */
    private Date createTime;

    /* 生成价格 */
    private Double createPrice;

    /* 更新时间 */
    private Date updateTime;

    /* 更新价格 */
    private Double updatePrice;

    /* 状态 0关闭，1进行中，2已完成 */
    private int status;

    /* 是否有效 0有效，1失效 */
    private int isDelete;

    /* 关联用户 */
    private String userId;

    private User user;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Double getCreatePrice() {
        return createPrice;
    }

    public void setCreatePrice(Double createPrice) {
        this.createPrice = createPrice;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Double getUpdatePrice() {
        return updatePrice;
    }

    public void setUpdatePrice(Double updatePrice) {
        this.updatePrice = updatePrice;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

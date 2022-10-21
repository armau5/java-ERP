package org.fly.base.data;

import java.util.Date;

public class BaseTO {

    private Date createDate;
    private String createBy;
    private String deleteBy;
    private String updateBy;
    private int version;

    public Date getCreateDate() {
        return createDate;
    }

    public BaseTO setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public String getCreateBy() {
        return createBy;
    }

    public BaseTO setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public String getDeleteBy() {
        return deleteBy;
    }

    public BaseTO setDeleteBy(String deleteBy) {
        this.deleteBy = deleteBy;
        return this;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public BaseTO setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
        return this;
    }

    public int getVersion() {
        return version;
    }

    public BaseTO setVersion(int version) {
        this.version = version;
        return this;
    }
}

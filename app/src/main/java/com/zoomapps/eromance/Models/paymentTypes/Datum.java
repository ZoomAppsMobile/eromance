
package com.zoomapps.eromance.Models.paymentTypes;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class Datum {

    @SerializedName("amount")
    private Integer mAmount;
    @SerializedName("created_at")
    private String mCreatedAt;
    @SerializedName("id")
    private Integer mId;
    @SerializedName("is_income")
    private Boolean mIsIncome;
    @SerializedName("key")
    private String mKey;
    @SerializedName("updated_at")
    private String mUpdatedAt;
    @SerializedName("value")
    private String mValue;

    public Integer getAmount() {
        return mAmount;
    }

    public void setAmount(Integer amount) {
        mAmount = amount;
    }

    public String getCreatedAt() {
        return mCreatedAt;
    }

    public void setCreatedAt(String createdAt) {
        mCreatedAt = createdAt;
    }

    public Integer getId() {
        return mId;
    }

    public void setId(Integer id) {
        mId = id;
    }

    public Boolean getIsIncome() {
        return mIsIncome;
    }

    public void setIsIncome(Boolean isIncome) {
        mIsIncome = isIncome;
    }

    public String getKey() {
        return mKey;
    }

    public void setKey(String key) {
        mKey = key;
    }

    public String getUpdatedAt() {
        return mUpdatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        mUpdatedAt = updatedAt;
    }

    public String getValue() {
        return mValue;
    }

    public void setValue(String value) {
        mValue = value;
    }

}

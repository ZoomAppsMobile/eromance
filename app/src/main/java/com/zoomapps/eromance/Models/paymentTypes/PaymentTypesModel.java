
package com.zoomapps.eromance.Models.paymentTypes;

import java.util.List;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class PaymentTypesModel {

    @SerializedName("code")
    private Long mCode;
    @SerializedName("data")
    private List<Datum> mData;

    public Long getCode() {
        return mCode;
    }

    public void setCode(Long code) {
        mCode = code;
    }

    public List<Datum> getData() {
        return mData;
    }

    public void setData(List<Datum> data) {
        mData = data;
    }

}

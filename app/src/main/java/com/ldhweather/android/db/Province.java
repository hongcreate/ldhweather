package com.ldhweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by LDH on 2020/2/26.
 */

public class Province extends DataSupport{
    private int id;
    private String provincename;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}

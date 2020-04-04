package com.example.coolweather.db;

import org.litepal.crud.LitePalSupport;

/**
 * author : HoltChas
 * time   : 2020/04/04
 * description:
 */
public class Province extends LitePalSupport {
    private int id;
    private String provinceName;
    private int proVinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProVinceCode() {
        return proVinceCode;
    }

    public void setProVinceCode(int proVinceCode) {
        this.proVinceCode = proVinceCode;
    }
}

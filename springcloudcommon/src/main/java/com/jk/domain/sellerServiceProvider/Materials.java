package com.jk.domain.sellerServiceProvider;

import com.jk.util.PageUtil;

import java.io.Serializable;

public class Materials extends PageUtil implements Serializable {
    private static final long serialVersionUID = -2588103702546803820L;

    private String materialsId;
    private String materialsName;
    private String materialsChannel;
    private String materialsTime;
    private String materialsOperate;

    public String getMaterialsId() {
        return materialsId;
    }

    public void setMaterialsId(String materialsId) {
        this.materialsId = materialsId;
    }

    public String getMaterialsName() {
        return materialsName;
    }

    public void setMaterialsName(String materialsName) {
        this.materialsName = materialsName;
    }

    public String getMaterialsChannel() {
        return materialsChannel;
    }

    public void setMaterialsChannel(String materialsChannel) {
        this.materialsChannel = materialsChannel;
    }

    public String getMaterialsTime() {
        return materialsTime;
    }

    public void setMaterialsTime(String materialsTime) {
        this.materialsTime = materialsTime;
    }

    public String getMaterialsOperate() {
        return materialsOperate;
    }

    public void setMaterialsOperate(String materialsOperate) {
        this.materialsOperate = materialsOperate;
    }
}

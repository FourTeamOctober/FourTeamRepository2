package com.jk.domain.user;

import java.io.Serializable;

public class User  implements Serializable {
    private static final long serialVersionUID = 9110335048267610702L;

    private  String   ss;
    private  String   userName;
    private  String   userSex;
    private  String   userDesc;

    /**
     * 赵世雄
     * @return
     */

    public String getSs() {
        return ss;
    }

    public void setSs(String ss) {
        this.ss = ss;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public String getUserDesc() {
        return userDesc;
    }

    public void setUserDesc(String userDesc) {
        this.userDesc = userDesc;
    }
}

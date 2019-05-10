package com.zdran.onemall.user.provider.bo;

/**
 * Create by ranzd on 2019/5/10
 *
 * @author cm.zdran@gmail.com
 */
public class UserInfoBO {
    /**
     * 用户名
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * 余额
     */
    private long balanace;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getBalanace() {
        return balanace;
    }

    public void setBalanace(long balanace) {
        this.balanace = balanace;
    }
}

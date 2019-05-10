package com.zdran.onemall.user.provider.biz;

/**
 * Create by ranzd on 2019/5/10
 *
 * @author ranzd@chinaunicom.cn
 */
public interface UserInfoBiz {
    /**
     * 修改用户名
     *
     * @param name
     */
    void changeName(String name);

    /**
     * 修改密码
     *
     * @param pwd
     */
    void changePwd(String pwd);

    /**
     * 充值
     *
     * @param money
     */
    void deposit(long money);

    /**
     * 支付
     *
     * @param money
     */
    void payment(long money);

}

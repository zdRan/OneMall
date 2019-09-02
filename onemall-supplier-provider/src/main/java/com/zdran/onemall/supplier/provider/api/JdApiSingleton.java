package com.zdran.onemall.supplier.provider.api;

import com.alibaba.fastjson.JSONObject;
import com.zdran.onemall.common.dto.GoodsDTO;
import com.zdran.onemall.common.dto.OrderDTO;
import com.zdran.onemall.common.utils.HttpClientUtil;

import java.util.Map;

/**
 * 单例模式（Singleton 实体类）
 * <p>
 * 封装 JD 相关的API。
 * <p>
 * Create by ranzd on 2019/9/2
 *
 * @author cm.zdran@gmail.com
 */
public class JdApiSingleton {
    private static final JdApiSingleton self = new JdApiSingleton();

    private JdApiSingleton() {
    }

    public static JdApiSingleton getJdApi() {
        return self;
    }

    /**
     * 获取商品信息
     *
     * @param url   地址
     * @param param 参数
     * @return 商品实体
     */
    public static GoodsDTO getGoodsInfo(String url, Map<String, Object> param) {
        String result = HttpClientUtil.get(url, param);
        return JSONObject.parseObject(result, GoodsDTO.class);
    }

    /**
     * 提交订单
     *
     * @param url   地址
     * @param param 参数
     * @return 订单信息
     */
    public static OrderDTO submitOrder(String url, Map<String, Object> param) {
        String result = HttpClientUtil.post(url, param);
        return JSONObject.parseObject(result, OrderDTO.class);
    }
}

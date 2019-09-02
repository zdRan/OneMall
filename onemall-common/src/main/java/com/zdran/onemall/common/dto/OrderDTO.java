package com.zdran.onemall.common.dto;

import java.util.List;
import java.util.Map;

/**
 * 订单信息的数据传输模型
 * Create by ranzd on 2019/8/29
 *
 * @author cm.zdran@gmail.com
 */
public class OrderDTO {
    /**
     * 订单号(供应商订单号)
     */
    private String orderId;
    /**
     * 子订单号(供应商订单号)
     */
    private String orderSubId;
    /**
     * 内部订单号(OneMall内部订单号)
     */
    private String insideOrderId;
    /**
     * 订单价格
     */
    private Integer orderPrice;
    /**
     * 订单运费
     */
    private Integer freight;
    /**
     * 订单中 sku-count 的对应关系
     */
    private Map<String, Integer> skuCount;
    /**
     * 订单状态
     */
    private String orderState;
    /**
     * 订单日期： yyyyMMdd
     */
    private String orderDate;
    /**
     * 订单时间：yyyyMMddHHmmss
     */
    private String orderTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderSubId() {
        return orderSubId;
    }

    public void setOrderSubId(String orderSubId) {
        this.orderSubId = orderSubId;
    }

    public String getInsideOrderId() {
        return insideOrderId;
    }

    public void setInsideOrderId(String insideOrderId) {
        this.insideOrderId = insideOrderId;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Map<String, Integer> getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Map<String, Integer> skuCount) {
        this.skuCount = skuCount;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"orderId\":\"")
                .append(orderId).append('\"');
        sb.append(",\"orderSubId\":\"")
                .append(orderSubId).append('\"');
        sb.append(",\"insideOrderId\":\"")
                .append(insideOrderId).append('\"');
        sb.append(",\"orderPrice\":")
                .append(orderPrice);
        sb.append(",\"freight\":")
                .append(freight);
        sb.append(",\"skuCount\":")
                .append(skuCount);
        sb.append(",\"orderState\":\"")
                .append(orderState).append('\"');
        sb.append(",\"orderDate\":\"")
                .append(orderDate).append('\"');
        sb.append(",\"orderTime\":\"")
                .append(orderTime).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

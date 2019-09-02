package com.zdran.onemall.common.dto;

import java.util.Map;

/**
 * 商品信息的数据传输模型
 *
 * Create by ranzd on 2019/8/29
 *
 * @author cm.zdran@gmail.com
 */
public class GoodsDTO {
    /**
     * sku
     */
    private String skuId;
    /**
     * 商品名字
     */
    private String goodsName;
    /**
     * 分类id,如果有多级分类，该id是最后一级分类的id
     */
    private String categoryId;
    /**
     * 商品类型，比如赠品
     */
    private String skuType;
    /**
     * 商品主图url
     */
    private String firstImageUrl;
    /**
     * 商品详情
     */
    private String detail;
    /**
     * 商品售价
     */
    private Integer price;
    /**
     * 商品进价
     */
    private Integer buyPrice;
    /**
     * 是否有效
     */
    private boolean available;
    /**
     * 是否可售
     */
    private boolean saleable;
    /**
     * 扩充其他参数
     */
    private Map<String, Object> expansion;
    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getSkuType() {
        return skuType;
    }

    public void setSkuType(String skuType) {
        this.skuType = skuType;
    }

    public String getFirstImageUrl() {
        return firstImageUrl;
    }

    public void setFirstImageUrl(String firstImageUrl) {
        this.firstImageUrl = firstImageUrl;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isSaleable() {
        return saleable;
    }

    public void setSaleable(boolean saleable) {
        this.saleable = saleable;
    }

    public Map<String, Object> getExpansion() {
        return expansion;
    }

    public void setExpansion(Map<String, Object> expansion) {
        this.expansion = expansion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"skuId\":\"")
                .append(skuId).append('\"');
        sb.append(",\"goodsName\":\"")
                .append(goodsName).append('\"');
        sb.append(",\"categoryId\":\"")
                .append(categoryId).append('\"');
        sb.append(",\"firstImageUrl\":\"")
                .append(firstImageUrl).append('\"');
        sb.append(",\"detail\":\"")
                .append(detail).append('\"');
        sb.append(",\"price\":")
                .append(price);
        sb.append(",\"buyPrice\":")
                .append(buyPrice);
        sb.append(",\"available\":")
                .append(available);
        sb.append(",\"saleable\":")
                .append(saleable);
        sb.append('}');
        return sb.toString();
    }
}

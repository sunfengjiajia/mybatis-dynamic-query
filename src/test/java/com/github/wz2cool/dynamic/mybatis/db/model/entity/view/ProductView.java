package com.github.wz2cool.dynamic.mybatis.db.model.entity.view;

import com.github.wz2cool.dynamic.mybatis.annotation.Column;

import java.math.BigDecimal;

/**
 * Created by Frank on 2017/7/15.
 */
public class ProductView {
    @Column(name = "product_id", tableOrAlias = "product")
    private Long productID;
    @Column(name = "product_name", tableOrAlias = "product")
    private String productName;
    @Column(name = "price", tableOrAlias = "product")
    private BigDecimal price;

    @Column(name = "category_id", tableOrAlias = "category")
    private Long categoryID;
    @Column(name = "category_name", tableOrAlias = "category")
    private String categoryName;
    @Column(name = "description", tableOrAlias = "category")
    private String description;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Long getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Long categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.greatonce.oms.query.product;

import com.greatonce.core.database.Query;
import com.greatonce.oms.domain.enums.product.ProductAttributeType;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 商品属性.
 *
 * @author code-generator
 * @author Shenzhen Greatonce Co Ltd
 * @version 3.0
 */
public class ProductAttributeQuery extends Query {
  /**
   * 属性id.
   */
  private Long attributeId;
  /**
   * 名称.
   */
  private String attributeName;
  /**
   * 属性类型.
   */
  private ProductAttributeType attributeType;
  /**
   * 创建时间开始.
   */
  private LocalDateTime createdTimeBegin;
  /**
   * 创建时间结束.
   */
  private LocalDateTime createdTimeEnd;
  /**
   * 字典id.
   */
  private Long dataDictId;
  /**
   * 字典名称.
   */
  private String dataDictName;
  /**
   * 是否系统.
   */
  private Boolean system;
  /**
   * 是否用于编码生成.
   */
  private Boolean useCode;
  /**
   * 更新时间开始.
   */
  private LocalDateTime modifiedTimeBegin;
  /**
   * 更新时间结束.
   */
  private LocalDateTime modifiedTimeEnd;


  /**
   * 属性id.
   * @param attributeId 属性id
   */
  public void setAttributeId(Long attributeId) {
    this.attributeId = attributeId;
  }

  /**
   * 属性id.
   * @return 属性id
   */
  public Long getAttributeId() {
      return this.attributeId;
  }

  /**
   * 名称.
   * @param attributeName 名称
   */
  public void setAttributeName(String attributeName) {
    this.attributeName = attributeName == null ? null : attributeName.trim();
  }

  /**
   * 名称.
   * @return 名称
   */
  public String getAttributeName() {
      return this.attributeName;
  }

  /**
   * 属性类型.
   * @param attributeType 属性类型
   */
  public void setAttributeType(ProductAttributeType attributeType) {
    this.attributeType = attributeType;
  }

  /**
   * 属性类型.
   * @return 属性类型
   */
  public ProductAttributeType getAttributeType() {
      return this.attributeType;
  }

  /**
   * 创建时间开始.
   * @param createdTimeBegin 开始.
   */
  public void setCreatedTimeBegin(LocalDateTime createdTimeBegin) {
    this.createdTimeBegin = createdTimeBegin;
  }

  /**
   * 创建时间开始.
   * @return 创建时间开始
   */
  public LocalDateTime getCreatedTimeBegin() {
    return this.createdTimeBegin;
  }

  /**
   * 创建时间结束.
   * @param createdTimeEnd 结束
   */
  public void setCreatedTimeEnd(LocalDateTime createdTimeEnd) {
    this.createdTimeEnd = createdTimeEnd;
  }

  /**
   * 创建时间结束.
   * @return 创建时间结束
   */
  public LocalDateTime getCreatedTimeEnd() {
    return this.createdTimeEnd;
  }

  /**
   * 字典id.
   * @param dataDictId 字典id
   */
  public void setDataDictId(Long dataDictId) {
    this.dataDictId = dataDictId;
  }

  /**
   * 字典id.
   * @return 字典id
   */
  public Long getDataDictId() {
      return this.dataDictId;
  }

  /**
   * 字典名称.
   * @param dataDictName 字典名称
   */
  public void setDataDictName(String dataDictName) {
    this.dataDictName = dataDictName == null ? null : dataDictName.trim();
  }

  /**
   * 字典名称.
   * @return 字典名称
   */
  public String getDataDictName() {
      return this.dataDictName;
  }

  /**
   * 是否系统.
   * @param system 是否系统
   */
  public void setSystem(Boolean system) {
    this.system = system;
  }

  /**
   * 是否系统.
   * @return 是否系统
   */
  public Boolean isSystem() {
      return this.system;
  }

  /**
   * 是否用于编码生成.
   * @param useCode 是否用于编码生成
   */
  public void setUseCode(Boolean useCode) {
    this.useCode = useCode;
  }

  /**
   * 是否用于编码生成.
   * @return 是否用于编码生成
   */
  public Boolean isUseCode() {
      return this.useCode;
  }

  /**
   * 更新时间开始.
   * @param modifiedTimeBegin 开始.
   */
  public void setModifiedTimeBegin(LocalDateTime modifiedTimeBegin) {
    this.modifiedTimeBegin = modifiedTimeBegin;
  }

  /**
   * 更新时间开始.
   * @return 更新时间开始
   */
  public LocalDateTime getModifiedTimeBegin() {
    return this.modifiedTimeBegin;
  }

  /**
   * 更新时间结束.
   * @param modifiedTimeEnd 结束
   */
  public void setModifiedTimeEnd(LocalDateTime modifiedTimeEnd) {
    this.modifiedTimeEnd = modifiedTimeEnd;
  }

  /**
   * 更新时间结束.
   * @return 更新时间结束
   */
  public LocalDateTime getModifiedTimeEnd() {
    return this.modifiedTimeEnd;
  }
}
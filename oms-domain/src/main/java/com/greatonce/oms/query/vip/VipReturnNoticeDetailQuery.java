package com.greatonce.oms.query.vip;

import com.greatonce.core.database.Query;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 唯品退供通知单明细.
 *
 * @author code-generator
 * @author Shenzhen Greatonce Co Ltd
 * @version 3.0
 */
public class VipReturnNoticeDetailQuery extends Query {
  /**
   * 创建时间开始.
   */
  private LocalDateTime createdTimeBegin;
  /**
   * 创建时间结束.
   */
  private LocalDateTime createdTimeEnd;
  /**
   * 入库正品数量.
   */
  private Integer inQuantity;
  /**
   * 入库次品数量.
   */
  private Integer inSubstandardQuantity;
  /**
   * 唯品价异常.
   */
  private Boolean vipPriceAbnormal;
  /**
   * 更新时间开始.
   */
  private LocalDateTime modifiedTimeBegin;
  /**
   * 更新时间结束.
   */
  private LocalDateTime modifiedTimeEnd;
  /**
   * 通知数量.
   */
  private Integer noticeQuantity;
  /**
   * 商品编码.
   */
  private String productCode;
  /**
   * .
   */
  private List<String> productCodes;
  /**
   * 商品id.
   */
  private Long productId;
  /**
   * 商品名称.
   */
  private String productName;
  /**
   * 商品规格编码.
   */
  private String skuCode;
  /**
   * .
   */
  private List<String> skuCodes;
  /**
   * 商品规格id.
   */
  private Long skuId;
  /**
   * 商品规格名称.
   */
  private String skuName;
  /**
   * 金额.
   */
  private Double vipAmount;
  /**
   * 唯品价.
   */
  private Double vipPrice;
  /**
   * 唯品退供编码.
   */
  private String vipReturnCode;
  /**
   * 退供单明细id.
   */
  private Long vipReturnDetailId;
  /**
   * 唯品退供单id.
   */
  private Long vipReturnId;
  /**
   * 退供通知单明细id.
   */
  private Long vipReturnNoticeDetailId;
  /**
   * 唯品通知单id.
   */
  private Long vipReturnNoticeId;


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
   * 入库正品数量.
   * @param inQuantity 入库正品数量
   */
  public void setInQuantity(Integer inQuantity) {
    this.inQuantity = inQuantity;
  }

  /**
   * 入库正品数量.
   * @return 入库正品数量
   */
  public Integer getInQuantity() {
      return this.inQuantity;
  }

  /**
   * 入库次品数量.
   * @param inSubstandardQuantity 入库次品数量
   */
  public void setInSubstandardQuantity(Integer inSubstandardQuantity) {
    this.inSubstandardQuantity = inSubstandardQuantity;
  }

  /**
   * 入库次品数量.
   * @return 入库次品数量
   */
  public Integer getInSubstandardQuantity() {
      return this.inSubstandardQuantity;
  }

  /**
   * 唯品价异常.
   * @param vipPriceAbnormal 唯品价异常
   */
  public void setVipPriceAbnormal(Boolean vipPriceAbnormal) {
    this.vipPriceAbnormal = vipPriceAbnormal;
  }

  /**
   * 唯品价异常.
   * @return 唯品价异常
   */
  public Boolean isVipPriceAbnormal() {
      return this.vipPriceAbnormal;
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

  /**
   * 通知数量.
   * @param noticeQuantity 通知数量
   */
  public void setNoticeQuantity(Integer noticeQuantity) {
    this.noticeQuantity = noticeQuantity;
  }

  /**
   * 通知数量.
   * @return 通知数量
   */
  public Integer getNoticeQuantity() {
      return this.noticeQuantity;
  }

  /**
   * 商品编码.
   * @param productCode 商品编码
   */
  public void setProductCode(String productCode) {
    this.productCode = productCode == null ? null : productCode.trim();
  }

  /**
   * 商品编码.
   * @return 商品编码
   */
  public String getProductCode() {
      return this.productCode;
  }

  /**
   * .
   * @param productCodes 
   */
  public void setProductCodes(List<String> productCodes) {
    this.productCodes = productCodes;
  }

  /**
   * .
   * @return 
   */
  public List<String> getProductCodes() {
      return this.productCodes;
  }

  /**
   * 商品id.
   * @param productId 商品id
   */
  public void setProductId(Long productId) {
    this.productId = productId;
  }

  /**
   * 商品id.
   * @return 商品id
   */
  public Long getProductId() {
      return this.productId;
  }

  /**
   * 商品名称.
   * @param productName 商品名称
   */
  public void setProductName(String productName) {
    this.productName = productName == null ? null : productName.trim();
  }

  /**
   * 商品名称.
   * @return 商品名称
   */
  public String getProductName() {
      return this.productName;
  }

  /**
   * 商品规格编码.
   * @param skuCode 商品规格编码
   */
  public void setSkuCode(String skuCode) {
    this.skuCode = skuCode == null ? null : skuCode.trim();
  }

  /**
   * 商品规格编码.
   * @return 商品规格编码
   */
  public String getSkuCode() {
      return this.skuCode;
  }

  /**
   * .
   * @param skuCodes 
   */
  public void setSkuCodes(List<String> skuCodes) {
    this.skuCodes = skuCodes;
  }

  /**
   * .
   * @return 
   */
  public List<String> getSkuCodes() {
      return this.skuCodes;
  }

  /**
   * 商品规格id.
   * @param skuId 商品规格id
   */
  public void setSkuId(Long skuId) {
    this.skuId = skuId;
  }

  /**
   * 商品规格id.
   * @return 商品规格id
   */
  public Long getSkuId() {
      return this.skuId;
  }

  /**
   * 商品规格名称.
   * @param skuName 商品规格名称
   */
  public void setSkuName(String skuName) {
    this.skuName = skuName == null ? null : skuName.trim();
  }

  /**
   * 商品规格名称.
   * @return 商品规格名称
   */
  public String getSkuName() {
      return this.skuName;
  }

  /**
   * 金额.
   * @param vipAmount 金额
   */
  public void setVipAmount(Double vipAmount) {
    this.vipAmount = vipAmount;
  }

  /**
   * 金额.
   * @return 金额
   */
  public Double getVipAmount() {
      return this.vipAmount;
  }

  /**
   * 唯品价.
   * @param vipPrice 唯品价
   */
  public void setVipPrice(Double vipPrice) {
    this.vipPrice = vipPrice;
  }

  /**
   * 唯品价.
   * @return 唯品价
   */
  public Double getVipPrice() {
      return this.vipPrice;
  }

  /**
   * 唯品退供编码.
   * @param vipReturnCode 唯品退供编码
   */
  public void setVipReturnCode(String vipReturnCode) {
    this.vipReturnCode = vipReturnCode == null ? null : vipReturnCode.trim();
  }

  /**
   * 唯品退供编码.
   * @return 唯品退供编码
   */
  public String getVipReturnCode() {
      return this.vipReturnCode;
  }

  /**
   * 退供单明细id.
   * @param vipReturnDetailId 退供单明细id
   */
  public void setVipReturnDetailId(Long vipReturnDetailId) {
    this.vipReturnDetailId = vipReturnDetailId;
  }

  /**
   * 退供单明细id.
   * @return 退供单明细id
   */
  public Long getVipReturnDetailId() {
      return this.vipReturnDetailId;
  }

  /**
   * 唯品退供单id.
   * @param vipReturnId 唯品退供单id
   */
  public void setVipReturnId(Long vipReturnId) {
    this.vipReturnId = vipReturnId;
  }

  /**
   * 唯品退供单id.
   * @return 唯品退供单id
   */
  public Long getVipReturnId() {
      return this.vipReturnId;
  }

  /**
   * 退供通知单明细id.
   * @param vipReturnNoticeDetailId 退供通知单明细id
   */
  public void setVipReturnNoticeDetailId(Long vipReturnNoticeDetailId) {
    this.vipReturnNoticeDetailId = vipReturnNoticeDetailId;
  }

  /**
   * 退供通知单明细id.
   * @return 退供通知单明细id
   */
  public Long getVipReturnNoticeDetailId() {
      return this.vipReturnNoticeDetailId;
  }

  /**
   * 唯品通知单id.
   * @param vipReturnNoticeId 唯品通知单id
   */
  public void setVipReturnNoticeId(Long vipReturnNoticeId) {
    this.vipReturnNoticeId = vipReturnNoticeId;
  }

  /**
   * 唯品通知单id.
   * @return 唯品通知单id
   */
  public Long getVipReturnNoticeId() {
      return this.vipReturnNoticeId;
  }
}
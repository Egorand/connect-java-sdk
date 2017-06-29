/*
 * Square Connect API
 * Client library for accessing the Square Connect APIs
 *
 * OpenAPI spec version: 2.0
 * Contact: developers@squareup.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.squareup.connect.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.squareup.connect.models.CreateOrderRequestDiscount;
import com.squareup.connect.models.CreateOrderRequestLineItem;
import com.squareup.connect.models.CreateOrderRequestTax;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * Defines the parameters that can be included in the body of a request to the [CreateCheckout](#endpoint-createcheckout) endpoint.
 */
@ApiModel(description = "Defines the parameters that can be included in the body of a request to the [CreateCheckout](#endpoint-createcheckout) endpoint.")

public class CreateOrderRequest {
  @JsonProperty("reference_id")
  private String referenceId = null;

  @JsonProperty("line_items")
  private List<CreateOrderRequestLineItem> lineItems = new ArrayList<CreateOrderRequestLineItem>();

  @JsonProperty("taxes")
  private List<CreateOrderRequestTax> taxes = new ArrayList<CreateOrderRequestTax>();

  @JsonProperty("discounts")
  private List<CreateOrderRequestDiscount> discounts = new ArrayList<CreateOrderRequestDiscount>();

  public CreateOrderRequest referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * An optional ID you can associate with the order for your own purposes (such as to associate the order with an entity ID in your own database).  This value cannot exceed 40 characters.
   * @return referenceId
  **/
  @ApiModelProperty(value = "An optional ID you can associate with the order for your own purposes (such as to associate the order with an entity ID in your own database).  This value cannot exceed 40 characters.")
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public CreateOrderRequest lineItems(List<CreateOrderRequestLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  public CreateOrderRequest addLineItemsItem(CreateOrderRequestLineItem lineItemsItem) {
    this.lineItems.add(lineItemsItem);
    return this;
  }

   /**
   * The line items to associate with this order.  Each line item represents a different product (or a custom monetary amount) to include in a purchase.
   * @return lineItems
  **/
  @ApiModelProperty(required = true, value = "The line items to associate with this order.  Each line item represents a different product (or a custom monetary amount) to include in a purchase.")
  public List<CreateOrderRequestLineItem> getLineItems() {
    return lineItems;
  }

  public void setLineItems(List<CreateOrderRequestLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  public CreateOrderRequest taxes(List<CreateOrderRequestTax> taxes) {
    this.taxes = taxes;
    return this;
  }

  public CreateOrderRequest addTaxesItem(CreateOrderRequestTax taxesItem) {
    this.taxes.add(taxesItem);
    return this;
  }

   /**
   * The taxes include the custom taxes.
   * @return taxes
  **/
  @ApiModelProperty(value = "The taxes include the custom taxes.")
  public List<CreateOrderRequestTax> getTaxes() {
    return taxes;
  }

  public void setTaxes(List<CreateOrderRequestTax> taxes) {
    this.taxes = taxes;
  }

  public CreateOrderRequest discounts(List<CreateOrderRequestDiscount> discounts) {
    this.discounts = discounts;
    return this;
  }

  public CreateOrderRequest addDiscountsItem(CreateOrderRequestDiscount discountsItem) {
    this.discounts.add(discountsItem);
    return this;
  }

   /**
   * The discounts include the custom discounts .
   * @return discounts
  **/
  @ApiModelProperty(value = "The discounts include the custom discounts .")
  public List<CreateOrderRequestDiscount> getDiscounts() {
    return discounts;
  }

  public void setDiscounts(List<CreateOrderRequestDiscount> discounts) {
    this.discounts = discounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequest createOrderRequest = (CreateOrderRequest) o;
    return Objects.equals(this.referenceId, createOrderRequest.referenceId) &&
        Objects.equals(this.lineItems, createOrderRequest.lineItems) &&
        Objects.equals(this.taxes, createOrderRequest.taxes) &&
        Objects.equals(this.discounts, createOrderRequest.discounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referenceId, lineItems, taxes, discounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequest {\n");
    
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    lineItems: ").append(toIndentedString(lineItems)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    discounts: ").append(toIndentedString(discounts)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Represents a tax that applies to either a single line item or an entire order.
 */
@ApiModel(description = "Represents a tax that applies to either a single line item or an entire order.")

public class CreateOrderRequestTax {
  @JsonProperty("name")
  private String name = null;

  /**
   * Indicates the calculation method used to apply the line item tax.  Default: `ADDITIVE`; See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values.
   */
  public enum TypeEnum {
    UNKNOWN("UNKNOWN"),
    
    ADDITIVE("ADDITIVE"),
    
    INCLUSIVE("INCLUSIVE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("percentage")
  private String percentage = null;

  public CreateOrderRequestTax name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The tax's name.
   * @return name
  **/
  @ApiModelProperty(value = "The tax's name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateOrderRequestTax type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the calculation method used to apply the line item tax.  Default: `ADDITIVE`; See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values.
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the calculation method used to apply the line item tax.  Default: `ADDITIVE`; See [OrderLineItemTaxType](#type-orderlineitemtaxtype) for possible values.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public CreateOrderRequestTax percentage(String percentage) {
    this.percentage = percentage;
    return this;
  }

   /**
   * The percentage of the tax, as a string representation of a decimal number.  A value of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0
   * @return percentage
  **/
  @ApiModelProperty(value = "The percentage of the tax, as a string representation of a decimal number.  A value of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0")
  public String getPercentage() {
    return percentage;
  }

  public void setPercentage(String percentage) {
    this.percentage = percentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrderRequestTax createOrderRequestTax = (CreateOrderRequestTax) o;
    return Objects.equals(this.name, createOrderRequestTax.name) &&
        Objects.equals(this.type, createOrderRequestTax.type) &&
        Objects.equals(this.percentage, createOrderRequestTax.percentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, percentage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrderRequestTax {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

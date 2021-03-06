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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class ListCatalogRequest {
  @JsonProperty("cursor")
  private String cursor = null;

  @JsonProperty("types")
  private String types = null;

  public ListCatalogRequest cursor(String cursor) {
    this.cursor = cursor;
    return this;
  }

   /**
   * The pagination cursor returned in the previous response. Leave unset for an initial request. See [Paginating results](#paginatingresults) for more information.
   * @return cursor
  **/
  @ApiModelProperty(value = "The pagination cursor returned in the previous response. Leave unset for an initial request. See [Paginating results](#paginatingresults) for more information.")
  public String getCursor() {
    return cursor;
  }

  public void setCursor(String cursor) {
    this.cursor = cursor;
  }

  public ListCatalogRequest types(String types) {
    this.types = types;
    return this;
  }

   /**
   * An optional case-insensitive, comma-separated list of object types to retrieve, for example `ITEM,ITEM_VARIATION,CATEGORY`.  The legal values are taken from the [CatalogObjectType](#type-catalogobjecttype) enumeration, namely `\"ITEM\"`, `\"ITEM_VARIATION\"`, `\"CATEGORY\"`, `\"DISCOUNT\"`, `\"TAX\"`, `\"MODIFIER\"`, or `\"MODIFIER_LIST\"`.
   * @return types
  **/
  @ApiModelProperty(value = "An optional case-insensitive, comma-separated list of object types to retrieve, for example `ITEM,ITEM_VARIATION,CATEGORY`.  The legal values are taken from the [CatalogObjectType](#type-catalogobjecttype) enumeration, namely `\"ITEM\"`, `\"ITEM_VARIATION\"`, `\"CATEGORY\"`, `\"DISCOUNT\"`, `\"TAX\"`, `\"MODIFIER\"`, or `\"MODIFIER_LIST\"`.")
  public String getTypes() {
    return types;
  }

  public void setTypes(String types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListCatalogRequest listCatalogRequest = (ListCatalogRequest) o;
    return Objects.equals(this.cursor, listCatalogRequest.cursor) &&
        Objects.equals(this.types, listCatalogRequest.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cursor, types);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListCatalogRequest {\n");
    
    sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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


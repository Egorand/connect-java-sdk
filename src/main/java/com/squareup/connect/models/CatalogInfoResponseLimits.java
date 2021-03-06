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

public class CatalogInfoResponseLimits {
  @JsonProperty("batch_upsert_max_objects_per_batch")
  private Integer batchUpsertMaxObjectsPerBatch = null;

  @JsonProperty("batch_upsert_max_total_objects")
  private Integer batchUpsertMaxTotalObjects = null;

  @JsonProperty("batch_retrieve_max_object_ids")
  private Integer batchRetrieveMaxObjectIds = null;

  @JsonProperty("search_max_page_limit")
  private Integer searchMaxPageLimit = null;

  @JsonProperty("batch_delete_max_object_ids")
  private Integer batchDeleteMaxObjectIds = null;

  @JsonProperty("update_item_taxes_max_item_ids")
  private Integer updateItemTaxesMaxItemIds = null;

  @JsonProperty("update_item_taxes_max_taxes_to_enable")
  private Integer updateItemTaxesMaxTaxesToEnable = null;

  @JsonProperty("update_item_taxes_max_taxes_to_disable")
  private Integer updateItemTaxesMaxTaxesToDisable = null;

  @JsonProperty("update_item_modifier_lists_max_item_ids")
  private Integer updateItemModifierListsMaxItemIds = null;

  @JsonProperty("update_item_modifier_lists_max_modifier_lists_to_enable")
  private Integer updateItemModifierListsMaxModifierListsToEnable = null;

  @JsonProperty("update_item_modifier_lists_max_modifier_lists_to_disable")
  private Integer updateItemModifierListsMaxModifierListsToDisable = null;

  public CatalogInfoResponseLimits batchUpsertMaxObjectsPerBatch(Integer batchUpsertMaxObjectsPerBatch) {
    this.batchUpsertMaxObjectsPerBatch = batchUpsertMaxObjectsPerBatch;
    return this;
  }

   /**
   * The maximum number of objects that may appear within a single batch in a `/v2/catalog/batch-upsert` request.
   * @return batchUpsertMaxObjectsPerBatch
  **/
  @ApiModelProperty(value = "The maximum number of objects that may appear within a single batch in a `/v2/catalog/batch-upsert` request.")
  public Integer getBatchUpsertMaxObjectsPerBatch() {
    return batchUpsertMaxObjectsPerBatch;
  }

  public void setBatchUpsertMaxObjectsPerBatch(Integer batchUpsertMaxObjectsPerBatch) {
    this.batchUpsertMaxObjectsPerBatch = batchUpsertMaxObjectsPerBatch;
  }

  public CatalogInfoResponseLimits batchUpsertMaxTotalObjects(Integer batchUpsertMaxTotalObjects) {
    this.batchUpsertMaxTotalObjects = batchUpsertMaxTotalObjects;
    return this;
  }

   /**
   * The maximum number of objects that may appear across all batches in a `/v2/catalog/batch-upsert` request.
   * @return batchUpsertMaxTotalObjects
  **/
  @ApiModelProperty(value = "The maximum number of objects that may appear across all batches in a `/v2/catalog/batch-upsert` request.")
  public Integer getBatchUpsertMaxTotalObjects() {
    return batchUpsertMaxTotalObjects;
  }

  public void setBatchUpsertMaxTotalObjects(Integer batchUpsertMaxTotalObjects) {
    this.batchUpsertMaxTotalObjects = batchUpsertMaxTotalObjects;
  }

  public CatalogInfoResponseLimits batchRetrieveMaxObjectIds(Integer batchRetrieveMaxObjectIds) {
    this.batchRetrieveMaxObjectIds = batchRetrieveMaxObjectIds;
    return this;
  }

   /**
   * The maximum number of object IDs that may appear in a `/v2/catalog/batch-retrieve` request.
   * @return batchRetrieveMaxObjectIds
  **/
  @ApiModelProperty(value = "The maximum number of object IDs that may appear in a `/v2/catalog/batch-retrieve` request.")
  public Integer getBatchRetrieveMaxObjectIds() {
    return batchRetrieveMaxObjectIds;
  }

  public void setBatchRetrieveMaxObjectIds(Integer batchRetrieveMaxObjectIds) {
    this.batchRetrieveMaxObjectIds = batchRetrieveMaxObjectIds;
  }

  public CatalogInfoResponseLimits searchMaxPageLimit(Integer searchMaxPageLimit) {
    this.searchMaxPageLimit = searchMaxPageLimit;
    return this;
  }

   /**
   * The maximum number of results that may be returned in a page of a `/v2/catalog/search` response.
   * @return searchMaxPageLimit
  **/
  @ApiModelProperty(value = "The maximum number of results that may be returned in a page of a `/v2/catalog/search` response.")
  public Integer getSearchMaxPageLimit() {
    return searchMaxPageLimit;
  }

  public void setSearchMaxPageLimit(Integer searchMaxPageLimit) {
    this.searchMaxPageLimit = searchMaxPageLimit;
  }

  public CatalogInfoResponseLimits batchDeleteMaxObjectIds(Integer batchDeleteMaxObjectIds) {
    this.batchDeleteMaxObjectIds = batchDeleteMaxObjectIds;
    return this;
  }

   /**
   * The maximum number of object IDs that may be included in a single `/v2/catalog/batch-delete` request.
   * @return batchDeleteMaxObjectIds
  **/
  @ApiModelProperty(value = "The maximum number of object IDs that may be included in a single `/v2/catalog/batch-delete` request.")
  public Integer getBatchDeleteMaxObjectIds() {
    return batchDeleteMaxObjectIds;
  }

  public void setBatchDeleteMaxObjectIds(Integer batchDeleteMaxObjectIds) {
    this.batchDeleteMaxObjectIds = batchDeleteMaxObjectIds;
  }

  public CatalogInfoResponseLimits updateItemTaxesMaxItemIds(Integer updateItemTaxesMaxItemIds) {
    this.updateItemTaxesMaxItemIds = updateItemTaxesMaxItemIds;
    return this;
  }

   /**
   * The maximum number of item IDs that may be included in a single `/v2/catalog/update-item-taxes` request.
   * @return updateItemTaxesMaxItemIds
  **/
  @ApiModelProperty(value = "The maximum number of item IDs that may be included in a single `/v2/catalog/update-item-taxes` request.")
  public Integer getUpdateItemTaxesMaxItemIds() {
    return updateItemTaxesMaxItemIds;
  }

  public void setUpdateItemTaxesMaxItemIds(Integer updateItemTaxesMaxItemIds) {
    this.updateItemTaxesMaxItemIds = updateItemTaxesMaxItemIds;
  }

  public CatalogInfoResponseLimits updateItemTaxesMaxTaxesToEnable(Integer updateItemTaxesMaxTaxesToEnable) {
    this.updateItemTaxesMaxTaxesToEnable = updateItemTaxesMaxTaxesToEnable;
    return this;
  }

   /**
   * The maximum number of tax IDs to be enabled that may be included in a single `/v2/catalog/update-item-taxes` request.
   * @return updateItemTaxesMaxTaxesToEnable
  **/
  @ApiModelProperty(value = "The maximum number of tax IDs to be enabled that may be included in a single `/v2/catalog/update-item-taxes` request.")
  public Integer getUpdateItemTaxesMaxTaxesToEnable() {
    return updateItemTaxesMaxTaxesToEnable;
  }

  public void setUpdateItemTaxesMaxTaxesToEnable(Integer updateItemTaxesMaxTaxesToEnable) {
    this.updateItemTaxesMaxTaxesToEnable = updateItemTaxesMaxTaxesToEnable;
  }

  public CatalogInfoResponseLimits updateItemTaxesMaxTaxesToDisable(Integer updateItemTaxesMaxTaxesToDisable) {
    this.updateItemTaxesMaxTaxesToDisable = updateItemTaxesMaxTaxesToDisable;
    return this;
  }

   /**
   * The maximum number of tax IDs to be disabled that may be included in a single `/v2/catalog/update-item-taxes` request.
   * @return updateItemTaxesMaxTaxesToDisable
  **/
  @ApiModelProperty(value = "The maximum number of tax IDs to be disabled that may be included in a single `/v2/catalog/update-item-taxes` request.")
  public Integer getUpdateItemTaxesMaxTaxesToDisable() {
    return updateItemTaxesMaxTaxesToDisable;
  }

  public void setUpdateItemTaxesMaxTaxesToDisable(Integer updateItemTaxesMaxTaxesToDisable) {
    this.updateItemTaxesMaxTaxesToDisable = updateItemTaxesMaxTaxesToDisable;
  }

  public CatalogInfoResponseLimits updateItemModifierListsMaxItemIds(Integer updateItemModifierListsMaxItemIds) {
    this.updateItemModifierListsMaxItemIds = updateItemModifierListsMaxItemIds;
    return this;
  }

   /**
   * The maximum number of item IDs that may be included in a single `/v2/catalog/update-item-modifier-lists` request.
   * @return updateItemModifierListsMaxItemIds
  **/
  @ApiModelProperty(value = "The maximum number of item IDs that may be included in a single `/v2/catalog/update-item-modifier-lists` request.")
  public Integer getUpdateItemModifierListsMaxItemIds() {
    return updateItemModifierListsMaxItemIds;
  }

  public void setUpdateItemModifierListsMaxItemIds(Integer updateItemModifierListsMaxItemIds) {
    this.updateItemModifierListsMaxItemIds = updateItemModifierListsMaxItemIds;
  }

  public CatalogInfoResponseLimits updateItemModifierListsMaxModifierListsToEnable(Integer updateItemModifierListsMaxModifierListsToEnable) {
    this.updateItemModifierListsMaxModifierListsToEnable = updateItemModifierListsMaxModifierListsToEnable;
    return this;
  }

   /**
   * The maximum number of modifier list IDs to be enabled that may be included in a single `/v2/catalog/update-item-modifier-lists` request.
   * @return updateItemModifierListsMaxModifierListsToEnable
  **/
  @ApiModelProperty(value = "The maximum number of modifier list IDs to be enabled that may be included in a single `/v2/catalog/update-item-modifier-lists` request.")
  public Integer getUpdateItemModifierListsMaxModifierListsToEnable() {
    return updateItemModifierListsMaxModifierListsToEnable;
  }

  public void setUpdateItemModifierListsMaxModifierListsToEnable(Integer updateItemModifierListsMaxModifierListsToEnable) {
    this.updateItemModifierListsMaxModifierListsToEnable = updateItemModifierListsMaxModifierListsToEnable;
  }

  public CatalogInfoResponseLimits updateItemModifierListsMaxModifierListsToDisable(Integer updateItemModifierListsMaxModifierListsToDisable) {
    this.updateItemModifierListsMaxModifierListsToDisable = updateItemModifierListsMaxModifierListsToDisable;
    return this;
  }

   /**
   * The maximum number of modifier list IDs to be disabled that may be included in a single `/v2/catalog/update-item-modifier-lists` request.
   * @return updateItemModifierListsMaxModifierListsToDisable
  **/
  @ApiModelProperty(value = "The maximum number of modifier list IDs to be disabled that may be included in a single `/v2/catalog/update-item-modifier-lists` request.")
  public Integer getUpdateItemModifierListsMaxModifierListsToDisable() {
    return updateItemModifierListsMaxModifierListsToDisable;
  }

  public void setUpdateItemModifierListsMaxModifierListsToDisable(Integer updateItemModifierListsMaxModifierListsToDisable) {
    this.updateItemModifierListsMaxModifierListsToDisable = updateItemModifierListsMaxModifierListsToDisable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogInfoResponseLimits catalogInfoResponseLimits = (CatalogInfoResponseLimits) o;
    return Objects.equals(this.batchUpsertMaxObjectsPerBatch, catalogInfoResponseLimits.batchUpsertMaxObjectsPerBatch) &&
        Objects.equals(this.batchUpsertMaxTotalObjects, catalogInfoResponseLimits.batchUpsertMaxTotalObjects) &&
        Objects.equals(this.batchRetrieveMaxObjectIds, catalogInfoResponseLimits.batchRetrieveMaxObjectIds) &&
        Objects.equals(this.searchMaxPageLimit, catalogInfoResponseLimits.searchMaxPageLimit) &&
        Objects.equals(this.batchDeleteMaxObjectIds, catalogInfoResponseLimits.batchDeleteMaxObjectIds) &&
        Objects.equals(this.updateItemTaxesMaxItemIds, catalogInfoResponseLimits.updateItemTaxesMaxItemIds) &&
        Objects.equals(this.updateItemTaxesMaxTaxesToEnable, catalogInfoResponseLimits.updateItemTaxesMaxTaxesToEnable) &&
        Objects.equals(this.updateItemTaxesMaxTaxesToDisable, catalogInfoResponseLimits.updateItemTaxesMaxTaxesToDisable) &&
        Objects.equals(this.updateItemModifierListsMaxItemIds, catalogInfoResponseLimits.updateItemModifierListsMaxItemIds) &&
        Objects.equals(this.updateItemModifierListsMaxModifierListsToEnable, catalogInfoResponseLimits.updateItemModifierListsMaxModifierListsToEnable) &&
        Objects.equals(this.updateItemModifierListsMaxModifierListsToDisable, catalogInfoResponseLimits.updateItemModifierListsMaxModifierListsToDisable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(batchUpsertMaxObjectsPerBatch, batchUpsertMaxTotalObjects, batchRetrieveMaxObjectIds, searchMaxPageLimit, batchDeleteMaxObjectIds, updateItemTaxesMaxItemIds, updateItemTaxesMaxTaxesToEnable, updateItemTaxesMaxTaxesToDisable, updateItemModifierListsMaxItemIds, updateItemModifierListsMaxModifierListsToEnable, updateItemModifierListsMaxModifierListsToDisable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogInfoResponseLimits {\n");
    
    sb.append("    batchUpsertMaxObjectsPerBatch: ").append(toIndentedString(batchUpsertMaxObjectsPerBatch)).append("\n");
    sb.append("    batchUpsertMaxTotalObjects: ").append(toIndentedString(batchUpsertMaxTotalObjects)).append("\n");
    sb.append("    batchRetrieveMaxObjectIds: ").append(toIndentedString(batchRetrieveMaxObjectIds)).append("\n");
    sb.append("    searchMaxPageLimit: ").append(toIndentedString(searchMaxPageLimit)).append("\n");
    sb.append("    batchDeleteMaxObjectIds: ").append(toIndentedString(batchDeleteMaxObjectIds)).append("\n");
    sb.append("    updateItemTaxesMaxItemIds: ").append(toIndentedString(updateItemTaxesMaxItemIds)).append("\n");
    sb.append("    updateItemTaxesMaxTaxesToEnable: ").append(toIndentedString(updateItemTaxesMaxTaxesToEnable)).append("\n");
    sb.append("    updateItemTaxesMaxTaxesToDisable: ").append(toIndentedString(updateItemTaxesMaxTaxesToDisable)).append("\n");
    sb.append("    updateItemModifierListsMaxItemIds: ").append(toIndentedString(updateItemModifierListsMaxItemIds)).append("\n");
    sb.append("    updateItemModifierListsMaxModifierListsToEnable: ").append(toIndentedString(updateItemModifierListsMaxModifierListsToEnable)).append("\n");
    sb.append("    updateItemModifierListsMaxModifierListsToDisable: ").append(toIndentedString(updateItemModifierListsMaxModifierListsToDisable)).append("\n");
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


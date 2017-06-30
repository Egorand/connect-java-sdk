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
import com.squareup.connect.models.CatalogObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")

public class UpsertCatalogObjectRequest {
  @JsonProperty("idempotency_key")
  private String idempotencyKey = null;

  @JsonProperty("object")
  private CatalogObject object = null;

  public UpsertCatalogObjectRequest idempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A value you specify that uniquely identifies this request among all your requests. A common way to create a valid idempotency key is to use a Universally unique identifier (UUID).  If you're unsure whether a particular request was successful, you can reattempt it with the same idempotency key without worrying about creating duplicate objects.  See [Idempotency keys](#idempotencykeys) for more information.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A value you specify that uniquely identifies this request among all your requests. A common way to create a valid idempotency key is to use a Universally unique identifier (UUID).  If you're unsure whether a particular request was successful, you can reattempt it with the same idempotency key without worrying about creating duplicate objects.  See [Idempotency keys](#idempotencykeys) for more information.")
  public String getIdempotencyKey() {
    return idempotencyKey;
  }

  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }

  public UpsertCatalogObjectRequest object(CatalogObject object) {
    this.object = object;
    return this;
  }

   /**
   * A [CatalogObject](#type-catalogobject) to be created or updated. The object's `is_deleted` field must not be set to `true`. When creating a new object, the object's ID must either start with a `#` character or be left blank. In either case it will be replaced with a server-generated ID.
   * @return object
  **/
  @ApiModelProperty(required = true, value = "A [CatalogObject](#type-catalogobject) to be created or updated. The object's `is_deleted` field must not be set to `true`. When creating a new object, the object's ID must either start with a `#` character or be left blank. In either case it will be replaced with a server-generated ID.")
  public CatalogObject getObject() {
    return object;
  }

  public void setObject(CatalogObject object) {
    this.object = object;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertCatalogObjectRequest upsertCatalogObjectRequest = (UpsertCatalogObjectRequest) o;
    return Objects.equals(this.idempotencyKey, upsertCatalogObjectRequest.idempotencyKey) &&
        Objects.equals(this.object, upsertCatalogObjectRequest.object);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idempotencyKey, object);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertCatalogObjectRequest {\n");
    
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
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


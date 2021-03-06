package com.squareup.connect.api;

import com.squareup.connect.ApiException;
import com.squareup.connect.ApiClient;
import com.squareup.connect.Configuration;
import com.squareup.connect.Pair;

import javax.ws.rs.core.GenericType;

import com.squareup.connect.models.V1BankAccount;
import com.squareup.connect.models.V1CreateRefundRequest;
import com.squareup.connect.models.V1Order;
import com.squareup.connect.models.V1Payment;
import com.squareup.connect.models.V1Refund;
import com.squareup.connect.models.V1Settlement;
import com.squareup.connect.models.V1UpdateOrderRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class V1TransactionsApi {
  private ApiClient apiClient;

  public V1TransactionsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public V1TransactionsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Issues a refund for a previously processed payment. You must issue a refund within 60 days of the associated payment.
   * Issues a refund for a previously processed payment. You must issue a refund within 60 days of the associated payment.
   * @param locationId The ID of the original payment&#39;s associated location. (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return V1Refund
   * @throws ApiException if fails to make API call
   */
  public V1Refund createRefund(String locationId, V1CreateRefundRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling createRefund");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createRefund");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/refunds"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<V1Refund> localVarReturnType = new GenericType<V1Refund>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides non-confidential details for all of a location&#39;s associated bank accounts. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
   * Provides non-confidential details for all of a location&#39;s associated bank accounts. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
   * @param locationId The ID of the location to list bank accounts for. (required)
   * @return List&lt;V1BankAccount&gt;
   * @throws ApiException if fails to make API call
   */
  public List<V1BankAccount> listBankAccounts(String locationId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling listBankAccounts");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/bank-accounts"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<V1BankAccount>> localVarReturnType = new GenericType<List<V1BankAccount>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides summary information for a merchant&#39;s online store orders.
   * Provides summary information for a merchant&#39;s online store orders.
   * @param locationId The ID of the location to list online store orders for. (required)
   * @param order TThe order in which payments are listed in the response. (optional)
   * @param limit The maximum number of payments to return in a single response. This value cannot exceed 200. (optional)
   * @return List&lt;V1Order&gt;
   * @throws ApiException if fails to make API call
   */
  public List<V1Order> listOrders(String locationId, String order, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling listOrders");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/orders"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<V1Order>> localVarReturnType = new GenericType<List<V1Order>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides summary information for all payments taken by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length. See Date ranges for details of inclusive and exclusive dates.
   * Provides summary information for all payments taken by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length. See Date ranges for details of inclusive and exclusive dates.
   * @param locationId The ID of the location to list payments for. If you specify me, this endpoint returns payments aggregated from all of the business&#39;s locations. (required)
   * @param order The order in which payments are listed in the response. (optional)
   * @param beginTime The beginning of the requested reporting period, in ISO 8601 format. If this value is before January 1, 2013 (2013-01-01T00:00:00Z), this endpoint returns an error. Default value: The current time minus one year. (optional)
   * @param endTime The end of the requested reporting period, in ISO 8601 format. If this value is more than one year greater than begin_time, this endpoint returns an error. Default value: The current time. (optional)
   * @param limit The maximum number of payments to return in a single response. This value cannot exceed 200. (optional)
   * @return List&lt;V1Payment&gt;
   * @throws ApiException if fails to make API call
   */
  public List<V1Payment> listPayments(String locationId, String order, String beginTime, String endTime, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling listPayments");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/payments"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "begin_time", beginTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<V1Payment>> localVarReturnType = new GenericType<List<V1Payment>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides the details for all refunds initiated by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length.
   * Provides the details for all refunds initiated by a merchant or any of the merchant&#39;s mobile staff during a date range. Date ranges cannot exceed one year in length.
   * @param locationId The ID of the location to list refunds for. (required)
   * @param order TThe order in which payments are listed in the response. (optional)
   * @param beginTime The beginning of the requested reporting period, in ISO 8601 format. If this value is before January 1, 2013 (2013-01-01T00:00:00Z), this endpoint returns an error. Default value: The current time minus one year. (optional)
   * @param endTime The end of the requested reporting period, in ISO 8601 format. If this value is more than one year greater than begin_time, this endpoint returns an error. Default value: The current time. (optional)
   * @param limit The maximum number of payments to return in a single response. This value cannot exceed 200. (optional)
   * @return List&lt;V1Refund&gt;
   * @throws ApiException if fails to make API call
   */
  public List<V1Refund> listRefunds(String locationId, String order, String beginTime, String endTime, Integer limit) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling listRefunds");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/refunds"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "begin_time", beginTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<V1Refund>> localVarReturnType = new GenericType<List<V1Refund>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides summary information for all deposits and withdrawals initiated by Square to a merchant&#39;s bank account during a date range. Date ranges cannot exceed one year in length.
   * Provides summary information for all deposits and withdrawals initiated by Square to a merchant&#39;s bank account during a date range. Date ranges cannot exceed one year in length. 
   * @param locationId The ID of the location to list settlements for. If you specify me, this endpoint returns payments aggregated from all of the business&#39;s locations. (required)
   * @param order TThe order in which payments are listed in the response. (optional)
   * @param beginTime The beginning of the requested reporting period, in ISO 8601 format. If this value is before January 1, 2013 (2013-01-01T00:00:00Z), this endpoint returns an error. Default value: The current time minus one year. (optional)
   * @param endTime The end of the requested reporting period, in ISO 8601 format. If this value is more than one year greater than begin_time, this endpoint returns an error. Default value: The current time. (optional)
   * @param limit The maximum number of payments to return in a single response. This value cannot exceed 200. (optional)
   * @param status Provide this parameter to retrieve only settlements with a particular status (SENT or FAILED). (optional)
   * @return List&lt;V1Settlement&gt;
   * @throws ApiException if fails to make API call
   */
  public List<V1Settlement> listSettlements(String locationId, String order, String beginTime, String endTime, Integer limit, String status) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling listSettlements");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/settlements"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order", order));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "begin_time", beginTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "end_time", endTime));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<List<V1Settlement>> localVarReturnType = new GenericType<List<V1Settlement>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides non-confidential details for a merchant&#39;s associated bank account. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
   * Provides non-confidential details for a merchant&#39;s associated bank account. This endpoint does not provide full bank account numbers, and there is no way to obtain a full bank account number with the Connect API.
   * @param locationId The ID of the bank account&#39;s associated location. (required)
   * @param bankAccountId The bank account&#39;s Square-issued ID. You obtain this value from Settlement objects returned. (required)
   * @return V1BankAccount
   * @throws ApiException if fails to make API call
   */
  public V1BankAccount retrieveBankAccount(String locationId, String bankAccountId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveBankAccount");
    }
    
    // verify the required parameter 'bankAccountId' is set
    if (bankAccountId == null) {
      throw new ApiException(400, "Missing the required parameter 'bankAccountId' when calling retrieveBankAccount");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/bank-accounts/{bank_account_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "bank_account_id" + "\\}", apiClient.escapeString(bankAccountId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<V1BankAccount> localVarReturnType = new GenericType<V1BankAccount>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides comprehensive information for a single online store order, including the order&#39;s history.
   * Provides comprehensive information for a single online store order, including the order&#39;s history.
   * @param locationId The ID of the order&#39;s associated location. (required)
   * @param orderId The order&#39;s Square-issued ID. You obtain this value from Order objects returned by the List Orders endpoint (required)
   * @return V1Order
   * @throws ApiException if fails to make API call
   */
  public V1Order retrieveOrder(String locationId, String orderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveOrder");
    }
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling retrieveOrder");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/orders/{order_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<V1Order> localVarReturnType = new GenericType<V1Order>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides comprehensive information for a single payment.
   * Provides comprehensive information for a single payment.
   * @param locationId The ID of the payment&#39;s associated location. (required)
   * @param paymentId The payment&#39;s Square-issued ID. You obtain this value from Payment objects returned by the List Payments endpoint, or Settlement objects returned by the List Settlements endpoint. (required)
   * @return V1Payment
   * @throws ApiException if fails to make API call
   */
  public V1Payment retrievePayment(String locationId, String paymentId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling retrievePayment");
    }
    
    // verify the required parameter 'paymentId' is set
    if (paymentId == null) {
      throw new ApiException(400, "Missing the required parameter 'paymentId' when calling retrievePayment");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/payments/{payment_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "payment_id" + "\\}", apiClient.escapeString(paymentId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<V1Payment> localVarReturnType = new GenericType<V1Payment>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Provides comprehensive information for a single settlement, including the entries that contribute to the settlement&#39;s total.
   * Provides comprehensive information for a single settlement, including the entries that contribute to the settlement&#39;s total.
   * @param locationId The ID of the settlements&#39;s associated location. (required)
   * @param settlementId The settlement&#39;s Square-issued ID. You obtain this value from Settlement objects returned by the List Settlements endpoint. (required)
   * @return V1Settlement
   * @throws ApiException if fails to make API call
   */
  public V1Settlement retrieveSettlement(String locationId, String settlementId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling retrieveSettlement");
    }
    
    // verify the required parameter 'settlementId' is set
    if (settlementId == null) {
      throw new ApiException(400, "Missing the required parameter 'settlementId' when calling retrieveSettlement");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/settlements/{settlement_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "settlement_id" + "\\}", apiClient.escapeString(settlementId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<V1Settlement> localVarReturnType = new GenericType<V1Settlement>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Updates the details of an online store order. Every update you perform on an order corresponds to one of three actions:
   * Updates the details of an online store order. Every update you perform on an order corresponds to one of three actions:
   * @param locationId The ID of the order&#39;s associated location. (required)
   * @param orderId The order&#39;s Square-issued ID. You obtain this value from Order objects returned by the List Orders endpoint (required)
   * @param body An object containing the fields to POST for the request.  See the corresponding object definition for field details. (required)
   * @return V1Order
   * @throws ApiException if fails to make API call
   */
  public V1Order updateOrder(String locationId, String orderId, V1UpdateOrderRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'locationId' is set
    if (locationId == null) {
      throw new ApiException(400, "Missing the required parameter 'locationId' when calling updateOrder");
    }
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling updateOrder");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling updateOrder");
    }
    
    // create path and map variables
    String localVarPath = "/v1/{location_id}/orders/{order_id}"
      .replaceAll("\\{" + "location_id" + "\\}", apiClient.escapeString(locationId.toString()))
      .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "oauth2" };

    GenericType<V1Order> localVarReturnType = new GenericType<V1Order>() {};
    return apiClient.invokeAPI(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}

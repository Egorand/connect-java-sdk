
# UpsertCatalogObjectRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idempotencyKey** | **String** | A value you specify that uniquely identifies this request among all your requests. A common way to create a valid idempotency key is to use a Universally unique identifier (UUID).  If you&#39;re unsure whether a particular request was successful, you can reattempt it with the same idempotency key without worrying about creating duplicate objects.  See [Idempotency keys](#idempotencykeys) for more information. | 
**object** | [**CatalogObject**](CatalogObject.md) | A [CatalogObject](#type-catalogobject) to be created or updated. The object&#39;s &#x60;is_deleted&#x60; field must not be set to &#x60;true&#x60;. When creating a new object, the object&#39;s ID must either start with a &#x60;#&#x60; character or be left blank. In either case it will be replaced with a server-generated ID. | 



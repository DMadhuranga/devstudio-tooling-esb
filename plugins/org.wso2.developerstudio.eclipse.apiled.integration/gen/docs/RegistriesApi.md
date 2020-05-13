# RegistriesApi

All URIs are relative to *https://apis.wso2.com/api/am/endpoint-registry/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteRegistry**](RegistriesApi.md#deleteRegistry) | **DELETE** /registries/{registryId} | Delete a registry
[**getRegistryByUUID**](RegistriesApi.md#getRegistryByUUID) | **GET** /registries/{registryId} | Get details of a Registry
[**registriesGet**](RegistriesApi.md#registriesGet) | **GET** /registries | Retrieve Registries 
[**registriesPost**](RegistriesApi.md#registriesPost) | **POST** /registries | Create a new Registry
[**updateRegistry**](RegistriesApi.md#updateRegistry) | **PUT** /registries/{registryId} | Update an existing Registry


<a name="deleteRegistry"></a>
# **deleteRegistry**
> deleteRegistry(registryId)

Delete a registry

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistriesApi apiInstance = new RegistriesApi();
String registryId = "registryId_example"; // String | uuid of the Registry
try {
    apiInstance.deleteRegistry(registryId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistriesApi#deleteRegistry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| uuid of the Registry |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRegistryByUUID"></a>
# **getRegistryByUUID**
> Registry getRegistryByUUID(registryId)

Get details of a Registry

Using this operation, you can retrieve complete details of a single Registry using the RegistryId. 

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistriesApi apiInstance = new RegistriesApi();
String registryId = "registryId_example"; // String | ID of the Registry
try {
    Registry result = apiInstance.getRegistryByUUID(registryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistriesApi#getRegistryByUUID");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| ID of the Registry |

### Return type

[**Registry**](Registry.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesGet"></a>
# **registriesGet**
> List&lt;Registry&gt; registriesGet(query, sortBy, sortOrder)

Retrieve Registries 

This operation provides you an array of available Registries. 

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistriesApi;


RegistriesApi apiInstance = new RegistriesApi();
String query = "query_example"; // String | **Search condition**.  You can search for a registry by specifying the registry name as \"query\" attribute.  Eg. \"prodServer\" will match a registry entry if the name is exactly \"prodServer\". 
String sortBy = "sortBy_example"; // String | 
String sortOrder = "sortOrder_example"; // String | 
try {
    List<Registry> result = apiInstance.registriesGet(query, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistriesApi#registriesGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **String**| **Search condition**.  You can search for a registry by specifying the registry name as \&quot;query\&quot; attribute.  Eg. \&quot;prodServer\&quot; will match a registry entry if the name is exactly \&quot;prodServer\&quot;.  | [optional]
 **sortBy** | **String**|  | [optional] [enum: registryName]
 **sortOrder** | **String**|  | [optional] [enum: asc, desc]

### Return type

[**List&lt;Registry&gt;**](Registry.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="registriesPost"></a>
# **registriesPost**
> Registry registriesPost(registry)

Create a new Registry

This operation can be used to create a new Registry specifying the details of the Registry in the payload. 

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistriesApi apiInstance = new RegistriesApi();
Registry registry = new Registry(); // Registry | 
try {
    Registry result = apiInstance.registriesPost(registry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistriesApi#registriesPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registry** | [**Registry**](Registry.md)|  | [optional]

### Return type

[**Registry**](Registry.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRegistry"></a>
# **updateRegistry**
> Registry updateRegistry(registryId, registry)

Update an existing Registry

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistriesApi apiInstance = new RegistriesApi();
String registryId = "registryId_example"; // String | ID of the Registry
Registry registry = new Registry(); // Registry | 
try {
    Registry result = apiInstance.updateRegistry(registryId, registry);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistriesApi#updateRegistry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| ID of the Registry |
 **registry** | [**Registry**](Registry.md)|  | [optional]

### Return type

[**Registry**](Registry.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


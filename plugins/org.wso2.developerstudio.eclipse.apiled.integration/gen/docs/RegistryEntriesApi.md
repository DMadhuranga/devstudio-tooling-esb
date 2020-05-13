# RegistryEntriesApi

All URIs are relative to *https://apis.wso2.com/api/am/endpoint-registry/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRegistryEntry**](RegistryEntriesApi.md#createRegistryEntry) | **POST** /registries/{registryId}/entry | Create a new Registry Entry
[**deleteRegistryEntry**](RegistryEntriesApi.md#deleteRegistryEntry) | **DELETE** /registries/{registryId}/entries/{entryId} | Delete an existing Registry Entry
[**getAllEntriesInRegistry**](RegistryEntriesApi.md#getAllEntriesInRegistry) | **GET** /registries/{registryId}/entries | Get All entries in the registry
[**getRegistryEntryByUuid**](RegistryEntriesApi.md#getRegistryEntryByUuid) | **GET** /registries/{registryId}/entries/{entryId} | Retrieve a specific Entry in a Registry
[**updateRegistryEntry**](RegistryEntriesApi.md#updateRegistryEntry) | **PUT** /registries/{registryId}/entries/{entryId} | Update an existing Registry Entry


<a name="createRegistryEntry"></a>
# **createRegistryEntry**
> RegistryEntry createRegistryEntry(registryId, registryEntry, definitionFile)

Create a new Registry Entry

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistryEntriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistryEntriesApi apiInstance = new RegistryEntriesApi();
String registryId = "registryId_example"; // String | uuid of the registry
RegistryEntry registryEntry = new RegistryEntry(); // RegistryEntry | 
File definitionFile = new File("/path/to/file"); // File | 
try {
    RegistryEntry result = apiInstance.createRegistryEntry(registryId, registryEntry, definitionFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistryEntriesApi#createRegistryEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| uuid of the registry |
 **registryEntry** | [**RegistryEntry**](RegistryEntry.md)|  | [default to null]
 **definitionFile** | **File**|  |

### Return type

[**RegistryEntry**](RegistryEntry.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteRegistryEntry"></a>
# **deleteRegistryEntry**
> deleteRegistryEntry(registryId, entryId)

Delete an existing Registry Entry

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistryEntriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistryEntriesApi apiInstance = new RegistryEntriesApi();
String registryId = "registryId_example"; // String | uuid of the registry
String entryId = "entryId_example"; // String | uuid of the registry entry
try {
    apiInstance.deleteRegistryEntry(registryId, entryId);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistryEntriesApi#deleteRegistryEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| uuid of the registry |
 **entryId** | **String**| uuid of the registry entry |

### Return type

null (empty response body)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllEntriesInRegistry"></a>
# **getAllEntriesInRegistry**
> List&lt;RegistryEntry&gt; getAllEntriesInRegistry(registryId, query, sortBy, sortOrder)

Get All entries in the registry

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistryEntriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistryEntriesApi apiInstance = new RegistryEntriesApi();
String registryId = "registryId_example"; // String | uuid of the Registry
String query = "query_example"; // String | **Search condition**.  You can search for a registry entry by specifying the entry name as \"query\" attribute.  Eg. \"pizzaServer\" will match a registry entry if the name is exactly \"pizzaServer\". 
String sortBy = "sortBy_example"; // String | 
String sortOrder = "sortOrder_example"; // String | 
try {
    List<RegistryEntry> result = apiInstance.getAllEntriesInRegistry(registryId, query, sortBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistryEntriesApi#getAllEntriesInRegistry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| uuid of the Registry |
 **query** | **String**| **Search condition**.  You can search for a registry entry by specifying the entry name as \&quot;query\&quot; attribute.  Eg. \&quot;pizzaServer\&quot; will match a registry entry if the name is exactly \&quot;pizzaServer\&quot;.  | [optional]
 **sortBy** | **String**|  | [optional] [enum: definitionType, serviceType]
 **sortOrder** | **String**|  | [optional] [enum: asc, desc]

### Return type

[**List&lt;RegistryEntry&gt;**](RegistryEntry.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRegistryEntryByUuid"></a>
# **getRegistryEntryByUuid**
> List&lt;RegistryEntry&gt; getRegistryEntryByUuid(registryId, entryId)

Retrieve a specific Entry in a Registry

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistryEntriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistryEntriesApi apiInstance = new RegistryEntriesApi();
String registryId = "registryId_example"; // String | uuid of the registry
String entryId = "entryId_example"; // String | uuid of the registry entry
try {
    List<RegistryEntry> result = apiInstance.getRegistryEntryByUuid(registryId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistryEntriesApi#getRegistryEntryByUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| uuid of the registry |
 **entryId** | **String**| uuid of the registry entry |

### Return type

[**List&lt;RegistryEntry&gt;**](RegistryEntry.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateRegistryEntry"></a>
# **updateRegistryEntry**
> RegistryEntry updateRegistryEntry(registryId, entryId, registryEntry, definitionFile)

Update an existing Registry Entry

### Example
```java
// Import classes:
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiClient;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.Configuration;
//import org.wso2.developerstudio.eclipse.apiled.integration.handler.auth.*;
//import org.wso2.developerstudio.eclipse.apiled.integration.rest.api.RegistryEntriesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: OAuth2
OAuth OAuth2 = (OAuth) defaultClient.getAuthentication("OAuth2");
OAuth2.setAccessToken("YOUR ACCESS TOKEN");

RegistryEntriesApi apiInstance = new RegistryEntriesApi();
String registryId = "registryId_example"; // String | uuid of the registry
String entryId = "entryId_example"; // String | uuid of the registry entry
RegistryEntry registryEntry = new RegistryEntry(); // RegistryEntry | 
File definitionFile = new File("/path/to/file"); // File | 
try {
    RegistryEntry result = apiInstance.updateRegistryEntry(registryId, entryId, registryEntry, definitionFile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RegistryEntriesApi#updateRegistryEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| uuid of the registry |
 **entryId** | **String**| uuid of the registry entry |
 **registryEntry** | [**RegistryEntry**](RegistryEntry.md)|  | [default to null]
 **definitionFile** | **File**|  |

### Return type

[**RegistryEntry**](RegistryEntry.md)

### Authorization

[OAuth2](../README.md#OAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


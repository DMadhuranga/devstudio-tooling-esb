/*
 * WSO2 API Manager - Endpoint Registry
 * This specifies a **RESTful API** for Enpoint Registry. 
 *
 * OpenAPI spec version: 0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.wso2.developerstudio.eclipse.apiled.integration.rest.api;

import org.wso2.developerstudio.eclipse.apiled.integration.handler.ApiException;
import org.wso2.developerstudio.eclipse.apiled.integration.rest.model.Error;
import org.wso2.developerstudio.eclipse.apiled.integration.rest.model.Registry;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RegistriesApi
 */
@Ignore
public class RegistriesApiTest {

    private final RegistriesApi api = new RegistriesApi();

    
    /**
     * Delete a registry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteRegistryTest() throws ApiException {
        String registryId = null;
        api.deleteRegistry(registryId);

        // TODO: test validations
    }
    
    /**
     * Get details of a Registry
     *
     * Using this operation, you can retrieve complete details of a single Registry using the RegistryId. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRegistryByUUIDTest() throws ApiException {
        String registryId = null;
        Registry response = api.getRegistryByUUID(registryId);

        // TODO: test validations
    }
    
    /**
     * Retrieve Registries 
     *
     * This operation provides you an array of available Registries. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registriesGetTest() throws ApiException {
        String query = null;
        String sortBy = null;
        String sortOrder = null;
        List<Registry> response = api.registriesGet(query, sortBy, sortOrder);

        // TODO: test validations
    }
    
    /**
     * Create a new Registry
     *
     * This operation can be used to create a new Registry specifying the details of the Registry in the payload. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void registriesPostTest() throws ApiException {
        Registry registry = null;
        Registry response = api.registriesPost(registry);

        // TODO: test validations
    }
    
    /**
     * Update an existing Registry
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateRegistryTest() throws ApiException {
        String registryId = null;
        Registry registry = null;
        Registry response = api.updateRegistry(registryId, registry);

        // TODO: test validations
    }
    
}
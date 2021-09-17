/*
 * Data API
 * Serves the Clever Data API
 *
 * OpenAPI spec version: 2.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.DistrictAdminResponse;
import io.swagger.client.model.DistrictAdminsResponse;
import io.swagger.client.model.DistrictResponse;
import io.swagger.client.model.NotFound;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DistrictAdminsApi
 */
@Ignore
public class DistrictAdminsApiTest {

    private final DistrictAdminsApi api = new DistrictAdminsApi();

    /**
     * 
     *
     * Returns a specific district admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictAdminTest() throws ApiException {
        String id = null;
        DistrictAdminResponse response = api.getDistrictAdmin(id);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns a list of district admins
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictAdminsTest() throws ApiException {
        Integer limit = null;
        String startingAfter = null;
        String endingBefore = null;
        String count = null;
        DistrictAdminsResponse response = api.getDistrictAdmins(limit, startingAfter, endingBefore, count);

        // TODO: test validations
    }
    /**
     * 
     *
     * Returns the district for a district admin
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDistrictForDistrictAdminTest() throws ApiException {
        String id = null;
        DistrictResponse response = api.getDistrictForDistrictAdmin(id);

        // TODO: test validations
    }
}
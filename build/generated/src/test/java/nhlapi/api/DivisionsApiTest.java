/*
 * NHL API
 * Documenting the publicly accessible portions of the NHL API.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package nhlapi.api;

import nhlapi.invoker.ApiException;
import java.math.BigDecimal;
import nhlapi.model.Division;
import nhlapi.model.Divisions;
import nhlapi.model.Error;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DivisionsApi
 */
public class DivisionsApiTest {

    private final DivisionsApi api = new DivisionsApi();

    /**
     * Get an NHL division.
     *
     * You can use this to also retrieve inactive divisions. For example, the ID for the old Patrick division is &#x60;13&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDivisionTest() throws ApiException {
        //
        //BigDecimal id = null;
        //
        //Division response = api.getDivision(id);

        // TODO: test validations
    }
    /**
     * Get all current NHL divisions.
     *
     * This only retrieves active divisions. For inactive divisions, use &#x60;/divisions/{id}&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDivisionsTest() throws ApiException {
        //
        //Divisions response = api.getDivisions();

        // TODO: test validations
    }
}
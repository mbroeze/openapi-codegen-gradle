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
import nhlapi.model.Error;
import nhlapi.model.Game;
import nhlapi.model.GameBoxscores;
import nhlapi.model.GameContent;
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
 * API tests for GamesApi
 */
public class GamesApiTest {

    private final GamesApi api = new GamesApi();

    /**
     * Get all available data for an NHL game.
     *
     * This contains all data related to a game, from the boxscore, to play data and even on-ice coordinates. Be forewarned that, depending on the game, this endpoint can return a **lot** of data.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGameTest() throws ApiException {
        //
        //BigDecimal id = null;
        //
        //Game response = api.getGame(id);

        // TODO: test validations
    }
    /**
     * Get the boxscore for an NHL game.
     *
     * If you want detailed play information, you should use &#x60;/game/{id}/feed/live&#x60; or &#x60;/game/{id}/feed/live/diffPatch&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGameBoxscoreTest() throws ApiException {
        //
        //BigDecimal id = null;
        //
        //GameBoxscores response = api.getGameBoxscore(id);

        // TODO: test validations
    }
    /**
     * Get editorials, video replays and photo highlights for an NHL game.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGameContentTest() throws ApiException {
        //
        //BigDecimal id = null;
        //
        //GameContent response = api.getGameContent(id);

        // TODO: test validations
    }
    /**
     * Get all available data for an NHL game after a specific time.
     *
     * You can use this to return a small subset of data relating to game.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getGameDiffTest() throws ApiException {
        //
        //BigDecimal id = null;
        //
        //String startTimeCode = null;
        //
        //Game response = api.getGameDiff(id, startTimeCode);

        // TODO: test validations
    }
}

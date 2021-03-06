package com.norbertotaveras.game_companion_app.DTO.Runes;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Emanuel on 11/28/2017.
 */

public class RunePagesDTO implements Serializable {
    public Set<RunePageDTO> slots; // Collection of rune pages associated with the summoner.
    public long summonerID; // Summoner ID;
}

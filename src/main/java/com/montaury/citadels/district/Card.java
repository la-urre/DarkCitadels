package com.montaury.citadels.district;

import io.vavr.collection.HashSet;
import io.vavr.collection.Set;

public enum Card {
    MANOR_1(District.MANOR),
    MANOR_2(District.MANOR),
    MANOR_3(District.MANOR),
    MANOR_4(District.MANOR),
    MANOR_5(District.MANOR),
    CASTLE_1(District.CASTLE),
    CASTLE_2(District.CASTLE),
    CASTLE_3(District.CASTLE),
    CASTLE_4(District.CASTLE),
    PALACE_1(District.PALACE),
    PALACE_2(District.PALACE),
    PALACE_3(District.PALACE),

    WATCHTOWER_1(District.WATCHTOWER),
    WATCHTOWER_2(District.WATCHTOWER),
    WATCHTOWER_3(District.WATCHTOWER),
    PRISON_1(District.PRISON),
    PRISON_2(District.PRISON),
    PRISON_3(District.PRISON),
    BATTLEFIELD_1(District.BATTLEFIELD),
    BATTLEFIELD_2(District.BATTLEFIELD),
    BATTLEFIELD_3(District.BATTLEFIELD),
    FORTRESS_1(District.FORTRESS),
    FORTRESS_2(District.FORTRESS),

    TAVERN_1(District.TAVERN),
    TAVERN_2(District.TAVERN),
    TAVERN_3(District.TAVERN),
    TAVERN_4(District.TAVERN),
    TAVERN_5(District.TAVERN),
    TRADING_POST_1(District.TRADING_POST),
    TRADING_POST_2(District.TRADING_POST),
    TRADING_POST_3(District.TRADING_POST),
    MARKET_1(District.MARKET),
    MARKET_2(District.MARKET),
    MARKET_3(District.MARKET),
    MARKET_4(District.MARKET),
    DOCKS_1(District.DOCKS),
    DOCKS_2(District.DOCKS),
    DOCKS_3(District.DOCKS),
    HARBOR_1(District.HARBOR),
    HARBOR_2(District.HARBOR),
    HARBOR_3(District.HARBOR),
    TOWN_HALL_1(District.TOWN_HALL),
    TOWN_HALL_2(District.TOWN_HALL),

    TEMPLE_1(District.TEMPLE),
    TEMPLE_2(District.TEMPLE),
    TEMPLE_3(District.TEMPLE),
    CHURCH_1(District.CHURCH),
    CHURCH_2(District.CHURCH),
    CHURCH_3(District.CHURCH),
    MONASTERY_1(District.MONASTERY),
    MONASTERY_2(District.MONASTERY),
    MONASTERY_3(District.MONASTERY),
    CATHEDRAL_1(District.CATHEDRAL),
    CATHEDRAL_2(District.CATHEDRAL),

    HAUNTED_CITY(District.HAUNTED_CITY),
    DRAGON_GATE(District.DRAGON_GATE),
    UNIVERSITY(District.UNIVERSITY),
    TREASURY(District.TREASURY),
    MAP_ROOM(District.MAP_ROOM),
    OBSERVATORY(District.OBSERVATORY),
    GRAVEYARD(District.GRAVEYARD),
    SMITHY(District.SMITHY),
    LIBRARY(District.LIBRARY),
    MAGIC_SCHOOL(District.MAGIC_SCHOOL),
    LABORATORY(District.LABORATORY),
    GREAT_WALL(District.GREAT_WALL),
    KEEP_1(District.KEEP),
    KEEP_2(District.KEEP);

    Card(District district) {
        this.district = district;
    }

    private final District district;

    public District district() {
        return district;
    }

    public static Set<Card> all() {
        return HashSet.of(values());
    }
}

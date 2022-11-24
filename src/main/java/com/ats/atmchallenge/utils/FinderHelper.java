package com.ats.atmchallenge.utils;

import com.ats.atmchallenge.models.Address;
import com.ats.atmchallenge.models.Atm;
import com.ats.atmchallenge.models.GeoLocation;

public class FinderHelper {

    private FinderHelper() {
    }

    public static boolean fullSearch(Atm atm, String term) {
        return Boolean.TRUE.equals(searchOnAddress(atm.getAddress(), term)) ||
            (atm.getDistance().toString().contains(term) || atm.getType().contains(term));
    }

    private static Boolean searchOnAddress(Address address, String term) {
        return address.getStreet().contains(term) ||
            (address.getHousenumber().contains(term) ||
                (address.getPostalcode().contains(term) ||
                    (address.getCity().contains(term) ||
                        searchOnGeoLocation(address.getGeoLocation(), term))));
    }

    private static boolean searchOnGeoLocation(GeoLocation geoLocation, String term) {
        String lat = String.valueOf(geoLocation.getLat());
        String lng = String.valueOf(geoLocation.getLng());

        return lat.contains(term) || lng.contains(term);
    }


}

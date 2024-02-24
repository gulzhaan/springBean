package org.example;

import java.util.ArrayList;
import java.util.List;

public class YandexEda {
    String city = "Narxoz";

    List<Courier> couriers = new ArrayList<>();

    public YandexEda() {
    }

    public YandexEda(Courier courier) {
        couriers.add(courier);
    }

    public String getCity() {
        return city;
    }

    public List<Courier> getCouriers() {
        return couriers;
    }

    public void addCourier(Courier c){
        couriers.add(c);
    }

    @Override
    public String toString() {
        return "YandexEda{" +
                "city='" + city + '\'' +
                ", \n  couriers=" + couriers +
                '}';
    }

}

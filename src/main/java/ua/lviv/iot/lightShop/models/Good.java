package ua.lviv.iot.lightShop.models;

import lombok.Data;
import ua.lviv.iot.lightShop.models.TypeOfEnergySaving;
import  java.util.Objects;

@Data
public class Good {
    private int id;
    private String name;
    private String originCountry;
    private String producer;
    private int price;
    private int sizeInCm;
    private int powerInWatts;
    private int expirationDate;

    public Good() {
    }

    public Good(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Good(String name, String originCountry, String producer, int price,
                int sizeInCm, int powerInWatts, int expirationDate) {
        this.name = name;
        this.originCountry = originCountry;
        this.producer = producer;
        this.price = price;
        this.sizeInCm = sizeInCm;
        this.powerInWatts = powerInWatts;
        this.expirationDate = expirationDate;
    }
}

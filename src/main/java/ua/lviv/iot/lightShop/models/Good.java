package ua.lviv.iot.lightShop.models;

import lombok.Data;
import ua.lviv.iot.lightShop.Enum.TypeOfEnergySaving;
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
    private TypeOfEnergySaving typeOfEnergySaving;
    public Good() {}

    public Good(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Good(String name, String originCountry, String producer, int price,
                int sizeInCm, int powerInWatts, int expirationDate, TypeOfEnergySaving typeOfEnergySaving) {
        this.name = name;
        this.originCountry = originCountry;
        this.producer = producer;
        this.price = price;
        this.sizeInCm = sizeInCm;
        this.powerInWatts = powerInWatts;
        this.expirationDate = expirationDate;
        this.typeOfEnergySaving = typeOfEnergySaving;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Good)) {
            return false;
        }
        Good goods = (Good) o;
        return Objects.equals(id, goods.id) && Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public String toJson() {
        return String.format("{\"id\":%d,\"name\":\"%s\"}", id, name);
    }
}

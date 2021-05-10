package ua.lviv.iot.lightShop.Bulb;

import lombok.Data;
import ua.lviv.iot.lightShop.ENUM.TypeOfEnergySaving;
import ua.lviv.iot.lightShop.Goods;

@Data
public class Bulb extends Goods {
    private TypeOfEnergySaving typeOfEnergySaving;
    public Bulb(String name, String originCountry, String producer, int price,
                int sizeInCm, int powerInWatts, int expirationDate, TypeOfEnergySaving typeOfEnergySaving) {
        super(name, originCountry, producer,price, sizeInCm, powerInWatts, expirationDate);
        this.typeOfEnergySaving = typeOfEnergySaving;
    }
}
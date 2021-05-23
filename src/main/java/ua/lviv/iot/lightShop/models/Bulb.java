package ua.lviv.iot.lightShop.models;
import lombok.Data;
import ua.lviv.iot.lightShop.models.TypeOfEnergySaving;
import ua.lviv.iot.lightShop.models.Good;

@Data
public class Bulb extends Good {
    public Bulb(){}
    public Bulb(String name, String originCountry, String producer, int price,
                int sizeInCm, int powerInWatts, int expirationDate) {
        super(name, originCountry, producer,price, sizeInCm, powerInWatts, expirationDate);
    }
}
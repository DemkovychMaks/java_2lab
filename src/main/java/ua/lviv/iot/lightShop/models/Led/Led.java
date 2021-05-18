package ua.lviv.iot.lightShop.models.Led;
import lombok.Data;
import ua.lviv.iot.lightShop.Enum.TypeOfEnergySaving;
import ua.lviv.iot.lightShop.models.Good;
import ua.lviv.iot.lightShop.Enum.Color;
@Data
public class Led extends Good {
    public Led() {}
    private Color colorOfShining;
    public Led(String name, String originCountry, String producer, int price,
               int sizeInCm, int powerInWatts, int expirationDate, Color colorOfShining, TypeOfEnergySaving typeOfEnergySaving) {
        super(name, originCountry, producer,price, sizeInCm, powerInWatts, expirationDate, typeOfEnergySaving);
        this.colorOfShining = colorOfShining;
    }
}

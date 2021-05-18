package ua.lviv.iot.lightShop.models.Led;
import lombok.Data;
import ua.lviv.iot.lightShop.Enum.TypeOfEnergySaving;
import ua.lviv.iot.lightShop.models.Led.Led;
import ua.lviv.iot.lightShop.Enum.Color;

@Data
public class Garland extends Led {
    public Garland() {}
    private int amountOfDiodes;
    public Garland(String name, String originCountry, String producer, int price,
                   int sizeInCm, int powerInWatts, int expirationDate, Color colorOfShining, int amountOfDiodes, TypeOfEnergySaving typeOfEnergySaving) {
        super(name, originCountry, producer, price, sizeInCm, powerInWatts, expirationDate, colorOfShining, typeOfEnergySaving);
        this.amountOfDiodes = amountOfDiodes;
    }
}

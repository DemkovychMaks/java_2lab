package ua.lviv.iot.lightShop.LED;
import lombok.Data;
import ua.lviv.iot.lightShop.LED.LED;
import ua.lviv.iot.lightShop.ENUM.Color;
@Data
public class LedLamp extends LED {
    private String typeOfShining;
    public LedLamp(String name, String originCountry, String producer, int price,
                   int sizeInCm, int powerInWatts, int expirationDate, Color colorOfShining, String typeOfShining) {
        super(name, originCountry, producer, price, sizeInCm, powerInWatts, expirationDate, colorOfShining);
        this.typeOfShining = typeOfShining;
    }
}

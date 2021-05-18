package ua.lviv.iot.lightShop.LED;
import lombok.Data;
import ua.lviv.iot.lightShop.Goods;
import ua.lviv.iot.lightShop.ENUM.Color;
@Data
public class LED extends Goods {
    private Color colorOfShining;
    public LED(String name, String originCountry, String producer, int price,
               int sizeInCm, int powerInWatts, int expirationDate, Color colorOfShining) {
        super(name, originCountry, producer, price, sizeInCm, powerInWatts, expirationDate);
        this.colorOfShining = colorOfShining;
    }
}

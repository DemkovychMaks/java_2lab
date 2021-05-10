package ua.lviv.iot.lightShop;
import lombok.Data;

@Data
public class Goods {
    private String name;
    private String originCountry;
    private String producer;
    private int price;
    private int sizeInCm;
    private int powerInWatts;
    private int expirationDate;
    Goods() {}
    Goods(String name, String originCountry, String producer, int price,
          int sizeInCm, int powerInWatts, int expirationDate ) {
        this.name = name;
        this.originCountry = originCountry;
        this.producer = producer;
        this.price = price;
        this.sizeInCm = sizeInCm;
        this.powerInWatts = powerInWatts;
        this.expirationDate = expirationDate;
    }
}

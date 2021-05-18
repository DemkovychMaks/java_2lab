package ua.lviv.iot.lightShop.LED;
import lombok.Data;
import ua.lviv.iot.lightShop.LED.LED;
import ua.lviv.iot.lightShop.ENUM.Color;
@Data
public class SolarPanel extends LED {
    private double capacity;
    private double productionOfEnergyPerDay;
    public SolarPanel(String name, String originCountry, String producer, int price,
                      int sizeInCm, int powerInWatts, int expirationDate, Color colorOfShining, double capacity, double productionOfEnergyPerDay) {
        super(name, originCountry, producer, price, sizeInCm, powerInWatts, expirationDate, colorOfShining);
        this.capacity = capacity;
        this.productionOfEnergyPerDay = productionOfEnergyPerDay;
    }
}
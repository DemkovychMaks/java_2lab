package ua.lviv.iot.lightShop.models.Led;
import lombok.Data;
import ua.lviv.iot.lightShop.Enum.TypeOfEnergySaving;
import ua.lviv.iot.lightShop.models.Led.Led;
import ua.lviv.iot.lightShop.Enum.Color;

@Data
public class SolarPanel extends Led {
    public SolarPanel() {}
    private double capacity;
    private double productionOfEnergyPerDay;
    public SolarPanel(String name, String originCountry, String producer, int price,
                      int sizeInCm, int powerInWatts, int expirationDate, Color colorOfShining, double capacity, double productionOfEnergyPerDay, TypeOfEnergySaving typeOfEnergySaving) {
        super(name, originCountry, producer, price, sizeInCm, powerInWatts, expirationDate, colorOfShining, typeOfEnergySaving);
        this.capacity = capacity;
        this.productionOfEnergyPerDay = productionOfEnergyPerDay;
    }
}
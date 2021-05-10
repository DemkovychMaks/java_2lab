package ua.lviv.iot.lightShop.Bulb;
import lombok.Data;
import ua.lviv.iot.lightShop.ENUM.TypeOfEnergySaving;

@Data
public class Lamp extends Bulb {
    private String typeOfAppointment;
    private String typeOfMaterial;
    public Lamp(String name, String originCountry, String producer, int price,
                int sizeInCm, int powerInWatts, int expirationDate, TypeOfEnergySaving typeOfEnergySaving, String typeOfAppointment, String typeOfMaterial) {
        super(name, originCountry, producer, price, sizeInCm, powerInWatts, expirationDate, typeOfEnergySaving);
        this.typeOfAppointment = typeOfAppointment;
        this.typeOfMaterial = typeOfMaterial;
    }
}
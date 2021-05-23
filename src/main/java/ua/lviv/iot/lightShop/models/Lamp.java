package ua.lviv.iot.lightShop.models;
import lombok.Data;

@Data
public class Lamp extends Bulb {
    public Lamp() {}
    private String typeOfAppointment;
    private String typeOfMaterial;
    public Lamp(String name, String originCountry, String producer, int price,
                int sizeInCm, int powerInWatts, int expirationDate, String typeOfAppointment, String typeOfMaterial) {
        super(name, originCountry, producer, price, sizeInCm, powerInWatts, expirationDate);
        this.typeOfAppointment = typeOfAppointment;
        this.typeOfMaterial = typeOfMaterial;
    }
}


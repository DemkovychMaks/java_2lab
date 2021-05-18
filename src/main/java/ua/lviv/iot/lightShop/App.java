package ua.lviv.iot.lightShop;

import ua.lviv.iot.lightShop.models.Bulb.*;
import ua.lviv.iot.lightShop.Enum.*;
import ua.lviv.iot.lightShop.models.Good;
import ua.lviv.iot.lightShop.models.Led.*;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        Bulb bulb = new Bulb("ordinary bulb", "Ukraine", "Ukraine", 24, 6, 100, 320, TypeOfEnergySaving.ORDINARY);
        Lamp lamp = new Lamp("modern lamp", "USA", "Philips", 1200, 30, 500, 600, TypeOfEnergySaving.ORDINARY, "desktop", "plastic");
        Led led = new Led("LED", "Japan", "Lebron", 10, 1, 10, 700, Color.RED, TypeOfEnergySaving.ENERGYSAVING);
        LedLamp ledlamp = new LedLamp("modern LED lamp", "Canada", "Samsung", 1600, 50, 200, 365, Color.WHITE, "day light", TypeOfEnergySaving.ENERGYSAVING);
        Garland garland = new Garland("X-Mas garland", "China", "ICICLE", 200, 300, 250, 120, Color.PINK, 250, TypeOfEnergySaving.ORDINARY);
        SolarPanel solarpanel = new SolarPanel("Sun Shine", "German", "Solar Energy", 300, 3000, 300, 920, Color.GREEN, 10000, 60, TypeOfEnergySaving.SOLARPANEL);

        List<Good> store = new ArrayList<>();
        store.add(bulb);
        store.add(lamp);
        store.add(led);
        store.add(ledlamp);
        store.add(garland);
        store.add(solarpanel);

        LightShopManager manager = new LightShopManager(store);

        System.out.println("Before sorting");
        manager.printGoods();
        System.out.println("**********************");
        System.out.println("After sorting by Price(DESC)");
        manager.sortByPrice(SortOrder.DESC);
        manager.printGoods();
        System.out.println("**********************");
        System.out.println("After sorting by Power(DESC)");
        manager.sortByPower(SortOrder.DESC);
        manager.printGoods();

        System.out.println("**********************");
        System.out.println("Searching items with TypeOfEnergy(ORDINARY)");
        manager.searchByEnergySaving(TypeOfEnergySaving.ORDINARY);
        manager.printGoods();
    }
}

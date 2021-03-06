package ua.lviv.iot.lightShop;

import ua.lviv.iot.lightShop.Bulb.*;
import ua.lviv.iot.lightShop.ENUM.*;
import ua.lviv.iot.lightShop.LED.*;

import ua.lviv.iot.lightShop.LightShopManager;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {
        Bulb bulb = new Bulb("ordinary bulb", "Ukraine", "Ukraine", 24, 6, 100, 320, TypeOfEnergySaving.ORDINARY);
        Lamp lamp = new Lamp("modern lamp", "USA", "Philips", 1200, 30, 500, 600, TypeOfEnergySaving.ORDINARY, "desktop", "plastic");
        LED led = new LED("LED", "Japan", "Lebron", 10, 1, 10, 700, Color.RED);
        LedLamp ledlamp = new LedLamp("modern LED lamp", "Canada", "Samsung", 1600, 50, 200, 365, Color.WHITE, "day light");
        Garland garland = new Garland("X-Mas garland", "China", "ICICLE", 200, 300, 250, 120, Color.PINK, 250);
        SolarPanel solarpanel = new SolarPanel("Sun Shine", "German", "Solar Energy", 300, 3000, 300, 920, Color.GREEN, 10000, 60);

        List<Goods> goods = new ArrayList<>();
        goods.add(bulb);
        goods.add(lamp);
        goods.add(led);
        goods.add(ledlamp);
        goods.add(garland);
        goods.add(solarpanel);

        LightShopManager manager = new LightShopManager(goods);

        System.out.println("Before sorting");
        manager.printGoods();

        System.out.println("After sorting by Price(DESC)");
        manager.sortByPrice(SortOrder.DESC);
        manager.printGoods();

        System.out.println("After sorting by Power(DESC)");
        manager.sortByPower(SortOrder.DESC);
        manager.printGoods();

        System.out.println("Searching items with TypeOfEnergy");
        manager.searchByEnergyUse(TypeOfEnergySaving.ORDINARY);
        manager.printGoods();
    }
}

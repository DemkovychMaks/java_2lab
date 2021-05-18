package ua.lviv.iot.lightShop;

import ua.lviv.iot.lightShop.Enum.SortOrder;
import ua.lviv.iot.lightShop.Enum.TypeOfEnergySaving;
import ua.lviv.iot.lightShop.models.Good;

import java.util.*;

import java.util.stream.Collectors;

public class LightShopManager {
    private List <Good> store;

    public LightShopManager(List <Good> store){
        this.store = store;
    }

    public void printGoods() {
        for(Good item : store) {
            System.out.println("---------");
            System.out.println(item);
            System.out.println("price: " + item.getPrice());
            System.out.println("power: " + item.getPowerInWatts());
            System.out.println("---------");
        }
    }

    public void sortByPrice(SortOrder order) {
        if (order == SortOrder.ASC) {
            this.store.sort((firstItem, secondItem) ->
                    firstItem.getPrice() - secondItem.getPrice());
        } else {
            this.store.sort((firstItem, secondItem) ->
                    secondItem.getPrice() - firstItem.getPrice());
        }
    }

    public void sortByPower(SortOrder order) {
        if (order == SortOrder.ASC) {
            this.store.sort((firstItem, secondItem) ->
                    firstItem.getPowerInWatts() - secondItem.getPowerInWatts());
        } else {
            this.store.sort((firstItem, secondItem) ->
                    secondItem.getPowerInWatts()-firstItem.getPowerInWatts());
        }
    }

    public void  searchByEnergySaving(TypeOfEnergySaving typeOfEnergySaving) {
        store = store.stream().filter(item -> item.getTypeOfEnergySaving().equals(typeOfEnergySaving)).collect(Collectors.toList());
    }
}


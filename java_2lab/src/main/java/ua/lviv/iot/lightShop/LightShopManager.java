package ua.lviv.iot.lightShop;

import ua.lviv.iot.lightShop.ENUM.SortOrder;
import ua.lviv.iot.lightShop.ENUM.TypeOfEnergySaving;
import ua.lviv.iot.lightShop.Goods;
import java.util.*;

import java.util.stream.Collectors;

public class LightShopManager {
    private List <Goods> goods;

    public LightShopManager(List<Goods> goods){
        this.goods =  goods;
    }

    public void printGoods() {
        for(Goods item: goods) {
            System.out.println("---------");
            System.out.println(item);
            System.out.println("---------");
            System.out.println("price: " + item.getPrice());
            System.out.println("power : " + item.getPower());
        }
    }

    public void sortByPrice(SortOrder order) {
        if (order == SortOrder.ASC) {
            this.goods.sort((Goods firstItem, Goods secondItem)->
                    firstItem.getPrice()-secondItem.getPrice());
        } else {
            this.goods.sort((Goods firstItem, Goods secondItem)->
                    secondItem.getPrice()-firstItem.getPrice());
        }
    }

    public void sortByPower(SortOrder order) {
        if (order == SortOrder.ASC) {
            this,goods.sort((Goods firstItem, Goods secondItem)->
                    firstItem.getPowerInWatts()-secondItem.getPowerInWatts());
        } else {
            this.goods.sort((Goods firstItem, Goods secondItem)->
                    secondItem.getPowerInWatts()-firstItem.getPowerInWatts());
        }
    }

    public void  searchByEnergyUse(TypeOfEnergySaving typeOfEnergySaving) {
        goods = goods.stream().filter(item -> item.getTypeOfEnergyUse().equals(typeOfEnergySaving)).collect(Collectors.toList());
    }
}

}
package org.example.hwOOP04;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Взять за основу первое дз и добавить параметризацию 
// (Создать единый вендинговый аппарат)
// * - Если по каким - то причинам первое дз не выполнено, 
// классы с первого вебинара прикрепленны к этому уроку
// ВАЖНО!
// Если используете интерфейсы, то нужно реализовывать именно их методы, 
// а не писать собственные с тем же именем

public class Main {
    public static void main(String[] args) {
        VendingMachineAllProducts<BottleOfWater> vmBottle = new VendingMachineAllProducts<>();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Cola.toString(), new BigDecimal(400), 0.4),
                new BottleOfWater(prod.Sprite.toString(), new BigDecimal(250), 0.5),
                new BottleOfWater(prod.Fanta.toString(), new BigDecimal(180), 0.5),
                new BottleOfWater("Лимонад", new BigDecimal(150), 0.8)));
        vmBottle.initProduct(bottleList);
        System.out.println("безалкогольные холодные напитки");
        System.out.println(vmBottle.getProduct("Cola"));
        System.out.println("безалкогольные горячие напитки");
        VendingMachineAllProducts vmHotDrinks = new VendingMachineAllProducts<>();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Кофе", new BigDecimal(300), 0.4, 80),
                new HotDrinks("Чай", new BigDecimal(150), 0.44, 85),
                new HotDrinks("Руссиано", new BigDecimal(200), 0.6, 70)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Tea"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(250)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(72));
    }
}
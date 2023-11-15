package christmas.constant;

import java.util.Arrays;
import java.util.stream.Stream;

public enum FoodName {
    MUSHROOM_SOUP("양송이수프",6000,"APPITIZER"),
    TAPAS("타파스", 6000,"APPITIZER"),
    CEASAR_SALAD("시저샐러드", 6000,"APPITIZER"),
    T_BONE_STAKE("티본스테이크", 6000,"MAIN"),
    BARBECUE_RIBS("바베큐립", 6000,"MAIN"),
    SEAFOOD_PASTA("해산물파스타", 6000,"MAIN"),
    CHRISTMAS_PASTA("크리스마스파스타", 6000,"MAIN"),
    CHOCOLATE_CAKE("초코케이크", 6000,"DESSERT"),
    ICE_CREAM("아이스크림", 6000,"DESSERT"),
    ZERO_COLA("제로콜라", 6000,"DRINK"),
    RED_WINE("레드와인", 6000,"DRINK"),
    CHAMPAGNE("샴페인", 6000,"DRINK");

    private final String name;
    private final int price;
    private final String sort;

    FoodName(String name, int price, String sort) {this.name = name; this.price = price;
        this.sort = sort;
    }

    private String getName() {
        return name;
    }

    private int getPrice() {
        return price;
    }

    private String getSort() {return sort;}

    public static String[] getAllFoodNames() {
        return Arrays.stream(FoodName.values())
                .map(FoodName::getName)
                .toArray(String[]::new);
    }

    public static int getPriceByName(String name) {
        return Stream.of(values())
                .filter(foodName -> foodName.getName().equals(name))
                .findFirst()
                .map(FoodName::getPrice)
                .orElse(0);
    }

    public static boolean isNameAndSortMatch(String name, String sort) {
        return Arrays.stream(values())
                .filter(foodName -> foodName.getSort().equals(sort))
                .anyMatch(foodName -> foodName.getName().equals(name));
    }



}

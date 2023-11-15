package christmas.constant;

public enum FoodName {
    MUSHROOM_SOUP("양송이수프",6000),
    TAPAS("타파스", 6000),
    CEASAR_SALAD("시저샐러드", 6000),
    T_BONE_STAKE("티본스테이크", 6000),
    BARBECUE_RIBS("바베큐립", 6000),
    SEAFOOD_PASTA("해산물파스타", 6000),
    CHRISTMAS_PASTA("크리스마스파스타", 6000),
    CHOCOLATE_CAKE("초콜케이크", 6000),
    ICE_CREAM("아이스크림", 6000),
    ZERO_COLA("제로콜라", 6000),
    RED_WINE("레드와인", 6000),
    CHAMPAGNE("샴페인", 6000);

    private final String name;
    private final int price;

    FoodName(String name, int price) {this.name = name; this.price = price;}

    public String getname() {return name;}



}
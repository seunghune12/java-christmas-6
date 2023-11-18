package christmas.constant;

import java.util.Arrays;

public enum Calendar {
    FIRST(1,"MAIN", false),
    SECOND(2,"MAIN", false),
    THIRD(3,"DESSERT", true),
    FOURTH(4,"DESSERT", false),
    FIFTH(5,"DESSERT", false),
    SIXTH(6,"DESSERT", false),
    SEVENTH(7,"DESSERT", false),
    EIGHTH(8,"MAIN", false),
    NINTH(9,"MAIN", false),
    TENTH(10,"DESSERT", true),
    ELEVENTH(11,"DESSERT", false),
    TWELFTH(12,"DESSERT", false),
    THIRTEENTH(13,"DESSERT", false),
    FOURTEENTH(14,"DESSERT", false),
    FIFTEENTH(15,"MAIN", false),
    SIXTEENTH(16,"MAIN", false),
    SEVENTEENTH(17,"DESSERT", true),
    EIGHTEENTH(18,"DESSERT", false),
    NINETEENTH(19,"DESSERT", false),
    TWENTIETH(20,"DESSERT", false),
    TWENTY_FIRST(21,"DESSERT", false),
    TWENTY_SECOND(22,"MAIN", false),
    TWENTY_THIRD(23,"MAIN", false),
    TWENTY_FOURTH(24,"DESSERT", true),
    TWENTY_FIFTH(25,"DESSERT", true),
    TWENTY_SIXTH(26,"DESSERT", false),
    TWENTY_SEVENTH(27,"DESSERT", false),
    TWENTY_EIGHTH(28,"DESSERT", false),
    TWENTY_NINTH(29,"MAIN", false),
    THIRTIETH(30,"MAIN", false),
    THIRTY_FIRST(31,"DESSERT", true);

    private final int date;

    private final String saleSort;

    private final boolean star;


    Calendar(int date, String saleSort, boolean star) {
        this.date = date;
        this.saleSort = saleSort;
        this.star = star;
    }

    public int getDate() {
        return date;
    }

    public String getSaleSort() {
        return saleSort;
    }

    public boolean isStar() {
        return star;
    }

    // date 값을 기반으로 star 값을 반환하는 메소드
    public static boolean isStarByDate(int date) {
        return Arrays.stream(values())
                .filter(calendar -> calendar.getDate() == date)
                .findFirst()
                .map(Calendar::isStar)
                .orElse(false);
    }

    public static String getSaleSortByDate(int date) {
        return Arrays.stream(values())
                .filter(calendar -> calendar.getDate() == date)
                .findFirst()
                .map(Calendar::getSaleSort)
                .orElse(null);
    }
}

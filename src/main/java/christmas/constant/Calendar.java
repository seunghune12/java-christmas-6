package christmas.constant;

import java.util.Arrays;

public enum Calendar {
    FIRST(1,"WEEKEND", false),
    SECOND(2,"WEEKEND", false),
    THIRD(3,"WEEKDAY", true),
    FOURTH(4,"WEEKDAY", false),
    FIFTH(5,"WEEKDAY", false),
    SIXTH(6,"WEEKDAY", false),
    SEVENTH(7,"WEEKDAY", false),
    EIGHTH(8,"WEEKEND", false),
    NINTH(9,"WEEKEND", false),
    TENTH(10,"WEEKDAY", true),
    ELEVENTH(11,"WEEKDAY", false),
    TWELFTH(12,"WEEKDAY", false),
    THIRTEENTH(13,"WEEKDAY", false),
    FOURTEENTH(14,"WEEKDAY", false),
    FIFTEENTH(15,"WEEKEND", false),
    SIXTEENTH(16,"WEEKEND", false),
    SEVENTEENTH(17,"WEEKDAY", true),
    EIGHTEENTH(18,"WEEKDAY", false),
    NINETEENTH(19,"WEEKDAY", false),
    TWENTIETH(20,"WEEKDAY", false),
    TWENTY_FIRST(21,"WEEKDAY", false),
    TWENTY_SECOND(22,"WEEKEND", false),
    TWENTY_THIRD(23,"WEEKEND", false),
    TWENTY_FOURTH(24,"WEEKDAY", true),
    TWENTY_FIFTH(25,"WEEKDAY", true),
    TWENTY_SIXTH(26,"WEEKDAY", false),
    TWENTY_SEVENTH(27,"WEEKDAY", false),
    TWENTY_EIGHTH(28,"WEEKDAY", false),
    TWENTY_NINTH(29,"WEEKEND", false),
    THIRTIETH(30,"WEEKEND", false),
    THIRTY_FIRST(31,"WEEKDAY", true);

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

package christmas.constant;

public enum Calendar {
    FIRST(1,"main", false),
    SECOND(2,"main", false),
    THIRD(3,"dessert", true),
    FOURTH(4,"dessert", false),
    FIFTH(5,"dessert", false),
    SIXTH(6,"dessert", false),
    SEVENTH(7,"dessert", false),
    EIGHTH(8,"main", false),
    NINTH(9,"main", false),
    TENTH(10,"dessert", true),
    ELEVENTH(11,"dessert", false),
    TWELFTH(12,"dessert", false),
    THIRTEENTH(13,"dessert", false),
    FOURTEENTH(14,"dessert", false),
    FIFTEENTH(15,"main", false),
    SIXTEENTH(16,"main", false),
    SEVENTEENTH(17,"dessert", true),
    EIGHTEENTH(18,"dessert", false),
    NINETEENTH(19,"dessert", false),
    TWENTIETH(20,"dessert", false),
    TWENTY_FIRST(21,"dessert", false),
    TWENTY_SECOND(22,"main", false),
    TWENTY_THIRD(23,"main", false),
    TWENTY_FOURTH(24,"dessert", true),
    TWENTY_FIFTH(25,"dessert", true),
    TWENTY_SIXTH(26,"dessert", false),
    TWENTY_SEVENTH(27,"dessert", false),
    TWENTY_EIGHTH(28,"dessert", false),
    TWENTY_NINTH(29,"main", false),
    THIRTIETH(30,"main", false),
    THIRTY_FIRST(31,"dessert", true);

    private final int date;

    private final String saleSort;

    private final boolean star;


    Calendar(int date, String saleSort, boolean star) {
        this.date = date;
        this.saleSort = saleSort;
        this.star = star;
    }
}

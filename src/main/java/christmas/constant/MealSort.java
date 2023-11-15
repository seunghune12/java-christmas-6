package christmas.constant;

public enum MealSort {
    APPITIZER("에피타이저"),
    MAIN("메인"),
    DISSERT("디저트"),
    DRINK("음료");

    private final String sortName;

    MealSort(String sortName) {
        this.sortName = sortName;
    }
}

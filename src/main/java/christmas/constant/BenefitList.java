package christmas.constant;

public enum BenefitList {
    CHRISTMAS("크리스마스 디데이 할인: "),
    WEEKDAY("평일 할인: "),
    WEEKEND("평일 할인: "),
    STAR("특별 할인: "),
    GIFT("증정 이벤트: ");


    private final String eventName;

    BenefitList(String eventName) {
        this.eventName = eventName;
    }

    public String getEventName() {
        return eventName;
    }


    public static String getEventNameByValue(String value) {
        for (BenefitList benefit : BenefitList.values()) {
            if (benefit.getEventName().equals(value)) {
                return benefit.name();
            }
        }
        return null;
    }
}

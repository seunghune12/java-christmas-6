package christmas.view;



public class OutputView {
    public static void printResultStart(int orderDay){
        System.out.printf("12월 " + orderDay + "일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        System.out.println();
    }

    public static void printOrderedMenus(){
        System.out.println("<주문 메뉴>");
    }

    public static void printTotalPrice(){
        System.out.println("<할인 전 총주문 금액>");
    }

    public static void printGiftMenu(){
        System.out.println("<증정 메뉴>");
    }

    public static void printBenefitList(){
        System.out.println("<혜택 내역>");
    }

    public static void printTotalBenefitPrice(){
        System.out.println("<총혜택 금액>");
    }

    public static void printDiscountPrice(){
        System.out.println("<할인 후 예상 결제 금액>");
    }

    public static void printDecemverEventBadge(){
        System.out.println("<12월 이벤트 배지>");
    }
}

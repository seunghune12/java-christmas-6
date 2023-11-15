package christmas.view;



public class OutputView {
    public static void printResultStart(int orderDay){
        System.out.println("12월 " + orderDay + "일에 우테코 식당에서 받을 이벤트 혜택 미리 보기!");
        System.out.println();
    }

    public static void printEnter(){
        System.out.println();
    }

    public static void printOrderedMenus(){
        System.out.println("<주문 메뉴>");
    }

    public static void printTotalPriceBeforeDiscount(){
        System.out.println("<할인 전 총주문 금액>");
    }

    public static void printGiftMenu(){
        System.out.println("<증정 메뉴>");
    }

    public static void printChampagne(){
        System.out.println("샴페인 1개");
    }

    public static void printNone() {
        System.out.println("없음");
    }

    public static void printBenefitList(){
        System.out.println("<혜택 내역>");
    }

    public static void printTotalDiscountPrice(){
        System.out.println("<총혜택 금액>");
    }

    public static void printDiscountedPrice(){
        System.out.println("<할인 후 예상 결제 금액>");
    }

    public static void printDecemberEventBadge(){
        System.out.println("<12월 이벤트 배지>");
    }

    public static void printStarBadge(){
        System.out.println("별");
    }

    public static void printTreeBadge(){
        System.out.println("트리");
    }

    public static void printSantaBadge(){
        System.out.println("산타");
    }


}

package christmas.validator;

import java.util.ArrayList;
import java.util.List;

public class MenuValidator {

    public static Integer validateNumber(String menuNumber){
        try {
            Integer intValue = Integer.parseInt(menuNumber);
            checkOrderNumber(intValue);
            return intValue;

        } catch (IllegalArgumentException e) {
            System.out.println("숫자가 아님!");
        }
        return null;
    }

    private static void checkOrderNumber(int orderNumber){
        if(20 < orderNumber){
            throw new IllegalArgumentException("주문은 20인분을 넘을 수 없습니다!");
        }
    }
}

package christmas.validator;

import static christmas.constant.FoodName.getAllFoodNames;

import christmas.constant.FoodName;
import java.util.Arrays;
import java.util.List;

public class MenuValidator {

    public static Integer validateNumber(String menuNumber){
        try {
            Integer intValue = Integer.parseInt(menuNumber);
            validateOrderNumber(intValue);
            return intValue;

        } catch (IllegalArgumentException e) {
            System.out.println("숫자가 아님!");
        }
        return null;
    }

    private static void validateOrderNumber(int orderNumber){
        if(20 < orderNumber){
            throw new IllegalArgumentException("주문은 20인분을 넘을 수 없습니다!");
        }
    }

    public static String validatefoodName(String name){
        List<String> foodNameList = Arrays.asList(FoodName.getAllFoodNames());
        if (!foodNameList.contains(name)) {
            throw new IllegalArgumentException("요리 이름이 잘못 입력되었습니다. 확인해주세요");
        }
        return name;
    }
}

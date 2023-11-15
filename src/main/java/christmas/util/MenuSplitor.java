package christmas.util;

import christmas.domain.Menu;
import christmas.validator.MenuValidator;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuSplitor {

    public static Map<String,Integer> splitMenus(String order) {
        
        try {
            List<String> menues = List.of(order.split(","));
            Map<String,Integer> resultMap = new HashMap<>();
            return splitMenu(menues, resultMap);

        }catch(IllegalArgumentException e){
            System.out.println(",로 나눌수 없는 형식!");
        }
        return null;
    }

    public static Map<String,Integer> splitMenu(
            List<String> menues, Map<String,Integer> resultMap){
        System.out.println(menues);
        try{
            for (String menu : menues) {
                System.out.println(menu);
                String[] parts = menu.split("-");
                System.out.println(Arrays.toString(parts));
                resultMap.put(MenuValidator.validatefoodName(parts[0]), MenuValidator.validateNumber(parts[1]));
            }
            return resultMap;

        }catch(IllegalArgumentException e){
            System.out.println("-로 나눌 수 없는 형식");
        }
        return null;
    }
}

package christmas.util;

import christmas.validator.MenuValidator;
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

        try{
            for (String menu : menues) {
                String[] parts = menu.split("-");
                resultMap.put(parts[0], MenuValidator.validateNumber(parts[1]));
            }
            return resultMap;

        }catch(IllegalArgumentException e){
            System.out.println("-로 나눌 수 없는 형식");
        }
        return null;
    }
}

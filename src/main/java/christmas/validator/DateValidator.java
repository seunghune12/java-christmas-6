package christmas.validator;

import jdk.jshell.spi.ExecutionControl.RunException;

public class DateValidator {

    public static int validateDate(String input) {
        validateInputType(input);

        try {
            if (input == null) {
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            }

            int date = Integer.parseInt(input);

            if (date < 1 || date > 31) {
                throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
            }

            return date;

        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜 형식입니다. 다시 입력해 주세요.");
        }
    }

    private static void validateInputType(String input) {
        if (!(input instanceof String)) {
            throw new IllegalArgumentException("[ERROR] 유효하지 않은 날짜입니다. 다시 입력해 주세요.");
        }
    }
}
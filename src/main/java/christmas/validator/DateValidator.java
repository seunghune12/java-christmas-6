package christmas.validator;

public class DateValidator {

    public static int dalivateDate(String input){
        try{
            int date = Integer.parseInt(input);

            if(input == null){
                throw new IllegalArgumentException();
            }else if(date < 1 || 31 < date) {
                throw new IllegalArgumentException();
            }

            return date;

        }catch(IllegalArgumentException e){
            throw new IllegalArgumentException();
        }
    }
}

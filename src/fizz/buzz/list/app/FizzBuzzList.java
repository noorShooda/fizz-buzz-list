package fizz.buzz.list.app;

import fizz.buzz.list.helpers.Helpers;

public class FizzBuzzList {
    public static void main(String[] args) {
        Helpers convertHelper;
        convertHelper = new Helpers();

        for (int i = 1; i <= 100; i++) {
            String result = convertHelper.convertFizzBuzz(i);
            System.out.println(result);
        }
    }
}

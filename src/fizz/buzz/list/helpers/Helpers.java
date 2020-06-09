package fizz.buzz.list.helpers;

public class Helpers {

    public Helpers() {

    }

    public Boolean divisibleByThree(int value) {
        if(value % 3 == 0) {
            return true;
        }
        return false;
    }
    public Boolean divisibleByFive(int value) {
        if(value % 5 == 0) {
            return true;
        }
        return false;
    }
    public Boolean divisibleByFifteen(int value) {
        if(value % 15 == 0) {
            return true;
        }
        return false;
    }
    public String convertFizzBuzz(int numberToCheck) {
        if(divisibleByFifteen(numberToCheck)) {
            return("FizzBuzz " + numberToCheck);
        } else if(divisibleByThree(numberToCheck)){
            return("Fizz " + numberToCheck);
        } else if(divisibleByFive(numberToCheck)){
            return("Buzz " + numberToCheck);
        }
        else{
            return(Integer.toString(numberToCheck));
        }
    }
}

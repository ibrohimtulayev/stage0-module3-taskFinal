package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int firstDigit = number / 100;
        int secondDigit = (number / 10) % 10;
        int thirdDigit = number % 10;
        System.out.println(thirdDigit * 100 + secondDigit * 10 + firstDigit);
    }
}

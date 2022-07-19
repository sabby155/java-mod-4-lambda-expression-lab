import java.util.function.IntUnaryOperator;

public class Main {
	// write the nextOddNum here
    public static WhateverYourInterfaceIsCalled nextOddNum = (num) -> {
//        Taken from https://stackoverflow.com/questions/11194087/next-odd-number-in-javascript
        return num + num % 2 | 1;
    };
    
    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;


        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
}

@FunctionalInterface
interface WhateverYourInterfaceIsCalled {
    int applyAsInt(int num);
}

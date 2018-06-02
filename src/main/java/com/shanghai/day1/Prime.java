package com.shanghai.day1;

import java.util.ArrayList;
import java.util.List;

public class Prime {

    public static List getPrime(int input) {

        List result = new ArrayList();

        for (int i = 2; i < input; i++) {
            while (input % i == 0) {
                result.add(i);
                input = input / i;
            }
        }

        if (input > 1) {
            result.add(input);
        }

        return result;
    }
}

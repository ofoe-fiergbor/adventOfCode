package io.iamofoe;

import java.util.List;

public class Day3 {
    public static void main(String[] args) {

        List<String> binaryNumbers = List.of(
                "00100",
                "11110",
                "10110",
                "10111",
                "10101",
                "01111",
                "00111",
                "11100",
                "10000",
                "11001",
                "00010",
                "01010");


        System.out.println(calculatePowerConsumption(binaryNumbers));
    }


    static int calculatePowerConsumption(List<String> binaryNumbers) {
        int counterForOne = 0;
        int counterForZero = 0;

        StringBuilder gammaRate = new StringBuilder();
        StringBuilder epsilonRate = new StringBuilder();

        for (int i = 0; i < binaryNumbers.get(0).length(); i++) {
            for (String binaryNumber : binaryNumbers) {
                if (binaryNumber.charAt(i) == '0') {
                    counterForZero++;
                } else counterForOne++;
            }
            gammaRate.append(counterForOne > counterForZero ? '1' : '0');
            epsilonRate.append(counterForOne > counterForZero ? '0' : '1');
            counterForOne = 0;
            counterForZero = 0;
        }
        return Integer.parseInt(gammaRate.toString(), 2) * Integer.parseInt(epsilonRate.toString(), 2);
    }
}

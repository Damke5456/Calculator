package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();

        double result;

        String empty = " ";
        char operator = scanner.next().charAt(0);

        if (number1 == number2) {
            System.out.println("0");
        } else {
            switch (operator) {

                case '+':
                    result = number1 + number2;
                    System.out.println(result);
                    break;

                case '-':
                    result = number1 - number2;
                    System.out.println(result);
                    break;

                case '*':
                    result = number1 * number2;
                    System.out.println(result);
                    break;

                case '/':
                    if (number2 == 0){
                        System.out.println("-1");
                    }else {
                        result = number1 / number2;
                        System.out.println(result);
                    }
                    break;

                default:
                    System.out.println("Error!");
            }
        }
    }
}
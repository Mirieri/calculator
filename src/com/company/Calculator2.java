package com.company;

public class Calculator2 {

    public static void main(String[] args) {
        calc c = new calc();
        String s1 = c.getInput("Enter a numeric value: ");
        String s2 = c.getInput("Enter a numeric value: ");
        String op = c.getInput("Choose an operation (+ - * / %):");

        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = c.addValues(s1, s2);
                    break;
                case "-":
                    result = c.subtractValues(s1, s2);
                    break;
                case "*":
                    result = c.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = c.divideValues(s1, s2);
                    break;
                case "%":
                    result = c.modValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception m) {
            System.out.println("Number formatting exception " + m.getMessage());
        }
    }




}

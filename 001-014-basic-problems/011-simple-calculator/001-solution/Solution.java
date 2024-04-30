/**
 * Problem: Simple calculator.
 */

public class Solution {
    public float calculate(float a, float b, char op) throws IllegalArgumentException {
        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;

            case '%':
                return a % b;

            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
    }
}

/*
 * Enter the first number:
 * 12.45
 * 
 * Enter the second number:
 * 16.87
 * 
 * Enter the operator:
 * +
 * 
 * Result:
 * 29.32
 */

/*
 * Enter the first number:
 * 18.97
 * 
 * Enter the second number:
 * 17.86
 * 
 * Enter the operator:
 * -
 * 
 * Result:
 * 1.1099987
 */

/*
 * Enter the first number:
 * 17.56
 * 
 * Enter the second number:
 * 21.67
 * 
 * Enter the operator:
 * *
 * 
 * Result:
 * 380.52518
 */

/*
 * Enter the first number:
 * 17.87
 * 
 * Enter the second number:
 * 12.65
 * 
 * Enter the operator:
 * /
 * 
 * Result:
 * 1.4126483
 */

/*
 * Enter the first number:
 * 16.98
 * 
 * Enter the second number:
 * 11.24
 * 
 * Enter the operator:
 * %
 * 
 * Result:
 * 5.74
 */
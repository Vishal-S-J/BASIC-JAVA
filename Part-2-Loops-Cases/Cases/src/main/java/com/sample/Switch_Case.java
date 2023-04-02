package com.sample;

/**
 * The Java switch statement executes one statement from multiple conditions.
 * It is like if-else-if ladder statement.
 * The switch statement works with byte, short, int, long, enum types, String and
 * some wrapper types like Byte, Short, Int, and Long. You can use strings in the switch statement.
 *
 * Points -
 * - There can be one or N number of case values for a switch expression.
 * - The case value must be of switch expression type only.
 *      The case value must be literal or constant.
 *      It doesn't allow variables.
 * - The case values must be unique.
 *      In case of duplicate value, it renders compile-time error.
 * - Each case statement can have a break statement which is optional.
 *      When control reaches to the break statement, it jumps the control after the switch expression.
 *      If a break statement is not found, it executes the next case.
 * - The case value can have a default label which is optional.
 *
 * Syntax -
 * switch(expression){
 * case value1:
 *      //code to be executed;
 *      break;  //optional
 * case value2:
 *      //code to be executed;
 *      break;  //optional
 * ......
 * default:
 *      code to be executed if all cases are not matched;
 * }
 * */

public class Switch_Case {
    public static void main(String[] args) {
        int number=20;

        switch(number){
            case 10: System.out.println("10");
                break;
            case 20: System.out.println("20");
                break;
            case 30: System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
                break;
        }
    }
}

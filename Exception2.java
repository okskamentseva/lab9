package com.company;

import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }
//		catch (Exception e) {
//			System.out.println("Exception! Alarm! Exception!");
//		}
        catch (ArithmeticException e) {
            System.out.println("Attempted division by zero");
        }
        catch (NumberFormatException e) {
            System.out.println("Hey! Integers only");
        }
        finally {
            System.out.println("The end");
        }
    }
}

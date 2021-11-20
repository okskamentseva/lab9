package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Работа с исключениями. Основы Try-Catch-Finally\n");
		Exception1 e1 = new Exception1();
		e1.exceptionDemo();

		Exception2 e2 = new Exception2();
		e2.exceptionDemo();

        System.out.println("Работа с исключениями. Генерация собственных исключений\n");
        ThrowsDemo e3 = new ThrowsDemo();
		e3.printMessage(null);
		e3.printMessage("Hello");

        ThrowsDemo_z6 e4 = new ThrowsDemo_z6();
		e4.printDetails("");
		e4.printDetails("Hello");
        e4.getKey();

        ThrowsDemo_z7 e5 = new ThrowsDemo_z7();
        e5.getKey();
    }
}

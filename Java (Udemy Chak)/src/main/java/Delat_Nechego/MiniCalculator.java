package Delat_Nechego;

import java.util.Scanner;
//Создайте программу, которая складывает / перемножает / вычитает / делит два числа и выводит на экран результат.
//Оба числа и желаемая операция должны приходить в аргументах	Ввод: 12 40 sum
//Вывод: 52


public class MiniCalculator {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);

        System.out.println("Первое число");
        int a = sc1.nextInt();
        System.out.println("Второе число");
        int b = sc2.nextInt();
        System.out.println("Что с ними сделать? ");
        String c = sc3.nextLine();


        switch (c) {


            case "sum":
                System.out.println("Если сумировать : " + (a + b));
                break;
            case "min":
                System.out.println("Если отнять : " + (a - b));
                break;
            case "div":
                System.out.println("Если поделить : " + (a / b));
                break;
            case "mul":
                System.out.println("Если уминожить : " + (a * b));
                break;
            default:
                System.out.println("Укажите правильно, что сделать необходимо");

        }


    }

}





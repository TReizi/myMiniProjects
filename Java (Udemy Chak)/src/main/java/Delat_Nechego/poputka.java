package Delat_Nechego;
/*Task from the NIX website.
Рандом числа -> день недели
 */

public class poputka {

    public static void nedela() {
        int nedelaChislo = 1 + (int) (Math.random() * 7);

        System.out.println(nedelaChislo);

        switch (nedelaChislo) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Нет такого дня, но и его показывать не будет)");
        }


    }

    public static void main(String[] args) {
        nedela();


    }
}

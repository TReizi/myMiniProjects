package Delat_Nechego;
// Все задания взяты с сайта NIX.
//2 варианта решения.

//Создайте программу, которая выводит введенные имя и фамилию на экран в разных строках. Имя и фамилия должны приходить в аргументах	Ввод: Ivan Ivanov
//Вывод:
//Ivan
//Ivanov
public class IvanIvanov {

    String name;
    String surname;

  IvanIvanov(String name, String surname){
      this.name= name;
      this.surname = surname;

  }




    public static void Ivan(String s) {
        String s1 = s.toUpperCase();
        char c1;
        char c2;


        for (int i = 0; i < s.length(); i++) {
            c1 = s.charAt(i);
            c2 = s1.charAt(i);
            if (c1 == c2) {
                System.out.println();
                System.out.print(c1);
                continue;
            }
            System.out.print(c1);

        }
        System.out.println();
    }


    public static void main(String[] args) {
        IvanIvanov i1 = new IvanIvanov("Petro","Petrov");
        System.out.println("Имя i1 "+ i1.name);
        System.out.println("Фамилия i1 " +i1.surname);

        System.out.println("Или красивый вывод)");
        Ivan("Nazar Drugan");


    }
}

package Lesson16;

public class test1 {
    public static void main(String[] args) {
        String s1 = new String(" abcdefgabc ");
        String s2 = new String("Privet:2");

        int a = s1.length(); // количество
        System.out.println(a);

        char c1 = s1.charAt(3); // что находится на индексе
        System.out.println(c1);

        int i1 = s1.indexOf('c'); // на каком индексе находится
        System.out.println(i1);

        int i4 = s1.indexOf('a', 5); // на каком индексе находится начиная с 5
        System.out.println(i4 + " i4");

        boolean b1 = s1.startsWith("abc", 7); //начинается с abc? true/false. 7 - начиная с симовла
        System.out.println(b1);

        boolean b2 = s1.endsWith("bc");   //заканчивается bc? true/false.
        System.out.println(b2);

        String s10 = s1.substring(3, 7); //создай с10 и присвой ему с 3  по 7 индекса с с1
        System.out.println(s10);

        String s11 = s1.trim();//убирает пробелы внчале и конце
        System.out.println(s11);

        String s12 = s2.replace('r', 'S');//меняем r на S
        System.out.println(s12);

        String s13 = s2.replace("vet", "vivka");
        System.out.println(s13);


        String s14 = "Privet, ";
        String s15 = "Drug";
        System.out.println(s14.concat(s15));


        String s16 = s2.toLowerCase(); //все буквы стали маленькие
        System.out.println(s16);


        String s17 = s2.toUpperCase(); //все буквы большие
        System.out.println(s17);



        boolean b3 = s2.contains(":2"); // содержит :2?
        System.out.println(b3);
    }
}

package Lesson16;

public class zadanie {

    public static void email(String s) {
        int a = 0;
        int b = 0;
        int c = 0;

        while (c < s.length() - 1) {
            a = s.indexOf('@', c);
            b = s.indexOf('.', c);
            c = s.indexOf(';', c + 1);
            System.out.println(s.substring(a + 1, b));


        }
    }
}

class emailTest {
    public static void main(String[] args) {
        zadanie z1 = new zadanie();
        z1.email("dsfsdfs@gmail.com;asdasdasd@mail.ru;asdeqwe@yandex.com");
    }

}




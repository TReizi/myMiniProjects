package Lesson16;

//Создайте класс, в котором создайте метод email. Данный
//метод должен принимать в инпут 1 String параметр. Данный
//параметр должен содержать в себе email-ы в следующем
//виде: ya@yahoo.com; on@mail.ru; ona@gmail.com; , т.е.
//После каждого e-mail должен стоять знак препинания “;”. Ваш
//метод должен выводить на экран информацию о том, какой
//почтой пользуются, исходя из параметра, т.е. оутпут должен
//быть следующего вида:
//yahoo
//mail
//gmail
// Продемонстрируйте данный метод.
//

//Немного по другому реализовал решение, показался второй вариант более качественей.




public class Delete {





/*
    public void email(String mail) {
        int a = 0;
        int b = 0;
        int c = 0;
        while (c < mail.length() - 1) {
            a = mail.indexOf('@');
            b = mail.indexOf('.', c-1);
            c = mail.lastIndexOf(';', c+1);
            System.out.println(mail.substring(a + 1, b));

        }
    }

*/

public void email(String mail){
    String post = mail;
    String[]peopleArray = post.split(";");
    for(String human : peopleArray){
        System.out.println(human);
    }



}

    public static void main(String[] args) {
        Delete d1 = new Delete();
        d1.email("dsfsdfs@gmail.com; asdaswqe@gmail.com;qweqweqop@gmaiul.com;");
    }
    }

package Lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good day");
        StringBuilder sb3 = new StringBuilder(50); // его вместимость будет 50 (capacity)
        StringBuilder sb4 = new StringBuilder(sb3);

        System.out.println(sb2.charAt(3));
        System.out.println(sb2.indexOf("d", 2));


        String s = sb2.substring(3);
        System.out.println(s);
        String s2 = sb2.substring(5, 8); //отрывок

        System.out.println(sb2.subSequence(5, 8));

        //     sb2.append(22); //в конец добавляет доп значение, меняет сам стринг Билдер
        //     System.out.println(sb2);
        //    sb2.append(sb2);
        //  System.out.println(sb2);

        sb2.insert(4,55);
        System.out.println(sb2);

        StringBuilder sb10 = new StringBuilder("Hello World");
 //       sb10.delete(3,6);
 //       System.out.println(sb10);
        sb10.deleteCharAt(6);
        System.out.println(sb10);
        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0,5,"Pete ");
        System.out.println(sb12);

        System.out.println(sb1.capacity());


    }
}

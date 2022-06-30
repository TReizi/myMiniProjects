package Lesson17;

public class Test2 {

    // Создайте класс, в котором создайте метод ravenstvo. Инпут
    // параметрами данного метода будут 2 объекта класса
    // StringBuilder. Метод должен иметь boolean return type,
    //возвращать true, если значения объектов совпадают, false –
    //если не совпадают.
    //Продемонстрируйте данный метод


    //   public static void ravenstvo(StringBuilder sbOne, StringBuilder sbTwo) {
    //       String s1 = new String(sbOne);
    //       String s2 = new String(sbTwo);
    //
    //       System.out.println("Одинаковые значениея? " + s1.equals(s2));
    //
    //
    //   }

    public static boolean ravenstvo(StringBuilder sbOne, StringBuilder sbTwo) {
        boolean result = true;

        if (sbOne.length() == sbTwo.length()) {
            for (int i = 0; i < sbOne.length(); i++) {
                if (sbOne.charAt(i) != sbTwo.charAt(i)) {
                    result =false;
                    break;

                }


            }
            }else{
            result =false;

        }


        return result;


    }


    public static void main(String[] args) {
        StringBuilder sbOne = new StringBuilder("OneTwo");
        StringBuilder sbTwo = new StringBuilder("OneTwo");
        ravenstvo(sbOne, sbTwo);
        boolean a = Lesson17.Test2.ravenstvo(sbOne,sbTwo);
        System.out.println(a);
    }
}


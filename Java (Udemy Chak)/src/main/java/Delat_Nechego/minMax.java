package Delat_Nechego;
//
//Напишите программу, которая посчитает min и max значение в массиве. Проверьте работу программы на нескольких массивах	Ввод: [24, 13, -1, 2, 4, 70, 44]
//Вывод: min = -1, max = 70

public class minMax {

    public static void minMax (int [] array){
        int max = array[0];
        int min = array[0];

        for(int i = 1;i < array.length;i++){
            if(array[i]> max){
                max = array[i];

            }
            if(array[i]< min){
                min = array[i];
        }

    }
        System.out.println( "min = "+min+ " max = "+max);
}

    public static void main(String[] args) {
        int [] array1 = {24, 13, -1, 2, 4, 70, 44};
        minMax(array1);
    }
}

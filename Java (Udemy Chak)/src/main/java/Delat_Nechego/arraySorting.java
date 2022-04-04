package Delat_Nechego;
//Напишите программу, которая отсортирует массив по возрастанию. Проверьте работу программы на нескольких массивах	Ввод: [24, 13, -1, 2, 4, 70, 44]
//Вывод: [-1, 2, 4, 13, 24, 44, 70]
import java.util.Arrays;


public class arraySorting {
    public static void sortign(int [] array){
        Arrays.sort(array);
        for(int i = 0;i < array.length;i++){
            System.out.print(array[i]+" ");
        }

    }

    public static void main(String[] args) {
        int [] array1 = {24, 13, -1, 2, 4, 70, 44};
       sortign(array1);
    }
}

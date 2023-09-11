package org.mospower;
/*
Дан произвольный массив чисел (тип данных “int”) размера m.
Необходимо рассчитать и вывести в консоль среднее значение
всех элементов массива,возведённых в квадрат.
 */
public class Upr1 {
    public static void main(String[] args) {
        int[] array = {5,8,1,6,3};
        int sum = 0;

        for (int i = 0; i<array.length; i++){
            int squared = array[i]*array[i];
            sum+=squared;
        }
        int average = sum / array.length;
        System.out.println(average);
    }
}

package org.mospower;
/*Дан произвольный массив чисел (тип данных “int”) размера m.
Необходимо отсортировать заданный массив по возрастанию.
 */
public class Upr2 {
    public static void main(String[] args) {
        int[] array = {10,1,5,7,8,3};
        for (int i = 0; i < array.length - 1; i++ ){
            for (int j = i + 1; j < array.length; j++){
                if(array[j]<array[i]){
                    int count = array[j];
                    array[j]=array[i];
                    array[i]=count;
                }
            }
        }
        for (int i=0 ; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}

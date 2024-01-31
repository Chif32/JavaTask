package src;

public class Main {
    public static void main(String[] args) {
        int array [] = new int[50];
        int max = array[0];
        int min = 1;
        int sum = array[0];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)((Math.random()*50+0)+1);
            if (max<array[i]){
                max = array[i];
            }if(min > array[i]){
                min = array[i];
            }
            sum += array[i];
        }
        sum = sum/array.length;
        System.out.println("max число в массиве: "+max);
        System.out.println("min число в массиве: "+min);
        System.out.println("средн значение в массиве: "+sum);
    }
}


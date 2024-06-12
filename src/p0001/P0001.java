package p0001;

import java.util.Random;
import java.util.Scanner;

public class P0001 {
    private Scanner sc=new Scanner(System.in);
    private static P0001 s=new P0001();
    public static void main(String[] args) {
        int n = s.inputPostiveInteger("Enter number of array:", 0,Integer.MAX_VALUE);
        int[] arr = s.arrayrandom(n);
        s.display("unsort", arr);
        s.Bubblesort(arr);
        s.display("sorted", arr);
    }
    public int inputPostiveInteger(String mess, int min, int max){
       System.out.println(mess);
        while (true) {
            String input = sc.nextLine();
            try {
                int numb = Integer.parseInt(input);
                if (numb <= min || numb > max) {
                    System.out.println("Invalid input. Please re-enter input greater than 0 " );
                    continue;
                }
                return numb;
            } catch (NumberFormatException e) {
                System.out.print("Please input an integer number: ");
            }
        }
    }
    public  int[]  arrayrandom (int sizearray){
         int [] array = new int[sizearray];
         Random rd = new Random();
         for ( int i = 0 ; i < array.length ; i++){
             array[i] = rd.nextInt(array.length);
         }
         return array;
     }
    public void display(String mess, int[] arr) {
        System.out.print(mess+": ");
        for(int i=0;i<arr.length;i++){
            if(i==0)System.out.print("["+arr[0]+", ");
            else if(i==arr.length-1)System.out.print(arr[arr.length-1]+"]");
            else System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public void Bubblesort(int[] arr) {
        int temp;
       boolean swap;
        for (int i = 0; i < arr.length- 1; i++) {
            swap=false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                   swap=true;
                }
            }
            s.display("Array", arr);
            if(swap==false)break;
        }
    }
}





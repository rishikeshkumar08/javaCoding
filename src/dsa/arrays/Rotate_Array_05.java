package dsa.arrays;

import java.util.Arrays;
import java.util.Scanner;

class Rotate_Array_05{
    public static void main(String[] args) {

        Rotate_Array_05 obj = new Rotate_Array_05();

        //Static
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {5,4,3,2,1};
        int[] arr = {9,8,7,6,5};
        System.out.println(Arrays.toString(obj.rotateArray(arr, 2)));

        //Dynamic
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int n = sc.nextInt();
        int[] arrD = new int[n];
        for (int i=0; i<arrD.length; i++){
            System.out.println("enter the "+ i + " index array value ");
            arrD[i] = sc.nextInt();
        }
        System.out.println("Enter the rotate value: ");
        int rotate = sc.nextInt();
        System.out.println(Arrays.toString(obj.rotateArray(arrD,rotate)));
    }

    public int[] rotateArray(int[] arr, int rotate){
        if (rotate == 0) return arr;

        //First rotate array the array from 0 to rotate point
        reverse(arr, 0, rotate-1);

        //Then after rotate array from rotate to end of arr;
        reverse(arr, rotate, arr.length-1);

        reverse(arr, 0, arr.length-1);

        return arr;
    }

    public void reverse(int[] arr, int left, int right){

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
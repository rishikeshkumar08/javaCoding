package dsa.arrays;

public class ContainerWithMostWater_01{
    public static void main(String[] arg){
        int[] arr = {1, 8, 6,2, 5, 4, 8, 3, 7};
        System.out.println(containerWithMostWater(arr));
    }

    public static int containerWithMostWater(int[] hight){
        int left = 0, right = hight.length-1, maxWater=0;
        while(left < right){
            int h = Math.min(hight[left], hight[right]);
            int current = h * (right - left);
            maxWater = Math.max(maxWater, current);

            if(hight[left] < hight[right]){
                left++;
            }
            else right--;
        }
        return maxWater;
    }
}


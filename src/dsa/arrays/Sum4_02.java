package dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4_02{
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        int target = 0;
        System.out.println(sumFour(arr, target));
    }

    public static List<List<Integer>> sumFour(int[] num, int target){
        List<List<Integer>> result = new ArrayList<>();
        int n=num.length;

        Arrays.sort(num);

        for (int i=0; i<n-3; i++) {
            if (i > 0 && num[i] == num[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i+1 && num[j] == num[j - 1]) continue;

                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = num[i] + num[j] + num[left] + num[right];

                    if (sum == target) {
                        result.add(Arrays.asList(num[i], num[j], num[left], num[right]));
                        left++;
                        right--;

                        while (left < right && num[left] == num[left - 1]) left++;

                        while (left < right && num[right] == num[right + 1]) right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
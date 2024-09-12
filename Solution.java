import java.util.Scanner;

class Solution {

     int[] nums;


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.input();
        solution.calculate_series();
        solution.calculate_sum();

    }


    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть скільки чисел Люка ви хочете опрацювати : ");
        int user_input = sc.nextInt();
        nums = new int[user_input];
    }

    public void calculate_series() {
        nums[0] = 1;
        nums[1] = 3;
        for (int i = 0; i < nums.length; i++) {
            if (i >= 2)
                nums[i] = nums[i - 1] + nums[i -2];
            System.out.print(nums[i] + " ");
        }
    }

    public void calculate_sum() {
        int sum = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("\nSum of Luke`s first " + i + " numbers is " + sum);
    }

    public void print_series() {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}



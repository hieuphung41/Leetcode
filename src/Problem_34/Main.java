package Problem_34;

public class Main {

    public static void main(String[] args) {
        BinarySolution sol = new BinarySolution();

        int[] nums = {1, 2, 3, 3, 3, 3, 4, 5, 9};
        int target = 3;

        int[] result = sol.searchRange(nums, target);

        System.out.println("Left index: " + result[0]);
        System.out.println("Right index: " + result[1]);
    }

}

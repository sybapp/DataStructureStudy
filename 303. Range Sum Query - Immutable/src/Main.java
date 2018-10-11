public class Main {

    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        int i = 0, j = 2;
        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(i, j);
        System.out.println(param_1);
    }
}

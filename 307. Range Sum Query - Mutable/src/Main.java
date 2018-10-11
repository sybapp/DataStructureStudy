class Main {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int param_1 = obj.sumRange(0, 2);
        obj.update(1, 2);
        int param_2 = obj.sumRange(0, 2);
        System.out.println(param_1);
        System.out.println(param_2);
    }
}

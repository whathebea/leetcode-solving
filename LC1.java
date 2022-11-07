public class LC1 {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        for(int i = 0; i <= (nums.length - 1); i++) {
            for(int j = 1 + i; j <= (nums.length -1) ; j++) {
                if(nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }
        return answer;
    }
}

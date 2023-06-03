import java.util.Arrays;

public class Main {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int length = 1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[length - 1]) {
                nums[length] = nums[i];
                length++;
            }
        }
        
        return length;
    }
    
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 5};
        
        System.out.println("Original Array: " + Arrays.toString(nums));
        
        int newLength = removeDuplicates(nums);
        
        System.out.println("New Length: " + newLength);
        System.out.println("Modified Array: " + Arrays.toString(nums));
    }
}
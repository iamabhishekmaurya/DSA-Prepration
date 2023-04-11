public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return binarySearch(0, (nums.length-1), nums, target);
    }

    /**
     * @desc binary search using recursion
     * @param start
     * @param end
     * @param nums
     * @param target
     * @return
     */
    public static int binarySearch(int start, int end, int[] nums, int target){
        if(start > end)
            return -1;
        int mid = (start + end)/2;
        if(nums[mid] == target){
            return mid;
        }
        if(target > nums[mid])
            return binarySearch(mid+1, end, nums, target);
        return binarySearch(start, mid-1, nums, target);
    }
}

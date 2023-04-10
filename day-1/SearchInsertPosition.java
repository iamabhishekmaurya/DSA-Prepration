class SearchInsertPosition{
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println("Loop output: "+searchInsert(nums, target));
        System.out.println("Recursion output: "+binarySearch(nums, target, 0, nums.length-1));
    }

    /**
     * @desc using loop
     * @param A
     * @param target
     * @return
     */
    public static int searchInsert(int[] A, int target) {
        int low = 0, high = A.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(A[mid] == target) return mid;
            else if(A[mid] > target) high = mid-1;
            else low = mid+1;
        }
        return low;
    }


    /**
     * @desc By using recursion
     * @param num
     * @param target
     * @param start
     * @param end
     * @return
     */
    public static int binarySearch(int[] num, int target, int start, int end){
        if(end < start)
            return start;
        int mid = (start+end)/2;
        if(num[mid] == target)
            return mid;
        if(num[mid] > target)
            return binarySearch(num, target, start, mid-1);
        return binarySearch(num, target, mid+1, end);
    }
}
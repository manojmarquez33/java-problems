package leetcode150;

class minSize_subarray {
    public int minSubArrayLen(int target, int[] nums) {

        int n = nums.length;
        int start = 0;
        int end = 0;
        int min = 1000;
        boolean form = false;

        while(start<n && end<n){
            int sum = sumOf(start,end,nums);
            System.out.print(sum+" ");
            if(sum>=target){
                int size = end+1 - start;
                if(size<min){
                    min = size;
                }
                form = true;
                start++;
            }
            // else if(start==end && sum>target){
            //     start++;
            //     end++;
            // }
            else if(sum<target && end<n){
                end++;
                // } else if(sum>target && start<n){
                //     start++;
                // }
            }
        }

        return form ? min : 0;
    }

    public int sumOf(int start,int end,int nums[]){
        int sum = 0;
        int n = nums.length-1;
        for(int i=start;i<=end && i<=n;i++){
            sum+=nums[i];
        }

        return sum;
    }
}
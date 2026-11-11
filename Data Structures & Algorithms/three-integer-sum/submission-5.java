class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>(new ArrayList<>());
        for(int i=0; i<nums.length; i++){
            int l=i+1, r=nums.length-1;
            if(!(i>0 && nums[i]==nums[i-1])){
                while(l<r){
                    if(nums[i]+nums[l]+nums[r]<0){
                        l+=1;
                    }
                    else if(nums[i]+nums[l]+nums[r]>0){
                        r-=1;
                    }
                    else{
                        result.add(List.of(nums[i],nums[l],nums[r]));
                        l+=1;
                        while(l<r && nums[l]==nums[l-1]){
                            l+=1;
                        }
                    }
                }
            }    
        }
        return result;
    }
}

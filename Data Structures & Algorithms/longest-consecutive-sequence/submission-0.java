class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> ref = Arrays.stream(nums).boxed().collect(Collectors.toSet());
		int longest = 0;
		for(int n : nums) {
			if(!ref.contains(n-1)) {
				int length = 1;
				while(ref.contains(n+length)) {
					length+=1;
				}
				longest = Math.max(length, longest);
			}
		}
        return longest;
    }
}

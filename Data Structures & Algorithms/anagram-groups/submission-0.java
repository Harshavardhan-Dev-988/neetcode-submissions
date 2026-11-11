class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Integer>, List<String>> myMap = new HashMap<>();
		for (String str : strs) {
			List<Integer> alphaKeyMap = IntStream.range(0, 26).mapToObj(i -> 0).collect(Collectors.toList());
			for (char c : str.toCharArray()) {
				alphaKeyMap.set(c - 'a', alphaKeyMap.get(c - 'a') + 1);
			}
			List<String> existingVal = myMap.getOrDefault(alphaKeyMap, new ArrayList<>());
			existingVal.add(str);
			myMap.put(alphaKeyMap, existingVal);

		}
        System.out.println(myMap.values());
        return new ArrayList<>(myMap.values());
    }
}

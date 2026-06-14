class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums) set1.add(num);
        return set1.size() != nums.length; 
    }
}
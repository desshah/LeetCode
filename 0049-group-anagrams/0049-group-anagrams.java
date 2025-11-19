class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groupAna = new HashMap<>();

       

        for(String s: strs)
        {
             int count[] = new int[26];
             for(char c : s.toCharArray())
             {
                count[c- 'a']++;
             }

             String key = Arrays.toString(count);
             groupAna.putIfAbsent(key, new ArrayList<>());
             groupAna.get(key).add(s); // to add string to the list

        }

        return new ArrayList<>(groupAna.values());
        
    }
}
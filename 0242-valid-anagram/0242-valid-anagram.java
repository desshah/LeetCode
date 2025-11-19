class Solution {
    public boolean isAnagram(String s, String t) {


        // brute force-> 2 for loop one for each string and will check comparing
        // each character whether it matches to another string character-> O(n^2)
        // we can sort and check both the string -> O(n log n)

        // both the above case space complexity is O(1)

        // optimal solution is HashMap 
        //time-> O(n+m)
        // but space is O(1), coz its a string charavter which is atmost 26 so 
        //O(26)~ O(1)

        Map<Character, Integer> anagramS = new HashMap<>();
        Map<Character, Integer> anagramT = new HashMap<>();

        if (s.length() != t.length())
        {
            return false;
        }

        //as they are anagram means the are same just order is different means length will be same too

        for (int i=0;i<s.length();i++)
        {
            anagramS.put(s.charAt(i), anagramS.getOrDefault(s.charAt(i),0)+1);
            anagramT.put(t.charAt(i), anagramT.getOrDefault(t.charAt(i),0)+1);
        }

        if(anagramS.equals(anagramT))
        {
            return true;
        }

        return false;


        
    }
}
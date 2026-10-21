class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(magazine.length() < ransomNote.length()) return false;

        int letter[] = new int[26];

        for(char c : magazine.toCharArray()){
            letter[c - 'a']++;
        }

        for(char c : ransomNote.toCharArray()){
            if(letter[c-'a'] == 0) return false;

            letter[c - 'a']--;
        }
        return true;
    }
}
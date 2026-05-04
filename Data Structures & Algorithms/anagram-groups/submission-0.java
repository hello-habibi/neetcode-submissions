class Solution {

    String getCharset(String s){
        StringBuilder result = new StringBuilder();
        int[] arr = new int[26];
        for(int i = 0 ; i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }

        for(int i = 0 ;i<26; i++){
            result.append("#").append(arr[i]);
        }

        return result.toString(); 
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hm = new HashMap<>();

        for(int i = 0 ; i< strs.length; i++){
            String key = getCharset(strs[i]);
            if(hm.containsKey(key)){
                hm.get(key).add(strs[i]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hm.put(key, list);
            }
        }
        
        return new ArrayList<>(hm.values());
        
        
    }
}
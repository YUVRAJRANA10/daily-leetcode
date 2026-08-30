class Solution {

    public void solve(int start, String s, List<String> path, List<List<String>> ans){
        if(start == s.length()){
            ans.add(new ArrayList<>(path));
        }

        for(int end= start; end < s.length(); end++){

            if(ispallindrome(s,start,end)){
               path.add(s.substring(start,end+1));

               solve(end+1,s,path,ans);

               path.remove(path.size()-1);
            }
        }


    }
    public boolean ispallindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end) ){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        solve(0,s,new ArrayList<>(), ans);
        return ans;
    }
}

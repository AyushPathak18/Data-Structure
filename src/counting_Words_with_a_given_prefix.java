public class counting_Words_with_a_given_prefix {
    public String slice(int start,int end,String arr){
        String result="";
        for(int i=start;i<end;i++){
            result+=arr.charAt(i);
        }
        return result;
    }
    public int prefixCount(String[] words, String pref) {
        int prefLength=pref.length();
        int n=words.length;
        int count=0;
        for (String word : words) {
            if (word.length() >= prefLength && word.substring(0, prefLength).equals(pref)) {
                count++;
            }
        }
        return count;
        
    }
    
}

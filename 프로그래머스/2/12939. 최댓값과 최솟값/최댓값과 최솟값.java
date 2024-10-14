import java.util.ArrayList;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] a=s.split(" ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++){
            int z=Integer.parseInt(a[i]);
            list.add(z);
        }
        list.sort(null);
        answer=String.valueOf(list.get(0));
        answer+=" "+String.valueOf(list.get(list.size()-1));
        return answer;
    }
}
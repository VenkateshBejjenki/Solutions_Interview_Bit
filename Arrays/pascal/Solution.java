import java.util.*;


public class Solution {
    public static ArrayList<ArrayList<Integer>> maxset(int n) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        temp.add(1);
        result.add(temp);
        temp = new ArrayList<>();
        if (n>=1) {
            temp.add(1);
            temp.add(1);
            result.add(temp);

        }
        ArrayList<Integer> t =new ArrayList<>();
        for (int i=2; i<n; i++) {
            System.out.println(temp.size());
            t.add(1);
            for(int j=0;j<temp.size()-1;j++){
                System.out.println("entered innner for "+j);
                int s=temp.get(j)+temp.get(j+1);
                t.add(s);

            }
            t.add(1);
            System.out.println(t);
            result.add(t);

            temp=t;
            t=new ArrayList<>();
        }
        return result.get(n);
    }

    public static void main(String[] args) {
        System.out.println(maxset(5));

    }
}
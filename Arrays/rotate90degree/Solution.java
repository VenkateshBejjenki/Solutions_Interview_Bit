import java.util.*;
public class Solution {
    public static ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> a) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp;

        for(int i=0;i<a.size();i++){
            temp = new ArrayList<Integer>();
            res.add(temp);
        }

        for(int i=0,p=a.size()-1;i<a.size();i++,p--){
            for(int j=0;j<a.get(0).size();j++){
                int z = a.get(i).get(j);
                System.out.println(z);
                res.get(j).add(0,z);
            }
           // res.add(0,temp);

         }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> t = new ArrayList<>();
        t.add(1);
        t.add(2);
        t.add(3);

        input.add(t);
        t = new ArrayList<>();
        t.add(4);
        t.add(5);
        t.add(6);

        input.add(t);
        t = new ArrayList<>();
        t.add(7);
        t.add(8);
        t.add(9);

        input.add(t);
        System.out.println(input);
        System.out.println(rotate(input));
    }
}

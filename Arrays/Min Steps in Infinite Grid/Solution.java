public class Solution {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int count=0;

        for(int i=0;i<=X.size()-2;i++){
            int x1=X.get(i);
            int y1=Y.get(i);
            int x2=X.get(i+1);
            int y2=Y.get(i+1);

            int c1=Math.abs(x2-x1);
            int c2=Math.abs(y2-y1);

            if(c1>=c2)
                count=count+c1;

            else if(c2>c1)
                count=count+c2;


        }
        return count;

    }
}
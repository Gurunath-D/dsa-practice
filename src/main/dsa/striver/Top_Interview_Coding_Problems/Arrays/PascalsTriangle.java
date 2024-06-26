package src.main.dsa.striver.Top_Interview_Coding_Problems.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        List<List<Integer>> list = generate(5);
        list.forEach(row -> {
            row.forEach(element -> System.out.print(row + " "));
            System.out.println();
        });
    }

    /**
     * <a href="https://www.youtube.com/watch?v=nPVEaB3AjUM">Solution Video</a>
     *
     * @param numRows Size of the triangle
     * @return List of List of Integers in Triangular fashion
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        if(numRows==1) {
            return result;
        }
        list = new ArrayList<>();
        list.add(1);
        list.add(1);
        result.add(list);
        if(numRows==2) {
            return result;
        }
        for (int i=3;i<=numRows;i++) {
            List<Integer> colList = new ArrayList<>(i);
            for(int j=1;j<=i;j++) {
                if(j==1 || j==i) {
                    colList.add(1);
                } else {
                    colList.add(result.get(i-2).get(j-1)+result.get(i-2).get(j-2));
                }
            }
            result.add(colList);
        }
        return result;
    }
}

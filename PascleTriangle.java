import java.util.*;
public class PascleTriangle {

    static void pascleTriangle(int n){
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> row = null;
        for(int i = 0; i < n; i++){
            row = new ArrayList<Integer>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                }else{
                    row.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
                }
            }
            list.add(row);
        }

        System.out.println(list);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        pascleTriangle(N);

    }
}

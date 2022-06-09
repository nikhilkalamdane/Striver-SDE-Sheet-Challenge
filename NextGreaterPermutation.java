import java.util.*;
public class NextGreaterPermutation {
    static ArrayList<Integer> nextPermutation(ArrayList<Integer> list){
        if(list.size() <= 1) return list;

        int n = list.size();

        int i = n - 2;
        while(i >= 0){
            if(list.get(i) < list.get(i + 1)){
                break;
            }
            i--;
        }
      
        if(i >= 0){
            int j = n - 1;
            while(j >= 0){
                if(list.get(j) > list.get(i)){ 
                    break;
                }
                j--;
            }
            swap(list, i, j);
        }
                 
        reverse(list, i + 1, list.size() - 1);  
        
        return list;
       
    }

    static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    static void reverse(ArrayList<Integer> list, int i, int j) {
        while(i < j) swap(list, i++, j--);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T > 0){
            int N = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i = 0; i < N; i++){
                int num = sc.nextInt();
                list.add(num);
            }

            System.out.println(nextPermutation(list));
            T--;
        }
    }
}

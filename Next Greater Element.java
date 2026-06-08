import java.util.*;
public class Main
{
    public static void nextGreaterElement(int[] arr){
        int n = arr.length;
        int[] ans = new int [n];
        Stack<Integer> st = new Stack<>();
        
        for (int i = n - 1; i >= 0; i--){
            while(!st.isEmpty() && st.peek() <= arr[i]){
                st.pop();
            }
            if (st.isEmpty()){
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }
            st.push(arr[i]);
        }
        System.out.println("This Is Your Next Greater Element Array:");
        for (int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter The Size Of Array:");
	    int n = sc.nextInt();
	    
	    System.out.println("Enter The Elements Of An Array:");
	    int[] arr = new int[n];
	    for (int i = 0; i < n; i++){
	        arr[i] = sc.nextInt();
	    }
	    nextGreaterElement(arr);

	}
}

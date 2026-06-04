public class Main {
    public static int tilePattern(int n){
        //base condition
        if (n<4){
            return 1;
        }
        
        //logic 
        return tilePattern(n - 1) + tilePattern(n - 4);
    }
    public static void main(String[] args){
        System.out.println(tilePattern(8));
    }
}

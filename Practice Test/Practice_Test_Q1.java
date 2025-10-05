public class Practice_Test_Q1 {
    public static boolean isDivisible(int a, int b) {
        if(a%b==0){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(isDivisible(10, 2));
        System.out.println(isDivisible(11, 2));
        System.out.println(isDivisible(100, 5));
        
    }
}

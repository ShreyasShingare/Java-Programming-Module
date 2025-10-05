public class PrintWords {
    public static void printWords(String s, int k) {
        for(int i=0;i<k-1;i++){
            System.out.print(s);
            System.out.print(" ");
        }
        System.out.print(s);
    }

    public static void main(String[] args) {
        String s1 = "Java Test 1";
        int k1 = 3;

        printWords(s1, k1);
    }
}
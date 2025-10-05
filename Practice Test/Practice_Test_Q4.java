public class Practice_Test_Q4 {

    public static String printString(String str){
        String words[] = str.split(" ");

        for(int i=0;i<words.length;i++){
            if(words[i].equals("my")){
                words[i] = "your";
            }
        }

        String result = String.join(" ", words);
        return result;
    }

    public static void main(String[] args) {
        String myStr = "My my my";
        System.out.println(printString(myStr));
    }
    
}

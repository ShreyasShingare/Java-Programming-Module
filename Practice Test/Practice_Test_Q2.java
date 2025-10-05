
public class Practice_Test_Q2{
public static void main(String[] args) {
    
    System.out.println("Hello World");

    String s = "hello this is my string";

    System.out.println("Result="+reverseChangeCase(s));


}




public static String reverseChangeCase(String str){
    char[] myCharArr = str.toCharArray();
    char[] revStr = new char[myCharArr.length];

    int j=0;
    for(int i=myCharArr.length-1;i>=0;i--){
        revStr[j] =myCharArr[i];
        j++;
    }

    String result = new String(revStr);
    return result.toUpperCase();
}
}
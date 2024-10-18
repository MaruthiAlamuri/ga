public class Reverse {
   public static String reverseString(String str){
      StringBuffer sb = new StringBuffer(str);
      sb.reverse();
      if(str.equals(sb.toString()))
      return "Palindrome";
    return "Not a Palindrome";
   }
   public static void main(String[] args) {
       String str = "malayalam";
      System.out.println(reverseString(str));
   } 
}

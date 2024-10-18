import java.util.*;
public class CountOfCharacter {
    
    public static void countOfCharacters(String str){
        HashMap<Character,Integer> hs = new HashMap<>();
        for(char c : str.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        for(char c: hs.keySet()){
            System.out.println(c+" "+hs.get(c));
        }
    }
    public static void main(String[] args) {
        String str = "maruthiii";
        countOfCharacters(str);
    }
}

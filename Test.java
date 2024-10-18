interface Right {
    int m1();
}
interface Left{
    int m1();
}
public class Test implements Right,Left{
     public int m1(){
        return 10;
     }
  public static void main(String[] args){
     Right rightinstance = new Test();
     System.out.println(rightinstance.m1());
  }
}

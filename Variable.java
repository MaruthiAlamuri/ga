public class Variable{
    static int x=10;
    int y=20;
    public static void main(String[] args) {
        Variable t1 = new Variable();
        Variable.x=888;
        t1.y=999;
        Variable t2 = new Variable();

        System.out.println(Variable.x+" "+t2.y);

    }
}
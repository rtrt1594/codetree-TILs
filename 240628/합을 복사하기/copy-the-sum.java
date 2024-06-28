public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;
        int d = a + b;
        int e = d + c;
        a = e;
        b = e;
        c = e;
        System.out.println(a + " " + b + " " + c);
   }
}
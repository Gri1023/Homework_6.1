import static ibio.Helpers.*;

public class Main {
    public static void main(String[] args) {
        int k=0;
        for (k=0;k<=10;k++) {
            double a = k * (Math.PI/5);
            System.out.println("");
            System.out.print(a + " ");
            System.out.print(Math.sin(a)+ " ");
            System.out.print(Math.cos(a)+ " ");
        }
    }
}
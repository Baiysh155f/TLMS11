import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Triangle num =new Triangle();
        num.a=scanner.nextInt();
        num.b=scanner.nextInt();
        num.c=scanner.nextInt();
        num.area();
    }
}
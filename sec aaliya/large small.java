 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        int smallest = Math.min(a, Math.min(b, c));

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}

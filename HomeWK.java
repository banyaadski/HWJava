import java.util.Scanner;

public class HomeWK {
    public static void main(String[] args) {
        System.out.println(enternumber());
    }

    public static float enternumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            float num ;
            while (!scanner.hasNextFloat()) {
                scanner.nextLine();
                if(scanner.hasNextInt()){
                    scanner.nextLine();
                }
            }
            num = scanner.nextFloat();
            return num;
        }
    }
}

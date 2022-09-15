import java.io.IOException;
import java.util.Scanner;

public class HomeWK2 {
    public static void main(String[] args) throws IOException {
        System.out.println(nullString());
    }

    public static String nullString() throws IOException {
        String str = "";
        try (Scanner scanner = new Scanner(System.in)) {
            str = scanner.nextLine();
        }
        if(str.isEmpty()){
            throw new IOException("Вы ввели пустую строку");
        }
        return str;
    }
}

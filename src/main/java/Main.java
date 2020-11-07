import com.google.gson.Gson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder str = new StringBuilder();
        String curStr = scanner.nextLine();
        while (!curStr.equals("}")) {
            str.append(curStr);
            curStr = scanner.nextLine();
        }
        str.append(curStr);

        try {
            Object obj = new Gson().fromJson(str.toString(), Object.class);
        } catch (Exception e) {
            System.out.println("Input is not JSON");
            System.exit(1);
        }
    }

}

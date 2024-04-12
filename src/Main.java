//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String value = scanner.next();
            MyRegex regex = new MyRegex(value);
            String result = regex.comprobarIP()  ? "true" : "false";
            System.out.println(result);
        }
        scanner.close();
    }
    private static class MyRegex {
        private String ip;
        private String regex;

        private Pattern pattern;

        public MyRegex(String ip) {
            this.ip = ip;
            regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})(?:\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9]{1,2})){3}$";
            pattern = Pattern.compile(regex);
            comprobarIP();
        }

        public boolean comprobarIP() {
            return pattern.matcher(ip).matches();

        }
    }
}
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Console console = new Console();
        Scanner in = new Scanner(System.in);
        while (true){

            String command = in.nextLine();
            if (Objects.equals(command, "exit")){
                break;
            }
            console.UserInput(command);
        }
    }
}

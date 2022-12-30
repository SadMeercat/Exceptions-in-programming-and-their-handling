import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        

        try{
            mainMethod();
        }
        catch(NullPointerException ex){
            System.out.println("Строка не может быть пустой");
        }
    }

    public static void mainMethod() throws NullPointerException{
        Scanner in = new Scanner(System.in);
        System.out.println("Введите что-нибудь:");
        String str = in.nextLine();

        if(str.length() == 0){
            throw new NullPointerException();
        }
    }
}

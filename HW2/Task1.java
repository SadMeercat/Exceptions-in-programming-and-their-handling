import java.util.Scanner;

class Task1{

    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
    // вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void calc(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");

        String numStr = in.nextLine();

        try{
            Float num = Float.parseFloat(numStr);

            System.out.println(num);
        }
        catch(NumberFormatException ex){

            String[] numbers = numStr.split("/");

            try{
                if(numbers.length != 2){
                    throw new Exception();
                }
                Float result = (float)(Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]));
                System.out.println(result);
            }
            catch(NumberFormatException exc){
                System.out.println("Число введено непраильно!");
                calc();
            }
            catch(Exception exc){
                System.out.println("Число введено непраильно!");
                calc();
            }
            

            
        }
    }

    public static void main(String[] args) {
        calc();
    }

}
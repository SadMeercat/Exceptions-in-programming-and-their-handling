import java.io.IOException;
import java.util.Objects;

public class Console {
    FileManager fileManager;
    public Console(){
        this.fileManager = new FileManager();
    }

    public void UserInput(String command){
        String space = " ";
        String[] data = command.split(space);

        try{
            if (data.length != 6){
                throw new ArrayIndexOutOfBoundsException();
            }
            String secName = data[0];
            String firstName = data[1];
            String midName = data[2];
            String[] date = data[3].split("\\.");
            if(date.length < 3 || date[0].length() != 2 || date[1].length() != 2 || date[2].length() != 4){
                throw  new IndexOutOfBoundsException();
            }
            String birthday = data[3];
            String phoneNumber = data[4];
            String gender;
            if (Objects.equals(data[5], "f") || Objects.equals(data[5], "m")){
                gender = data[5];
            }
            else{
                throw new NullPointerException();
            }
            fileManager.WriteFile(secName, firstName, midName, birthday, phoneNumber, gender);
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Не хватает данных!");
        }
        catch (IndexOutOfBoundsException ex){
            System.out.println("Неправильный ввод даты!");
        }
        catch (NullPointerException ex){
            System.out.println("Неверный ввод пола!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


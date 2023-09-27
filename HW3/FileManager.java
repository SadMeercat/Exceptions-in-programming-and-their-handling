import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void WriteFile(String secName, String firstName, String midName, String birthday, String phoneNum, String gender) throws IOException {
        File file = new File(secName+".txt");
        if (file.exists()) {
            try(FileWriter writer = new FileWriter(secName+".txt", true)){
                String text = secName + " " + firstName + " " + midName + " " + birthday + " " + phoneNum + " " + gender + "\r\n";
                writer.write(text);
                writer.flush();
            }
        }
        else {
            try(FileWriter writer = new FileWriter(secName+".txt", false)){
                String text = secName + firstName + midName + birthday + gender;
                writer.write(text);
                writer.flush();
            }
        }
    }
}

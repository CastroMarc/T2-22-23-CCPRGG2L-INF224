
import java.io.File;
import java.io.IOException;

public class Project2 {
    public static void main(String[] args) throws IOException {
        File file = new File("input.txt");

        try {
            if (!file.exists()) {
                file.createNewFile();
                System.out.println(file.getName() + "SUCCESSFULLY CREATED!");
                System.out.println(file.getAbsolutePath());
            }
            else {
                System.out.println(file.getName() + "ALREADY EXISTED!");
                System.out.println(file.getAbsolutePath());
                file.delete();
                System.out.println("File already deleted");
            }
        } catch(IOException e) {
            System.out.println("THERE IS AN ERROR!");
            System.out.println(e.getMessage());
        }
    }

}

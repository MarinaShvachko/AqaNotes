package api.exampleOfApiFrameworkGitHub.utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BodyGenerator {
    //TODO: add try catch
    //read data from Json file, convert it to String
    public static String generateBodyFromFileToString(String fileName) throws IOException {
        //here is a path to the folder with Json files
        String filePath = System.getProperty("user.dir") + "\\src\\test\\java\\api\\exampleOfApiFrameworkGitHub\\resources\\" + fileName;
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}

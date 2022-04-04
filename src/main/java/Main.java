import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        AnalyzingKeyboardInput analyzingKeyboardInput = new AnalyzingKeyboardInput();
        analyzingKeyboardInput.analyzesKeyboardInput(list1);


        ReadsFromFile readsFromFile = new ReadsFromFile();
        readsFromFile.readsFromFile("C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\fileForRead.txt");
        analyzingKeyboardInput.analyzesKeyboardInput(readsFromFile.list);
        analyzingKeyboardInput.analyzesKeyboardInput(readsFromFile.list);
        WritesToFile writesToFile = new WritesToFile();
        writesToFile.writesToFile(readsFromFile.list, "C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\fileForWrite.txt");

    }
}

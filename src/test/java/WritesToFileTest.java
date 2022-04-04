import org.junit.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class WritesToFileTest {
    private WritesToFile writesToFile = new WritesToFile();
    private ReadsFromFile readsFromFile = new ReadsFromFile();
    @Test
    public void write() {
        String file = "C:\\Users\\admin\\IdeaProjects\\Lesson6\\src\\main\\java\\writesToFileTest.txt";
        List<Assignment> list = new ArrayList<>();
        Assignment assignment1 = new Assignment("Дом","dfd","dfd");
        Assignment assignment2 = new Assignment("Дом","dfd","dfd");
        Assignment assignment3 = new Assignment("Дом","dfd","dfd");
        list.add(assignment1);
        list.add(assignment2);
        list.add(assignment3);

        writesToFile.writesToFile(list,file);
        ArrayList<Assignment> list2= (ArrayList) readsFromFile.readsFromFile(file);
        assertEquals(3, list2.size());
        assertEquals(list, list2);
        assertEquals(list.get(0), list2.get(0));
        assertEquals(list.get(1), list2.get(1));
        assertEquals(list.get(2), list2.get(2));
    }
}

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;


/**
 * Класс записи в файл списка дел To-Do List
 */
public class WritesToFile {

    /**
     * Метод записи в файл
     *
     * @param list список дел, который нужно записать в файл
     * @param file файл куда нужно записать список дел
     */
    public void writesToFile(List<Assignment> list, String file) {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), StandardCharsets.UTF_8)
        )) {
            int i = 0;
            while (i < list.size()) {
                writer.write(list.get(i) + "\n");
                i++;
            }
        } catch (
                IOException e) {
        }
    }
}

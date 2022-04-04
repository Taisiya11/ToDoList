import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Класс чтения из файла списка дел To-Do List
 */
public class ReadsFromFile {
    private String[] data;
    private int index = 0;
    List<Assignment> list = new ArrayList<>();

    /**
     * Метод чтения из файла
     *
     * @param file файл из которого нужно прочитать список дел
     * @return возвращает список дел To-Do List
     */

    public List readsFromFile(String file) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), UTF_8))) {
            String line = reader.readLine();
            while (line != null) {
                data = line.split(" ");
                Assignment assignment = new Assignment(data[0], data[1], data[2]);
                list.add(index, assignment);
                line = reader.readLine();
                index++;
            }
        } catch (IOException e) {
        }
        return list;
    }
}


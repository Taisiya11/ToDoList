import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс реализации действия над списком дел To-Do List
 */
public class ToDoList2 {
    List<Assignment> listDone = new ArrayList<>();
    private String title;
    private String description;
    private String importance;
    private int index = 0;
    private int caseNumber = 1;
    private int choice;


    /**
     * Метод добавления задания в список дел To-Do List
     *
     * @param list список дел To-Do List
     */
    public void add(List<Assignment> list) {
        Assignment assignment= scannerAssignment();
        list.add(index, assignment);
        index++;
    }

    /**
     * Метод удаления задания из списка дел To-Do List
     *
     * @param list список дел To-Do List
     */
    public void delete(List<Assignment> list) {
        showList(list);
        int numberChoice= scanner();
        if ((numberChoice - 1) < 0 || numberChoice > list.size()) {
            System.out.println("Ошибка! Такого номера нет в вашем To-Do List");
        } else {
            list.remove(numberChoice - 1);
        }
    }

    /**
     * Метод указания задания как выполненное
     *
     * @param list список дел To-Do List
     */

    public void markAsDone(List<Assignment> list) {
        showList(list);
        int assignmentDone = scanner();
        if ((assignmentDone - 1) < 0 || assignmentDone > list.size()) {
            System.out.println("Ошибка! Такого номера нет в вашем To-Do List");
        } else {
            listDone.add(list.get(assignmentDone - 1));
        }
    }

    /**
     * Метод вывода в консоль списка дел To-Do List
     *
     * @param list список дел To-Do List
     */

    public void showList(List<Assignment> list) {
        for (Assignment assignment : list) {
            System.out.println(caseNumber + ".  " + assignment.toString());
            caseNumber++;
        }
        caseNumber = 1;
    }

    /**
     * Метод вывода в консоль только списка тех дел To-Do List, которые были помечены как выполненные
     */
    public void showListOfCompletedTasks() {
        for (Assignment assignment : listDone) {
            System.out.println(caseNumber + ".  " + assignment.toString());
            caseNumber++;
        }
        caseNumber = 1;
    }

    /**
     * Ввод значения с клавиатуры
     * @return номер дела
     */
    public int scanner(){
        System.out.println("Введите номер дела: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        return choice;
    }

    public Assignment scannerAssignment(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для добавления дела введите название: ");
        title=scanner.nextLine();
        System.out.println("Введите описание: ");
        description = scanner.nextLine();
        System.out.println("Введите важность: ");
        importance = scanner.nextLine();
        return new Assignment(title,description,importance);
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Класс реализации действия над списком дел To-Do List
 */
public class ToDoList {
    List<Assignment> listDone = new ArrayList<>();
    private String title;
    private String description;
    private String importance;
    private int index = 0;
    private int caseNumber = 1;


    /**
     * Метод добавления задания в список дел To-Do List
     *
     * @param list список дел To-Do List
     */
    public void add(List<Assignment> list) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Для добавления дела введите название: ");
        title = scanner.nextLine();
        System.out.println("Введите описание: ");
        description = scanner.nextLine();
        System.out.println("Введите важность: ");
        importance = scanner.nextLine();
        Assignment assignment = new Assignment(title, description, importance);
        list.add(index, assignment);
        index++;
    }

    /**
     * Метод удаления задания из списка дел To-Do List
     *
     * @param list список дел To-Do List
     */
    public void delete(List<Assignment> list) {
        System.out.println("Введите номер дела, которое хотите удалить ");
        showList(list);
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        if ((choice - 1) < 0 || choice > list.size()) {
            System.out.println("Ошибка! Такого номера нет в вашем To-Do List");
        } else {
            list.remove(choice - 1);
        }
    }

    /**
     * Метод указания задания как выполненное
     *
     * @param list список дел To-Do List
     */

    public void markAsDone(List<Assignment> list) {
        System.out.println("Введите номер дела, которое хотите пометить как выполненное ");
        showList(list);
        Scanner input = new Scanner(System.in);
        int assignmentDone = input.nextInt();
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
        System.out.println("Список всех дел: ");
        for (Assignment assignment : list) {
            System.out.println(caseNumber + ".  " + assignment.toString());
            caseNumber++;
        }
        caseNumber = 1;
    }

    /**
     * Метод вывода в консоль только списка тех дел To-Do List, которые были помечены как выполненные
     *
     * @param list список дел To-Do List
     */
    public void showListOfCompletedTasks(List<Assignment> list) {
        System.out.println("Список выполненных дел: ");
        for (Assignment assignment : listDone) {
            System.out.println(caseNumber + ".  " + assignment.toString());
            caseNumber++;
        }
        caseNumber = 1;
    }
}


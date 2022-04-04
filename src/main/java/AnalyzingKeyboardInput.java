import java.util.Scanner;
import java.util.List;

/**
 * Класс анализирует введенное значение с консоли и сопоставляет методом реализации выбранного действия
 */

public class AnalyzingKeyboardInput {
    ToDoList toDoList = new ToDoList();

    /**
     * Метод принимаем в себя список дел и сопоставляет введенное с консоли значение с методом реализации выбранного действия
     *
     * @param list список дел
     */

    public void analyzesKeyboardInput(List<Assignment> list) {
        int menuItem = -1;
        while (menuItem != 0) {
            menuItem = consoleInput();
            switch (menuItem) {
                case 1 -> {
                    toDoList.add(list);
                    break;
                }
                case 2 -> {
                    toDoList.delete(list);
                    break;
                }
                case 3 -> {
                    toDoList.markAsDone(list);
                    break;
                }
                case 4 -> {
                    toDoList.showList(list);
                    break;
                }
                case 5 -> {
                    toDoList.showListOfCompletedTasks(list);
                    break;
                }
                case 0 -> {
                    break;
                }
                default -> System.out.println("Ошибка ввода. Попробуйте еще раз");
            }
        }
    }

    /**
     * Метод вывода всех доступных действий для To-Do List
     *
     * @return введенное с консоли значение выбранного действия над To-Do List
     */

    public int consoleInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("To-Do List");
        System.out.println();
        System.out.println("1. Добавить дело");
        System.out.println("2. Удалить дело");
        System.out.println("3. Пометить как выполненное");
        System.out.println("4. Показать список всех дел");
        System.out.println("5. Показать список всех выполненных дел");
        System.out.println("Если хотите закрыть to-do list, введите 0");
        System.out.println();
        System.out.print("Выберите действие: ");
        int choice = scanner.nextInt();
        return choice;
    }
}
/**
 * Класс значений, описывающих одно дело из To-Do List
 */

public class Assignment {
    private String title;
    private String description;
    private String importance;

    Assignment(String title, String description, String importance) {
        this.title = title;
        this.description = description;
        this.importance = importance;
    }

    @Override
    public String toString() {
        return "Задание: " +
                "   |   " + title +
                "   |   " + description +
                "   |   " + importance +
                ' ';
    }
}


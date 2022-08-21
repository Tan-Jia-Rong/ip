package duke;

import duke.task.Task;
import duke.task.TaskList;

public class Ui {
    private static final String BOT_NAME = "duke";

    /**
     * Prints Greetings Message.
     */
    public void greetings() {
        System.out.println("\n-----------------------------------------");
        System.out.printf("Hello! I'm the Magical ChatBot, %s!%n", BOT_NAME);
        System.out.println("What can I help you with today?");
        System.out.println("-----------------------------------------\n");
    }

    /**
     * Prints Farewell Message.
     */
    public void farewell() {
        System.out.println("\n-----------------------------------------");
        System.out.println("Bye Bye! Hope to see you again soon!");
        System.out.println("-----------------------------------------\n");
    }

    /**
     * Prints error message.
     *
     * @param e An exception.
     */
    public void printErr(Exception e) {
        System.out.println("\n-----------------------------------------");
        System.out.println(e.getMessage());
        System.out.println("-----------------------------------------\n");
    }

    /**
     * Prints message.
     *
     * @param message The message to be printed.
     */
    public void printErr(String message) {
        System.out.println("\n-----------------------------------------");
        System.out.println(message);
        System.out.println("-----------------------------------------\n");
    }

    /**
     * Prints message on task completion
     *
     * @param task Duke.Task.Task that is completed.
     */
    public void markMessage(Task task) {
        System.out.println("\n-----------------------------------------");
        System.out.println("Nice! I've marked this task as done:");
        System.out.println("    " + task);
        System.out.println("-----------------------------------------\n");
    }

    /**
     * Prints message on task completion undo-ed
     *
     * @param task Completed Duke.Task.Task that is undo-ed
     */
    public void unmarkMessage(Task task) {
        System.out.println("\n-----------------------------------------");
        System.out.println("Ok! I've marked this task as not done yet:");
        System.out.println("    " + task);
        System.out.println("-----------------------------------------\n");
    }

    /**
     * Prints tasks in List.
     *
     * @param tasks The list of tasks.
     */
    public void listTasks(TaskList tasks) {
        System.out.println("\n-----------------------------------------");
        int counter = 0;
        System.out.println("Here are the tasks in your list");
        for (Task task : tasks.getTaskList()) {
            System.out.println(++counter + "." + task);
        }
        System.out.println("-----------------------------------------\n");
    }

    /**
     * Prints message on task addition.
     *
     * @param size Size of task list after addition.
     * @param task Duke.Task.Task added.
     */
    public void addMessage(int size, Task task) {
        System.out.println("\n-----------------------------------------");
        System.out.println("Got it. I've added this task:");
        System.out.println(task);
        System.out.println("Now you have " + size + " tasks in the list.");
        System.out.println("-----------------------------------------\n");
    }

    /**
     * Prints message on task deletion.
     *
     * @param size Size of task list after deletion.
     * @param task Duke.Task.Task deleted.
     */
    public void deleteMessage(int size, Task task) {
        System.out.println("\n-----------------------------------------");
        System.out.println("Noted. I've removed this task:");
        System.out.println("    " + task);
        System.out.println("Now you have " + size + " tasks in the list.");
        System.out.println("-----------------------------------------\n");
    }

    public void helpMessage() {
        System.out.println("\n-----------------------------------------");
        System.out.println("Here are the list of available commands");
        System.out.println("List: List all tasks");
        System.out.println("Command: list\n");

        System.out.println("Mark: marks selected task as completed");
        System.out.println("Command: mark (index of task)\n");

        System.out.println("Unmark: unmarks selected task as not completed");
        System.out.println("Command: unmark (index of task)\n");

        System.out.println("Delete: Delete selected task");
        System.out.println("Command: delete (index of task)\n");

        System.out.println("Duke.Task.ToDo: adds a Todo Duke.Task.Task");
        System.out.println("Command: Todo (description)\n");

        System.out.println("Duke.Task.Deadline: adds a Duke.Task.Deadline Duke.Task.Task");
        System.out.println("Command: Duke.Task.Deadline (description) /by (YYYY-MM-DD 24hr)\n");

        System.out.println("Duke.Task.Deadline: adds a Duke.Task.Event Duke.Task.Task");
        System.out.println("Command: Duke.Task.Event (description) /at (YYYY-MM-DD 24hr)\n");
        System.out.println("-----------------------------------------\n");
    }
}
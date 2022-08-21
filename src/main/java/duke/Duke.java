package duke;

import duke.task.TaskList;

import java.util.Scanner;

/**
 * The Duke.Duke class that instantiates instances of duke.
 *
 * Duke.Duke is a ChatBot that performs different actions
 * based on commands provided by user.
 *
 * CS2103T IP
 * AY22/23 Semester 1
 * @author Tan Jia Rong
 */
public class Duke {
    // Location of save file
    private static final String SAVE_LOCATION = "./data/data.txt";

    // Initialise variables
    private Scanner sc = new Scanner(System.in);
    private TaskList tasks;
    private Storage storage;
    private Ui ui;
    private Parser parser;

    public Duke(String filePath) {
        this.ui = new Ui();
        this.storage = new Storage(filePath);
        this.tasks = new TaskList(this.storage.load(), this.ui);
        this.parser = new Parser(this.ui);
    }

    public void run() {
        // Greets User
        ui.greetings();

        String command = this.sc.next();
        String description = this.sc.nextLine();

        while (!command.equalsIgnoreCase("bye")) {
            parser.execute(command, description, tasks);

            command = sc.next();
            description = sc.nextLine();
        }

        storage.save(tasks);
        ui.farewell();
    }

    /**
     * Returns the Duke.Duke ChatBot.
     *
     * @param args arguments (if any).
     */
    public static void main(String[] args) {
        // Initialise variables
        Duke duke = new Duke(SAVE_LOCATION);
        duke.run();
    }
}
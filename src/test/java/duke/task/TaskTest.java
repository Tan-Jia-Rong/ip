package duke.task;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void firstConstructor_normalInput_writtenCorrectly() {
        Task task = new Task("Test 12321", "T");
        assertEquals("[ ] Test 12321", task.toString());
    }

    @Test
    public void secondConstructor_notDoneInput_writtenCorrectly() {
        Task task = new Task("Test 12321", "0", "D");
        assertEquals("[ ] Test 12321", task.toString());
    }

    @Test
    public void secondConstructor_doneInput_writtenCorrectly() {
        Task task = new Task("Test 12321", "1", "D");
        assertEquals("[X] Test 12321", task.toString());
    }

    @Test
    public void markTask_unmarkedTask_writtenCorrectly() {
        Task task = new Task("Test 12321", "T");
        task.markAsDone();
        assertEquals("[X] Test 12321", task.toString());
    }

    @Test
    public void unmarkTask_markedTask_writtenCorrectly() {
        Task task = new Task("Test 12321", "1", "T");
        task.markAsUndone();
        assertEquals("[ ] Test 12321", task.toString());
    }

    @Test
    public void getDescription_normalInput_writtenCorrectly() {
        Task task = new Task("Test 12321", "T");
        assertEquals("Test 12321", task.getDescription());
    }

    @Test
    public void getType_normalInput_writtenCorrectly() {
        Task task = new Task("Test 12321", "T");
        assertEquals("T", task.getType());
    }

    @Test
    public void getDate_normalInput_writtenCorrectly() {
        Task task = new Task("Test 12321", "T");
        assertEquals("Not Applicable", task.getDate());
    }

    @Test
    public void getDone_doneInput_writtenCorrectly() {
        Task task = new Task("Test 12321", "1", "T");
        assertEquals(true, task.getIsDone());
    }

    @Test
    public void getDoneStatus_doneInput_writtenCorrectly() {
        Task task = new Task("Test 12321", "1", "T");
        assertEquals("X", task.getStatusIcon());
    }


}

package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        // Given
        String toDoTask = "To Do Task";
        String inProgressTask = "In Progress Task";
        String doneTask = "Done Task";

        // When
        board.getToDoList().getTasks().add(toDoTask);
        board.getInProgressList().getTasks().add(inProgressTask);
        board.getDoneList().getTasks().add(doneTask);

        // Then
        assertEquals(1, board.getToDoList().getTasks().size());
        assertEquals("To Do Task", board.getToDoList().getTasks().get(0));
        assertEquals(1, board.getInProgressList().getTasks().size());
        assertEquals("In Progress Task", board.getInProgressList().getTasks().get(0));
        assertEquals(1, board.getDoneList().getTasks().size());
        assertEquals("Done Task", board.getDoneList().getTasks().get(0));
    }
}

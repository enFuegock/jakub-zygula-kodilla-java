package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    private TaskList taskList;

    @BeforeEach
    public void setup() {
        taskList = new TaskList("Test TaskList", "Test Description");
        taskListDao.save(taskList);
    }

    @AfterEach
    public void cleanup() {
        taskListDao.deleteAll();
    }

    @Test
    void testFindByListName() {
        // Given
        String listName = "Test TaskList";

        // When
        List<TaskList> result = taskListDao.findByListName(listName);

        // Then
        assertEquals(1, result.size());
        assertEquals(listName, result.get(0).getListName());
    }
}

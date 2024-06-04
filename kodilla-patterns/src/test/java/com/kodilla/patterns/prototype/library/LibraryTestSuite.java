package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LibraryTestSuite {

    @Test
    void testGetBooks() {
        // Given
        Library library = new Library("Original library");
        Book book1 = new Book("Title1", "Author1", LocalDate.of(2020, 1, 1));
        Book book2 = new Book("Title2", "Author2", LocalDate.of(2021, 2, 2));
        Book book3 = new Book("Title3", "Author3", LocalDate.of(2022, 3, 3));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library shallowClonedLibrary = null;
        Library deepClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.name = "Shallow copy of library";
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.name = "Deep copy of library";
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // When
        library.getBooks().remove(book1);

        // Then
        assertEquals(2, library.getBooks().size());
        assertEquals(2, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(), shallowClonedLibrary.getBooks());
        assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}

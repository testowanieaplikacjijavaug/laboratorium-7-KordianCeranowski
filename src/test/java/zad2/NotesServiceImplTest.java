package zad2;

import org.junit.jupiter.api.BeforeEach;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import zad1.Note;

import static org.assertj.core.api.Assertions.*;

class NotesServiceImplTest {

    private NotesServiceImpl notesServiceImpl;
    private MockNotesStorage mockNotesStorage;
    private Note note;

    @BeforeEach
    void setUp(){
        mockNotesStorage = new MockNotesStorage();
        notesServiceImpl = NotesServiceImpl.createWith(mockNotesStorage);
        note = Note.of("test", 4);
    }

    @Test
    void createWithTest(){
        Assertions.assertThat(notesServiceImpl).isInstanceOf(NotesServiceImpl.class);
    }

    @Test
    void addTest(){
        notesServiceImpl.add(note);
        Assertions.assertThat(mockNotesStorage.added).isTrue();
    }

    @Test
    void averageOfTest(){
        Assertions.assertThat(notesServiceImpl.averageOf("TestName")).isEqualTo(4);
    }

    @Test
    void clearTest(){
        notesServiceImpl.clear();
        Assertions.assertThat(mockNotesStorage.cleared).isTrue();
    }


}

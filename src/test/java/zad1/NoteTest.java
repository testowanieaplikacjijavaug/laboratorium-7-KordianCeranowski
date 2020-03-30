package zad1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class NoteTest {
    @Test
    void TypeTest(){
        Assertions.assertThat(Note.of("name", 3))
                .isInstanceOf(Note.class);
    }

    @Test
    void getNameTest(){
        Assertions.assertThat(Note.of("name test", 3).getName())
                .isEqualTo("name test");
    }

    @Test
    void getNoteTest(){
        Assertions.assertThat(Note.of("name", 3).getNote())
                .isEqualTo(3);
    }

    @Test
    void NullStringTest(){
        assertThatThrownBy(() -> Note.of(null, 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Imię ucznia nie może być null");
    }

    @Test
    void BlankStringTest(){
        assertThatThrownBy(() -> Note.of("", 3))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Imię ucznia nie może być puste");
    }

    @Test
    void TooLowNoteTest(){
        assertThatThrownBy(() -> Note.of("name", 1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Niewłaściwa ocena");
    }

    @Test
    void TooHighNoteTest(){
        assertThatThrownBy(() -> Note.of("a", 7))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Niewłaściwa ocena");
    }
}

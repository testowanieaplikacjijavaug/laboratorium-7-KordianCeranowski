import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class NoteTest {
    @Test
    void TypeTest(){
        assertThat(Note.of("name", 3))
                .isInstanceOf(Note.class);
    }

    @Test
    void getNameTest(){
        assertThat(Note.of("name test", 3).getName())
                .isEqualTo("name test");
    }

    @Test
    void getNoteTest(){
        assertThat(Note.of("name", 3).getNote())
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
        assertThatThrownBy(() -> Note.of("name", 2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Niewłaściwa ocena");
    }

    @Test
    void TooHighNoteTest(){
        assertThatThrownBy(() -> Note.of("a", 6))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Niewłaściwa ocena");
    }
}

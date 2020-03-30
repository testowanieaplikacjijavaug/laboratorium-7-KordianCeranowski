package zad2;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import zad1.Note;

import java.util.ArrayList;
import java.util.List;

// Changing code to commented lines would make this class fully functional implementation, therefore not a mock.
public class MockNotesStorage implements NotesStorage{

    //private Multimap<String, Note> notes = ArrayListMultimap.create();

    boolean added = false;
    boolean cleared = false;

    public MockNotesStorage() {
    }

    @Override
    public void add(Note note) {
        //notes.put(note.getName(), note);
        added = true;
    }

    @Override
    public List<Note> getAllNotesOf(String name) {
        //return (List<Note>)notes.get(name);
        List<Note> notes = new ArrayList<>();
        notes.add(Note.of("TestName", 3));
        notes.add(Note.of("TestName", 4));
        notes.add(Note.of("TestName", 5));
        return notes;

    }

    @Override
    public void clear() {
        //notes.clear();
        cleared = true;
    }
}

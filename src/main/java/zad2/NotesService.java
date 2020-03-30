package zad2;

import zad1.Note;

public interface NotesService {
    void add(Note note);
    float averageOf(String name);
    void clear();
}

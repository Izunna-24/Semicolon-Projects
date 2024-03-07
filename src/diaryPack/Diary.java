package diaryPack;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private boolean isLocked = true;
    private String password;
    private String username;
    private List<Entry> entries = new ArrayList<>();
    private int numberOfEntries;

    public Diary(String password, String username) {
        this.password = password;
        this.username = username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void unLockDiary(String password) {
        if (this.password.equals(password)) {
            isLocked = false;
        }
    }


    public void lockDiary() {
        isLocked = true;

    }

    public void createEntry(String tittle, String body) {
        int entryId = ++numberOfEntries;
        Entry entry = new Entry(entryId, tittle, body);
        entries.add(entry);
    }

    public int diaryBody() {
        return entries.size();
    }

    public void deleteEntry(int entryId) {
        Entry entry = findEntryById(entryId);
        entries.remove(entry);
    }
    public Entry findEntryById(int entryId) {
        for (int index = 0; index < numberOfEntries; index++) {
            if (entries.get(index).getId() == entryId) {
                return entries.get(index);
            }

        }
      throw new NullPointerException("entry does not exist");

    }

    public void updateEntry(int id, String tittle, String body) {
        Entry entry = findEntryById(id);
        entry.updateTittle(tittle);
        entry.updateBody(body);

    }
}

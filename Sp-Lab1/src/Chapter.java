import java.util.ArrayList;
import java.util.List;

public class Chapter {
    private String nume;
    private List<SubChapter> subChapters = new ArrayList<>();


    public Chapter(String nume) {
        this.nume = nume;
    }

    public int createSubChapter(String title)
    {
        this.subChapters.add(new SubChapter(title));
        return this.subChapters.size() - 1;
    }

    public SubChapter getSubChapter(int index) {
        return this.subChapters.get(index);
    }
}
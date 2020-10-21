import java.util.ArrayList;

public class Book{

    private ArrayList<Chapter> list = new ArrayList<>();
    private int counter;
    private String title;
    private Author author;
    private Element elements = null;

    Book(String title)
    {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                '}';
    }
    public void addAuthor(Author autor) {
        this.author = autor;
    }


    public int createChapter(String title)
    {
        this.list.add(new Chapter(title));
        return this.list.size() - 1;
    }


    public Chapter getChapter(int index)
    {
        return this.list.get(index);
    }


    public void print() {
        if(this.elements != null) {
            elements.print();
        }
    }

}

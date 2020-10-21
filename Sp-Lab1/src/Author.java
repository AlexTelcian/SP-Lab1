public class Author {
    String title;

    Author(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Paragraph{" +
                "pText='" + title + '\'' +
                '}';
    }

    public void print() {
        System.out.println(this.toString());
    }
}

import java.util.ArrayList;
import java.util.List;

public class SubChapter {


    private String text;
    private List<Image> images = new ArrayList<Image>();
    private List<Paragraph> paragraphs = new ArrayList<Paragraph>();
    private List<Table> tables = new ArrayList<Table>();

    SubChapter(String text) {
        this.text = text;
    }

    public void createNewParagraph(String pgf) {
        this.paragraphs.add(new Paragraph(pgf));
    }

    public void createNewImage(String image) {
        this.images.add(new Image(image));
    }

    public void createNewTable(String table) {
        this.tables.add(new Table(table));
    }


    public String getText() {
        return text;
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Paragraph> getParagraphs() {
        return paragraphs;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void print()
    {
        System.out.println(this.toString());
    }

    @Override
    public String toString()
    {
        StringBuilder p, t, i;
        p = new StringBuilder();
        t = new StringBuilder();
        i = new StringBuilder();

        for(Paragraph s : this.getParagraphs())
        {
            p.append(s.toString());
        }

        for(Image s : this.getImages())
        {
            i.append(s.toString());
        }

        for(Table s : this.getTables())
        {
            t.append(s.toString());
        }


        return "SubChapter: "+this.getText()+
                p+i+t;
    }

}
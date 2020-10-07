public class Book {

    public String image,table,name;
    public String paragraph;

    public Book(String name)
    {
        this.name = name;
    }
    public void createNewParagraph(String paragraph)
    {
        this.paragraph = paragraph;
    }

    public void createNewImage(String image)
    {
        this.image = image;
    }

    public void createNewTable(String table)
    {
        this.table = table;
    }

    public void print()
    {
        System.out.println(name + "\n" + paragraph + "\n" + image + "\n" + table) ;
    }

}

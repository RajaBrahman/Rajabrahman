import java.io.*;
class Book
{
    String publisher;
    String author;
    String bookName;
    int isbcNumber;

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public void setBookName(String bookName)
    {
        this.bookName = bookName;
    }
    public void setIsbcNumber(int isbcNumber)
    {
        this.isbcNumber = isbcNumber;
    }
    public String getPublisher()
    {
        return publisher;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getBookName()
    {
        return bookName;
    }
    public int getIsbcNumber()
    {
        return isbcNumber;
    }
}

class MainBook
 {
    public static void main(String[] args)
    {
        Book obj = new Book();
        obj.setBookName("LEARNING JAVA");
        obj.setAuthor("MARK ANTONY");
        obj.setIsbcNumber(143256);
        obj.setPublisher("Anudip");
        System.out.println("Book Name  : "+obj.getBookName());
        System.out.println("Author     : "+obj.getAuthor());
        System.out.println("ISBC Number: "+obj.getIsbcNumber());
        System.out.println("Publisher  : "+obj.getPublisher());
    }
}
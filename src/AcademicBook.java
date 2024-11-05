public class AcademicBook extends Book {

   private String subject;



    public AcademicBook(String title, String author, String ISBN, double price, int stock, String subject) {
        super(title, author, ISBN, price, stock);
        this.subject = subject;
    }

    @Override
    public String toString(){
        return "Title: " + super.getTitle() + "\nAuthor: " + super.getAuthor() + "\nISBN: " + super.getISBN() + "\nPrice: " + super.getPrice() + "\nStock: " + this.getStock() + "\nBestselling Academic Book: " + this.isBestseller();
    }


    @Override
    public String getMediaType() {
        if(super.isBestseller())
            return "Bestselling Academic Book";
        else
            return "Bestselling Academic Book";
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

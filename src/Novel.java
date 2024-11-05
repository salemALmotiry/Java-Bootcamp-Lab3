public class Novel extends Book {

    private String genre;



    public Novel(String title, String author, String ISBN, double price, int stock,String genre) {
        super(title, author, ISBN, price, stock);

        this.genre = genre;
    }

    @Override
    public String toString(){
        return "Title: " + super.getTitle() + "\nAuthor: " + super.getAuthor() + "\nISBN: " + super.getISBN() + "\nPrice: " + super.getPrice() + "\nStock: " + this.getStock() + "\nBestselling Novel : " + this.isBestseller();
    }


    @Override
    public String getMediaType() {
        if(this.isBestseller())
            return "Bestselling Novel";
        else
            return "Novel";
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

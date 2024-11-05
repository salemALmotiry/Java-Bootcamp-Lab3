import java.util.ArrayList;

public class Book extends Media{


    private ArrayList<Review> reviews;




    public Book(String title, String author, String ISBN, double price, int stock) {
        super(title, author, ISBN, price);
        super.setStock(stock);
        this.reviews = new ArrayList<>();
    }


    public void addReview(Review review) {
        this.reviews.add(review);
    }

    public double getAverageRating() {
        int rating=0;
        int counter = 0;
        for (Review review : reviews) {
            rating += review.getRating();
            counter++;
       }

        return (double) rating /counter;
    }


    public void purchase(User user) {
       if (super.getStock()>0) {

           user.directPurchaseMedia(this);
           super.setStock(super.getStock() - 1);
           System.out.println(user.getName() + " is reading " + super.getTitle());
       }else {
           System.out.println("Out of stock");
       }
    }



    public boolean isBestseller(){
        double bestsellerRating = getAverageRating();

        return bestsellerRating > 4.5;
    }

    public void restock(int quantity){
        super.setStock(super.getStock() + quantity);
        System.out.println("Restock successful" + super.getStock());
    }


    @Override
    public String toString(){
        return super.toString() + "\nStock: " + super.getStock() + "\nBestselling Book : " + this.isBestseller();
    }



    public String getMediaType() {
        if(this.isBestseller())
            return "Bestselling Book";
        else
            return "Book";
    }





    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }
}

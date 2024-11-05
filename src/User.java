import java.util.ArrayList;
import java.util.Collections;

public class User {

    private String name;
    private String email;

    ArrayList<Media> purchaseMedia = new ArrayList<>();

    ArrayList<Media> shoppingCartMedia = new ArrayList<>();

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }


   public void addToShoppingCart(Media media) {


       if(media.getStock() == Integer.MIN_VALUE || media.getStock() > 0 ) {
           shoppingCartMedia.add(media);
           System.out.println("\n"+media.getTitle() + " added to shopping cart.");

       }else {

           System.out.println("\n"+media.getTitle() + " is out of stock right now.");
       }

    }

    public void removeFromShoppingCart(Media media) {
        if(shoppingCartMedia.contains(media)) {
            shoppingCartMedia.remove(media);
            System.out.println(media.getTitle() + " removed from shopping cart.");
        }else
            System.out.println("Item not in shopping cart.");

   }

    public void checkout() {
      for (Media media : shoppingCartMedia) {
          if(media.getStock() == Integer.MIN_VALUE  ) {
              purchaseMedia.add(media);

          }else if( media.getStock() > 0 ){
              purchaseMedia.add(media);
              media.setStock(media.getStock() - 1);
          }else {

              System.out.println("\n"+media.getTitle() + " is out of stock right now. We will update you on restock");
          }
      }

       shoppingCartMedia.clear();

       System.out.println("Purchase has been checked out.");
   }



   public void directPurchaseMedia(Media media) {
        purchaseMedia.add(media);
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
       return "name : " + name + ", email : " + email ;
    }

    public ArrayList<Media> getPurchaseMedia() {
        return purchaseMedia;
    }

    public void setPurchaseMedia(ArrayList<Media> purchaseMedia) {
        this.purchaseMedia = purchaseMedia;
    }

    public ArrayList<Media> getShoppingCartMedia() {
        return shoppingCartMedia;
    }

    public void setShoppingCartMedia(ArrayList<Media> shoppingCartMedia) {
        this.shoppingCartMedia = shoppingCartMedia;
    }
}

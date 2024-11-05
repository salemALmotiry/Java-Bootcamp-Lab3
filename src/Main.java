import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    //                                              Test data
    Book book1 = new Book("Melania", "Melania Trump", "1510782699", 28.00, 5);
    Book book2 = new Book("Storytelling", "David Yarrow", "0847872297", 115.00, 10);
    Book book3 = new Book("A Journey Through Every Country in the World", "Lonely Planet", "1838694595", 28.89, 2);
    Book book4 = new Book("The Alchemist", "Paulo Coelho", "0062315005", 16.99, 8);
    Book book5 = new Book("Becoming", "Michelle Obama", "1524763136", 18.99, 2);

    Novel novel1 = new Novel("I Think We've Been Here Before", "Suzy Krause", "1662517521", 16.99, 3, "Fantasy");
    Novel novel2 = new Novel("To Kill a Mockingbird", "Harper Lee", "4756527521", 22.25, 5, "Crime and Mystery");
    Novel novel3 = new Novel("The Grey Wolf: A Novel", "Kindle Edition", "8989027606", 14.99, 4, "Mystery");
    Novel novel4 = new Novel("The Nightingale", "Kristin Hannah", "0436564934", 30.99, 0, "Mystery");
    Novel novel5 = new Novel("The Great Alone", "Kristin Hannah", "0316769487", 12.99, 5, "Classic Fiction");

    AcademicBook academicBook1 = new AcademicBook("Effective Academic Writing", "Alice Savage", "9780194323468", 25.99, 1, "Academic Writing");
    AcademicBook academicBook2 = new AcademicBook("Introduction to Algorithms", "Thomas Cormen", "0262033844", 80.99, 2, "Computer Science");
    AcademicBook academicBook3 = new AcademicBook("Physics for Scientists and Engineers", "Raymond A. Serway", "1337553298", 99.99, 4, "Physics");
    AcademicBook academicBook4 = new AcademicBook("Chemistry", "Bruice", "013404228X", 74.99, 5, "Chemistry");
    AcademicBook academicBook5 = new AcademicBook("Calculus", "James Stewart", "0357043211", 89.99, 3, "Mathematics");

    Music music1 = new Music("Blinding Lights", "Vevo", "3836584387", 2.99, "The Weeknd");
    Music music2 = new Music("Mockingbird", "Eminem ", "7433527621", 3.49, "Eminem ");
    Music music3 = new Music("Rolling in the Deep", "Adele", "1296582735", 1.99, "Adele");
    Music music4 = new Music("Human", "Rag'n'Bone Man", "8563249853", 2.59, "Rag'n'Bone Man");
    Music music5 = new Music("Sweet Dreams", "The Weeknd", "4628732931", 2.99, "The Weeknd");

    Movie movie1 = new Movie("Blinding", "Vevo", "5536584387", 9.99, 120);
    Movie movie2 = new Movie("Mockingbird", "Eminem ", "7438797621", 6.99, 100);
    Movie movie3 = new Movie("Rolling in the Deep", "Adele", "1296352735", 5.99, 60);
    Movie movie4 = new Movie("Human", "Adele", "8565459853", 11.99, 99);
    Movie movie5 = new Movie("Dreams", "Adele", "46287546931", 15.99, 101);


    Review review1 = new Review("salem","Extend doesn’t daily shape any explosion of the resurrection — but the self is what experiments.",5);
    Review review2 = new Review("khaled","Try heating stew brushed with condensed milk, whisked with nutmeg.",2);
    Review review3 = new Review("sara","Faith ho! hail to be crushed.",5);
    Review review4 = new Review("mohammed","Everyone just loves the tartness of leek casserole soakd with garlic.",5);
    Review review5 = new Review("salem","Extend doesn’t daily shape any explosion of the resurrection — but the self is what experiments.",5);
    Review review6 = new Review("maram","Fortis de ferox elevatus, vitare impositio!",4);


//                             Users
    User user1 = new User("salem", "salem@gmail.com");
    User user2 = new User("othman", "othman@gmail.com");
    User user3 = new User("khaled", "khaled@gmail.com");
    User user5 = new User("sara", "sara@gmail.com");
    User user4 = new User("mohammed", "mohammed@gmail.com");
    User user6 = new User("maram", "maram@gmail.com");


    Store allInOneStore = new Store();

    // Store users
    allInOneStore.addUser(user1);
    allInOneStore.addUser(user2);
    allInOneStore.addUser(user3);
    allInOneStore.addUser(user4);
    allInOneStore.addUser(user5);
    allInOneStore.addUser(user6);

    stockStore(allInOneStore, book1, book2, book3, book4, book5,
               music1, music2, music3, music4, music5,
               movie1, movie2, movie3, movie4, movie5,
               novel1, novel2, novel3, novel4, novel5,
               academicBook1, academicBook2, academicBook3, academicBook4, academicBook5);




    // check store status

     allInOneStore.displayMedia();
     allInOneStore.displayUser();


        // Test 1
        /*
        * comment store status before testing
        * Actions like listen, watch, or direct book purchases do not impact the shopping cart status.
         * */
//        user3.addToShoppingCart(movie1);
//        user3.addToShoppingCart(academicBook1);
//        user3.addToShoppingCart(book1);
//        System.out.println(" ");
//        music4.listen(user3);
//        movie2.watch(user3);
//        book2.purchase(user3);
//
//        System.out.println("\n");
//        System.out.println("Shopping Cart Media");
//        System.out.println("_______________________________");
//        for(Media media : user3.getShoppingCartMedia()){
//            System.out.println(media.toString());
//            System.out.println("____________________________");
//        }
//
//        System.out.println("\n");
//        System.out.println("Purchase Media");
//        System.out.println("_______________________________");
//        for(Media media : user3.getPurchaseMedia()){
//            System.out.println(media.toString());
//            System.out.println("____________________________");
//        }

        // Test 2

        /*
        * user can't purchase Out of stock items
        * novel 4 init set to be out stock
        * */

//        novel4.purchase(user3);
//        System.out.println("\n"+novel4.toString()+"\n");

        // Test 3
        /*
        * Bestselling status change after reviews updated
        *
        */

//        novel4.addReview(review3);
//        novel4.addReview(review4);
//
//        System.out.println(novel4.toString());


        // Test 4
        /*
        * Add an out-of-stock item to the shopping cart.
        */

//        user3.addToShoppingCart(novel4);

        // Test 5
        /*
        *If an item remains in a user's shopping cart for too long, another user can purchase it, and it may go out of stock.
        * As a result, the purchase cannot be processed if the stock runs out.
        *  Currently, the stock of Novel 4 is 0 until it is restocked.
        * */

//        novel4.setStock(1);
//        System.out.println(novel4.toString());
//
//        System.out.println("\nUser 3 shopping cart ");
//        user3.addToShoppingCart(novel4);
//        user3.addToShoppingCart(movie2);
//
//        System.out.println("\nUser 1 check out");
//        user1.addToShoppingCart(novel4);
//        user1.checkout();
//        System.out.println("\nUser 3 check out");
//        user3.checkout();
//
//        System.out.println("\n");
//        System.out.println("Purchase Media");
//        System.out.println("_______________________________");
//        for(Media media : user3.getPurchaseMedia()){
//            System.out.println(media.toString());
//            System.out.println("____________________________");
//        }

        // Test 5
        /*
        * recommendSimilarMovies and generatePlaylist
        * */

//        ArrayList<Music> musics = new ArrayList<>();
//        musics.add(music2);
//        musics.add(music3);
//        musics.add(music4);
//        musics.add(music5);
//        System.out.println("Playlist: ");
//        for (Music music : music1.generatePlaylist(musics)) {
//            System.out.println(music.toString());
//            System.out.println("_______________________________");
//
//        }
//
//
//        ArrayList<Movie> movies = new ArrayList<>();
//        movies.add(movie1);
//        movies.add(movie2);
//        movies.add(movie4);
//        movies.add(movie5);
//        System.out.println("Movies: ");
//        for (Movie movie : movie3.recommendSimilarMovies(movies)) {
//            System.out.println(movie.toString());
//            System.out.println("_______________________________");
//
//        }

        // test 6

        /*
        *
        * add items to their shopping carts, remove items, and complete purchases.
         * */

//
//        System.out.println("\nUser 1 shopping cart ");
//        user1.addToShoppingCart(novel1);
//        user1.addToShoppingCart(movie2);
//        user1.addToShoppingCart(novel1);
//        user1.addToShoppingCart(academicBook3);
//        user1.addToShoppingCart(movie3);
//
//
//        System.out.println("\n");
//        System.out.println("Shopping Cart Media");
//        System.out.println("_______________________________");
//        for(Media media : user1.getShoppingCartMedia()){
//            System.out.println(media.toString());
//            System.out.println("____________________________");
//        }
//
//        user1.removeFromShoppingCart(novel1);
//        user1.removeFromShoppingCart(academicBook3);
//
//        System.out.println("\n");
//        System.out.println("Shopping Cart Media");
//        System.out.println("_______________________________");
//        for(Media media : user1.getShoppingCartMedia()){
//            System.out.println(media.toString());
//            System.out.println("____________________________");
//        }
//
//        user1.checkout();
//        System.out.println("\n");
//        System.out.println("Shopping Cart Media");
//        System.out.println("_______________________________");
//        for(Media media : user1.getPurchaseMedia()){
//            System.out.println(media.toString());
//            System.out.println("____________________________");
//        }















    }

    public static void stockStore(Store allInOneStore, Book book1, Book book2, Book book3, Book book4, Book book5, Music music1, Music music2, Music music3, Music music4, Music music5, Movie movie1, Movie movie2, Movie movie3, Movie movie4, Movie movie5, Novel novel1, Novel novel2, Novel novel3, Novel novel4, Novel novel5, AcademicBook academicBook1, AcademicBook academicBook2, AcademicBook academicBook3, AcademicBook academicBook4, AcademicBook academicBook5) {
        allInOneStore.addMedia(book1);
        allInOneStore.addMedia(book2);
        allInOneStore.addMedia(book3);
        allInOneStore.addMedia(book4);
        allInOneStore.addMedia(book5);

        allInOneStore.addMedia(music1);
        allInOneStore.addMedia(music2);
        allInOneStore.addMedia(music3);
        allInOneStore.addMedia(music4);
        allInOneStore.addMedia(music5);

        allInOneStore.addMedia(movie1);
        allInOneStore.addMedia(movie2);
        allInOneStore.addMedia(movie3);
        allInOneStore.addMedia(movie4);
        allInOneStore.addMedia(movie5);

        allInOneStore.addMedia(novel1);
        allInOneStore.addMedia(novel2);
        allInOneStore.addMedia(novel3);
        allInOneStore.addMedia(novel4);
        allInOneStore.addMedia(novel5);

        allInOneStore.addMedia(academicBook1);
        allInOneStore.addMedia(academicBook2);
        allInOneStore.addMedia(academicBook3);
        allInOneStore.addMedia(academicBook4);
        allInOneStore.addMedia(academicBook5);
    }
}
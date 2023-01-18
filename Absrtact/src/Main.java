public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book book=new Book("Hind",50,"John");
        Movie movie=new Movie("drama",70,"Biter");
        System.out.println("Name: "+book.getName()+"\nPrice: "+book.getPrice()+"\nAuthor: "+book.getAuthor());
        System.out.println("Book Price after discount: "+book.getDiscount());
        System.out.println("Name: "+movie.getName()+"Price: "+movie.getPrice()+"Director: "+movie.getDirector());
        System.out.println("Movie Price after discount: "+movie.getDiscount());

    }
}
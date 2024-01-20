public class BookProg {
    
    public static void main(String[] args) {
        
        Book books[] = new Book[3];
        // for (int i=0; i<3; i++) {
        //     books[i] = new Book();
        // }

        books[0] = new Book();
        books[1] = new Book();
        books[2] = new Book();

        books[0].setTitle("American Gods");
        books[0].setAuthor("Neil Gaiman");
        books[0].setFirstEdition(2001);

        books[1].setTitle("The Magicians");
        books[1].setAuthor("Lev Grossman");
        books[1].setFirstEdition(2009);

        books[2].setTitle("Lord of the Rings");
        books[2].setAuthor("Tolkien");
        books[2].setFirstEdition(1954);
        
        for (int i=0; i<books.length; i++) {
            System.out.println("Author: " + books[i].getAuthor() 
            + ", Book: " + books[i].getTitle()
            + ", FirstEdition: " + books[i].getFirstEdition());
        }
    }
}

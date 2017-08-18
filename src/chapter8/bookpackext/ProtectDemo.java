package chapter8.bookpackext;

class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java: A Beginner's Guide", "Schildt", 2014, "McGraw-Hill Professional");
        books[1] = new ExtBook("Java; The Complete Reference", "Schildt", 2014, "McGraw-Hill Professional");
        books[2] = new ExtBook("The Art Of Java", "Schildt and Holmes", 2003, "McGraw-Hill Professional");
        books[3] = new ExtBook("Red Storm Resing", "Clancy", 1986, "Putnam");
        books[4] = new ExtBook("On the Road", "Kerouac", 1955, "Viking");

        for (int i = 0; i < books.length; i++)  books[i].show();

        System.out.println("Showing all books by Schildt");
        for (int i = 0; i < books.length; i++)
            if (books[i].getAuthor() == "Schildt")
                System.out.println(books[i].getTitle());
    }
}

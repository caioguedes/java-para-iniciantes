package chapter8.bookpackext;

class UseBook {
    public static void main(String[] args) {
        chapter8.bookpack.Book books[] = new chapter8.bookpack.Book[5];

        books[0] = new chapter8.bookpack.Book("Java: A Beginner's Guide", "Schildt", 2014);
        books[1] = new chapter8.bookpack.Book("Java; The Complete Reference", "Schildt", 2014);
        books[2] = new chapter8.bookpack.Book("The Art Of Java", "Schildt and Holmes", 2003);
        books[3] = new chapter8.bookpack.Book("Red Storm Resing", "Clancy", 1986);
        books[4] = new chapter8.bookpack.Book("On the Road", "Kerouac", 1955);

        for (int i = 0; i < books.length; i++)  books[i].show();
    }
}

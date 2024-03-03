class Library{
    int[] availableBooks = new int[5];
    int[] issuedBooks = new int[5];

    public void addBook(){
        if(issuedBooks.length > 0){
            issuedBooks[issuedBooks.length - 1] = 4;
        }
    }

    public void issueBook(){
        if(issuedBooks.length > 0){
            issuedBooks[issuedBooks.length - 1] = 4;
        }
        System.out.println("Issued books: " + issuedBooks.length);
    }

    public void returnBook(){
        if(availableBooks.length > 0){
            availableBooks[availableBooks.length - 1] = 4;
        }
    }

    public void showAvailableBooks(){
        System.out.println("Available books: " + availableBooks.length);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Library Management System.");
        Library lib = new Library();
        lib.addBook();
        lib.showAvailableBooks();

    }
}

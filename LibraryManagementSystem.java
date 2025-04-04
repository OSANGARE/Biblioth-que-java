public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library("Городская Центральная Библиотека");
        
        Book book1 = new Book("1984", "Джордж Оруэлл", "123456789");
        Book book2 = new Book("Мастер и Маргарита", "Михаил Булгаков", "987654321");
        
        library.addBook(book1);
        library.addBook(book2);
        
        Member member = new Member("Иван Иванов", "M001");
        library.registerMember(member);
        
        library.lendBook("123456789", "M001");
        
        library.displayAvailableBooks();
    }
}

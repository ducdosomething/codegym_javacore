package miniTest;

public class Main {
    public static void main(String[] args) {

        ProgrammingBook programmingBook1 = new ProgrammingBook(1, "Java Spring", 5.0, "Adam", "Java", "Spring");
        ProgrammingBook programmingBook2 = new ProgrammingBook(2, "Java Core", 7.0, "Kevin", "Java", "Spring");
        ProgrammingBook programmingBook3 = new ProgrammingBook(3, "SQL tutorial", 3.0, "Sam", "SQL", "SQL");
        ProgrammingBook programmingBook4 = new ProgrammingBook(4, "MySQL", 10.0, "Helen", "SQL", "SQL");
        ProgrammingBook programmingBook5 = new ProgrammingBook(5, "C Tutorial", 9.0, "Jake", "C", "NET");

        FictionBook fictionBook1 = new FictionBook(1, "Sherlock Holmes", 100.0, "Arthur Conan Doyle", "detective");
        FictionBook fictionBook2 = new FictionBook(2, "Planet Mars", 13.0, "David", "Vien tuong 1");
        FictionBook fictionBook3 = new FictionBook(3, "Back to moon", 7.0, "Josh", "Vien tuong 1");
        FictionBook fictionBook4 = new FictionBook(4, "Hello Earth", 110.0, "Steven", "Vien tuong 1");
        FictionBook fictionBook5 = new FictionBook(5, "Conan", 33.0, "Kim", "Vien tuong 1");

        System.out.println("Programming Book list: ");
        programmingBook1.displayBook(programmingBook1);
        programmingBook2.displayBook(programmingBook2);
        programmingBook3.displayBook(programmingBook3);
        programmingBook4.displayBook(programmingBook4);
        programmingBook5.displayBook(programmingBook5);

        System.out.println("--------------");

        System.out.println("Fiction Book list:");
        fictionBook1.displayBook(fictionBook1);
        fictionBook2.displayBook(fictionBook2);
        fictionBook3.displayBook(fictionBook3);
        fictionBook4.displayBook(fictionBook4);
        fictionBook5.displayBook(fictionBook5);

        double totalProgrammingPrice = Book.getTotalPrice(programmingBook1, programmingBook2, programmingBook3, programmingBook4, programmingBook5);
        double totalFictionPrice = Book.getTotalPrice(fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5);

        System.out.println("--------------");

        double total10Book = totalProgrammingPrice + totalFictionPrice;
        System.out.println("Total 10 book price: " + total10Book);

        System.out.println("--------------");
        int countJava = ProgrammingBook.countJava(programmingBook1, programmingBook2, programmingBook3, programmingBook4, programmingBook5);
        System.out.println("Number of Java language programming book: " + countJava);

        System.out.println("--------------");
        int countByCategory = FictionBook.countByCategory(fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5);
        System.out.println("Number of Vien tuong 1 category fiction book: " + countByCategory);

        System.out.println("--------------");
        int countByPrice = FictionBook.countByPrice(fictionBook1, fictionBook2, fictionBook3, fictionBook4, fictionBook5);
        System.out.println("Number of book have the price < 100: " + countByPrice);
    }
}

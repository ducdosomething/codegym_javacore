package miniTest;

public class ProgrammingBook extends Book {
    private String language;
    private  String framework;

    public ProgrammingBook() {

    }

    public ProgrammingBook(String language, String framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return  "ProgrammingBook{" +
                "BookCode = '" + getBookCode() + '\'' +
                ", Name = '" + getName() + '\'' +
                ", Price = '" + getPrice() + '\'' +
                ", Author = '" + getAuthor() + '\'' +
                ", Language='" + language + '\'' +
                ", Framework='" + framework + '\'' +
                '}';
    }

    public static int countJava(ProgrammingBook... programmingBookArr) {
        int count = 0;
        for (ProgrammingBook programmingBook : programmingBookArr) {
            if (programmingBook.language.equals("Java")) {
                count++;
            }
        }
        return count;
    }
}

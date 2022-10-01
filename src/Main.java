public class Main {
    public static void main(String[] args) {
        Author authorBulgakov = new Author("Булгаков", "Михаил");
        Author authorPushkin = new Author("Пушкин", "Александр");
        Book bookFirst = new Book("Я убил", 926, authorBulgakov);
        Book bookSecond = new Book("Сказка о царе Салтане", 1831, authorPushkin);
        System.out.println(bookFirst);
        bookFirst.setAge(1926);
        System.out.println(bookFirst);
    }
}
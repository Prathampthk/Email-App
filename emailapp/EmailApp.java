package emailapp;

public class EmailApp {
    public static void main(String[] args) {
        Email em1 = new Email("Pratham", "Pathak");

        em1.setAlternateEmail("prathampthk13@gmail.com");

        System.out.println(em1.showInfo());
    }

}

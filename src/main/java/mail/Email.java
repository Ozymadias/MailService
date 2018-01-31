package mail;

public class Email {
    private final String address;
    private final String title;
    private final String body;

    public Email(String address, String title, String body) {

        this.address = address;
        this.title = title;
        this.body = body;
    }
}

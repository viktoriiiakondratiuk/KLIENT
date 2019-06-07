package client;

public class Message {
    private String login;
    private String message;
    private byte[] file;


    public Message(String login, String filename, byte[] content) {
        this.login = login;
        this.message = filename;
        this.file = content;
    }
    public Message() {
        this.login =
                this.message = message;
        this.file = null;
    }
    public boolean isMessage() {
        return this.file == null;
    }

    public void setLogin(String mass) {
        this.login = mass;
    }

    public String getLogin() {
        return login;
    }
}


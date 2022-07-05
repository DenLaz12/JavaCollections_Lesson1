public class Message {

    private String name;
    private String phoneNumber;
    private String status;

    public Message(String name, String phoneNumber, String status) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStatus() {
        return status;
    }
}

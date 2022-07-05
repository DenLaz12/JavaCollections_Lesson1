public class CallLog {

    private String phoneNumber;
    private long duration;

    public CallLog(String phoneNumber, long duration) {
        this.phoneNumber = phoneNumber;
        this.duration = duration;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public long getDuration() {
        return duration;
    }
}

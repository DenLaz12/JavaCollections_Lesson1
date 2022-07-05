import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    public void run(){
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Denys", "+45743837583"));
        contacts.add(new Contact("Dmytro", "+48567253879"));

        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getPhoneNumber());
        }

        Collection<Contact> printContact = findContact(contacts, "De");
        for (Contact results : printContact) {
            System.out.println(results.getName() + " " + results.getPhoneNumber() );
        }

        System.out.println("---------------------------");

        List<CallLog> callLogs = new ArrayList<>();
        callLogs.add(new CallLog("+45743837583", 6));
        callLogs.add(new CallLog("+11111111111", 3));

        for (CallLog callLog : callLogs) {
            System.out.println(callLog.getPhoneNumber() + " " + callLog.getDuration());
        }

        Collection<CallLog> printCallLog = findCallLog(callLogs, "+457");
        for (CallLog results : printCallLog) {
            System.out.println(results.getPhoneNumber() + " " + results.getDuration());
        }

        System.out.println("---------------------------");

        List<Message> messages = new ArrayList<>();
        messages.add(new Message("Denys", "+45743837583", "Read"));
        messages.add(new Message("Dmytro", "+48567253879", "Unread"));

        for (Message message : messages) {
            System.out.println(message.getName() + " " + message.getPhoneNumber() + " " + message.getStatus());
        }

        Collection<Message> printMessage = findMessage(messages,"Unread");
        for (Message results : printMessage) {
            System.out.println(results.getName() + " " + results.getPhoneNumber() + " " + results.getStatus());
        }

    }

    private Collection<Contact> findContact (Collection<Contact> items, String name){
        Collection<Contact> result = new ArrayList<>();
        for (Contact item : items) {
            if (item.getName().contains(name)){
                result.add(item);
            }
        }
        return result;
    }

    private Collection<CallLog> findCallLog (Collection<CallLog> items, String phoneNumber){
        Collection<CallLog> result = new ArrayList<>();
        for (CallLog item : items) {
            if (item.getPhoneNumber().contains(phoneNumber)){
                result.add(item);
            }
        }
        return result;
    }

    private Collection<Message> findMessage (Collection<Message> items, String status){
        Collection<Message> result = new ArrayList<>();
        for (Message item : items) {
            if (item.getStatus().contains(status)){
                result.add(item);
            }
        }
        return result;
    }
}

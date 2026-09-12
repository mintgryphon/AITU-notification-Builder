public class AITUnotification {
    private final String recipient;
    private final String subject;
    private final String message;
    private final String link;

    AITUnotification(String recipient, String subject, String message, String link) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
        this.link = link;
    }

    public String getRecipient() {
        return recipient;
    }
    public String getSubject() {
        return subject;
    }
    public String getMessage() {
        return message;
    }
    public String getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "AITUnotification[" + "recipient='" + recipient + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", link='" + link + '\'' +
                ']';
    }
}
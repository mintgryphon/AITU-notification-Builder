public class NotificationObjectBuilder implements NotificationBuilder {

    private String recipient;
    private String subject;
    private String message;
    private String link;

    @Override
    public NotificationObjectBuilder setRecipient(String recipient) {
        this.recipient = recipient;
        return this;
    }
    @Override
    public NotificationObjectBuilder setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    @Override
    public NotificationObjectBuilder setMessage(String message) {
        this.message = message;
        return this;
    }
    @Override
    public NotificationObjectBuilder setLink(String link) {
        this.link = link;
        return this;
    }

    public AITUnotification getResult() {
        if (recipient == null || recipient.isBlank()) {
            throw new IllegalStateException("Recipient is required");
        }
        if (subject == null || subject.isBlank()) {
            throw new IllegalStateException("Subject is required");
        }
        if (message == null || message.isBlank()) {
            throw new IllegalStateException("Recipient is required");
        }
        return new AITUnotification(recipient, subject, message, link);
    }

}
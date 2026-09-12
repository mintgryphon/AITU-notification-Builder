public class NprewiewBuilder implements NotificationBuilder {

    private final StringBuilder preview =
            new StringBuilder("=== AITU NOTIFICATION ===\n");

    @Override
    public NprewiewBuilder setRecipient(String recipient) {
        preview.append("To: ").append(recipient).append("\n");
        return this;
    }

    @Override
    public NprewiewBuilder setSubject(String subject) {
        preview.append("Subject: ").append(subject).append("\n");
        return this;
    }

    @Override
    public NprewiewBuilder setMessage(String message) {
        preview.append("Message: ").append(message).append("\n");
        return this;
    }

    @Override
    public NprewiewBuilder setLink(String link) {
        if (link != null && !link.isBlank()) {
            preview.append("Link: ").append(link).append("\n");
        }
        return this;
    }
    public String getResult() {
        return preview.toString();
    }


}
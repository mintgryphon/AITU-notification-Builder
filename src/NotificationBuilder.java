public interface NotificationBuilder {
    NotificationBuilder setRecipient(String recipient);
    NotificationBuilder setSubject(String subject);
    NotificationBuilder setMessage(String message);
    NotificationBuilder setLink(String link);
}
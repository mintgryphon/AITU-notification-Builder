public class NotificationDirector {
    private final NotificationBuilder builder;

    public NotificationDirector(NotificationBuilder builder) {
        this.builder = builder;
    }

    public void makeLessonNotification() {
        builder
                .setRecipient("aaaaa@astanait.edu.kz")
                .setSubject("Lesson Reminder")
                .setMessage("Your programming lesson starts at 10:00.")
                .setLink("https://teams.invite.com");
    }

    public void makeEventNotification() {
        builder
                .setRecipient("aaaaa@astanait.edu.kz")
                .setSubject("AITU UAV Event")
                .setMessage("A university event will take place tomorrow.")
                .setLink("https://uavclub.kz");
    }

    public void makeAttendanceNotification() {
        builder
                .setRecipient("aaaaa@astanait.edu.kz")
                .setSubject("Attendance Notice")
                .setMessage("Your attendance information has been updated.");
    }
}
public class Main {
    public static void main(String[] args) {
        NotificationObjectBuilder objectBuilder =
                new NotificationObjectBuilder();
        NotificationDirector director =
                new NotificationDirector(objectBuilder);
        director.makeLessonNotification();
        AITUnotification notification =
                objectBuilder.getResult();
        System.out.println("Object representation:");
        System.out.println(notification);

        NprewiewBuilder previewBuilder =
                new NprewiewBuilder();
        director = new NotificationDirector(previewBuilder);
        director.makeEventNotification();
        String preview =
                previewBuilder.getResult();
        System.out.println("\nText representation:");
        System.out.println(preview);


        NotificationObjectBuilder attendanceBuilder =
                new NotificationObjectBuilder();
        director = new NotificationDirector(attendanceBuilder);
        director.makeAttendanceNotification();
        AITUnotification attendanceNotification =
                attendanceBuilder.getResult();
        System.out.println("Attendance notification:");
        System.out.println(attendanceNotification);
    }

}
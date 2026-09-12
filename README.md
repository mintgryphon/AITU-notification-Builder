# AITU Notification Builder

# Description

This project demonstrates the Builder Design Pattern in Java.

The project models university notifications for AITU. The same notification can be created in two different representations:

- an `AITUNotification` object
- a text preview

The Builder Pattern separates the construction process from the final representation of the notification.

# Project Structure

- `AITUNotification.java` — Product. Represents an immutable notification.
- `NotificationBuilder.java` — Builder interface that defines the construction steps.
- `NotificationObjectBuilder.java` — Concrete Builder that creates an `AITUNotification` object.
- `NotificationPreviewBuilder.java` — Concrete Builder that creates a text preview.
- `NotificationDirector.java` — Director that provides ready notification configurations.
- `Main.java` — Client that demonstrates the Builder Pattern.

# Notification Types

The Director provides three notification configurations:

- Lesson Notification
- Event Notification
- Attendance Notification

# Features

- Builder Design Pattern
- Fluent API
- Two Concrete Builders
- Two representations of the same notification
- Immutable Product
- Validation of required fields
- Reusable configurations through the Director
# Technologies

- Java
- Builder Design Pattern

# How to Run

1. Open the project in a Java IDE.
2. Make sure Java is installed.
3. Run `Main.java`.
4. The generated notifications and text preview will be displayed in the console.

# GitHub Repository

https://github.com/mintgryphon/AITU-notification-Builder

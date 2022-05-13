1. A list consisting of reminders the users want to be aware of. The application must allow
users to add reminders to a list, delete reminders from a list, and edit the reminders in
the list.
ReminderList class to add, edit, delete lists and to add, edit, and delete reminders from list. The list also contains a method to clear all checkmarks. 
2. The application must contain a database (DB) of reminders and corresponding data.
I added a database called reminders that connects to the reminder class 
3. Users must be able to add reminders to a list by picking them from a hierarchical list,
where the first level is the reminder type (e.g., Appointment), and the second level is the
name of the actual reminder (e.g., Dentist Appointment).
ReminderType class and Reminder class were created with hierarchy variables assigned to each class.
4. Users must also be able to specify a reminder by typing its name. In this case, the
application must look in its DB for reminders with similar names and ask the user
whether that is the item they intended to add. If a match (or nearby match) cannot be
found, the application must ask the user to select a reminder type for the reminder, or
add a new one, and then save the new reminder, together with its type, in the DB.
ReminderSearch class was created in composition with Reminder class with methods that search, add, select, displaySuggestions and display the reminder. ReminderSearch class relies on the Reminder class to search and update Reminders.
5. The reminders must be saved automatically and immediately after they are modified.
Reminders are saved automatically when being added to the database.
6. Users must be able to check off reminders in the list (without deleting them).
isChecked method in the reminders class will be implemented to check off reminders in the list. 
7. Users must also be able to clear all the check-off marks in the reminder list at once.
ClearAllCheckMarks method is implemented in the list class to clear all the check-off marks in the list at once.
8. Check-off marks for the reminder list are persistent and must also be saved immediately.
The reminder list class aggregrates the reminders class so the check off marks are saved in the database.
9. The application must present the reminders grouped by type.
10. The application must support multiple reminder lists at a time (e.g., “Weekly”, “Monthly”,
“Kid’s Reminders”). Therefore, the application must provide the users with the ability to
create, (re)name, select, and delete reminder lists.
Reminder and ReminderType depend on each other and grouping the reminderType to the reminders will take place in the database.
11. The application should have the option to set up reminders with day and time alert. If this
option is selected allow option to repeat the behavior.
ReminderAlert class created in composition with the Reminders class to carry out methods that set date, time, alert, and repeatAlert.  
12. Extra Credit: Option to set up reminder based on location.
Gps class created in composition with the Reminders class to implement get and set location methods.
13. The User Interface (UI) must be intuitive and responsive. 
ReminderUI class dependent on the Reminder class methods.

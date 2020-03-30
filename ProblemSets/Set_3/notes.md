Calendar:
- Add entries
- Entries should be able to repeat at certain intervals
- Able to set a reminder for an event or meeting
- Meetings should have methods to compile list of attendees and send emails
- Reminders should have functionality to add notes

# Classes
Calender: addEntry(), isRepeat(interval), setReminder(), 
Events: implements Entry; date, time, label
Meetings: implements Entry; date, time, label; showAttendees(), sendEmails()
Reminders: implements Entry; date, time, label

Interface: Entry: date, time, label




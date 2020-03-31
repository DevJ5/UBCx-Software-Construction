Calendar:
- Add entries
- Entries should be able to repeat at certain intervals
- Able to set a reminder for an event or meeting
- Meetings should have methods to compile list of attendees and send emails
- Reminders should have functionality to add notes

# Classes
Calender: addEntry(), isRepeat(interval), setReminder(), 
Events: extends Entry; setReminder(), getReminder()
Meetings: extends Event; getAttendees(), addAttendees(), showAttendees(), sendEmails()
Reminders: extends Entry; addNote

Abstract class Entry: date, time, label, getters, setters



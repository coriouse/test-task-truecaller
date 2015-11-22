Project Specification:
1) Each API call in the project should have a user as parameter (Assume numeric auto
incrementing ids)
2) Design a REST API endpoint to store the views of user profiles
a. UserX viewing the profile of UserY should be recorded
b. Date and time of the view should be recorded
3) Design a REST API endpoint to view the users who viewed this user’s profile in the past.
a. The list should include the viewer’s user id and also the date/time of the view
b. The list should NOT include more than 10 items
c. The list should NOT include views older than 10 days
4) Design any relevant support code to ensure that the requirements in the third
specification are met at all times.
5) Assuming you have millions of views every hour, try to come up with the most efficient
database schema in terms of storage space, latency and throughput. Write inline
comments to justify the design decisions taken, so that the next developer after you will
understand the design and can easily maintain it.


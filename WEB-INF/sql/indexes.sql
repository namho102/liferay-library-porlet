create index IX_3F2F784A on NewLib_Author (name);

create index IX_B96265BF on NewLib_Book (title);

create index IX_E962BE87 on NewLib_Book_Author (authorId);
create index IX_1E0760A5 on NewLib_Book_Author (bookId);
create table NewLib_Author (
	authorId LONG not null primary key,
	name VARCHAR(75) null
);

create table NewLib_Book (
	bookId LONG not null primary key,
	title VARCHAR(75) null,
	description VARCHAR(75) null,
	imageUrl VARCHAR(75) null,
	category VARCHAR(75) null
);

create table NewLib_Book_Author (
	authorId LONG not null,
	bookId LONG not null,
	primary key (authorId, bookId)
);
create table TTM_Contact (
	contactId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	testamentId LONG,
	name VARCHAR(75) null,
	hasOpened BOOLEAN,
	email VARCHAR(75) null,
	phoneNumber VARCHAR(75) null
);

create table TTM_Testament (
	uuid_ VARCHAR(75) null,
	testamentId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	title VARCHAR(75) null,
	message VARCHAR(75) null,
	dueDate DATE null,
	contactId LONG
);
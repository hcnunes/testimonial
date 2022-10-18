create index IX_1DB1E63F on TTM_Contact (hasOpened);
create index IX_D794A0C4 on TTM_Contact (testamentId);
create index IX_461A280E on TTM_Contact (userId);

create index IX_80B802B1 on TTM_Testament (dueDate);
create index IX_7247681B on TTM_Testament (userId);
create index IX_E7FEEC95 on TTM_Testament (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D8139457 on TTM_Testament (uuid_[$COLUMN_LENGTH:75$], groupId);
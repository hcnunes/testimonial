create index IX_7A4764F4 on CAMP_Participante (groupId);

create index IX_2B59BE76 on CAMP_Premio (groupId);

create index IX_FEC60C22 on CAMP_Promocao (companyId);
create index IX_6D473324 on CAMP_Promocao (groupId);
create index IX_ABCE6CBA on CAMP_Promocao (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D19ED9BC on CAMP_Promocao (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FC2306EA on FOO_Participante (groupId, promocaoId);
create index IX_92873183 on FOO_Participante (participanteId, promocaoId);
create index IX_56565CBC on FOO_Participante (promocaoId, userId);

create index IX_F0330D2C on FOO_Premio (groupId, promocaoId);
create index IX_19D3AB67 on FOO_Premio (userIdPremiado, promocaoId);

create index IX_C5A85087 on FOO_Promocao (companyId);
create index IX_EC494CC9 on FOO_Promocao (groupId);
create index IX_8E6E5CB5 on FOO_Promocao (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_BDE08C77 on FOO_Promocao (uuid_[$COLUMN_LENGTH:75$], groupId);
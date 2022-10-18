create table CAMP_Participante (
	participanteId LONG not null primary key,
	promocaoId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);

create table CAMP_Premio (
	premioId LONG not null primary key,
	promocaoId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nome VARCHAR(75) null,
	descricao VARCHAR(75) null,
	fileEntryId LONG,
	fileUrl VARCHAR(75) null
);

create table CAMP_Promocao (
	uuid_ VARCHAR(75) null,
	promocaoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nome VARCHAR(75) null,
	descricao VARCHAR(75) null,
	fileEntryId LONG,
	fileUrl VARCHAR(75) null,
	premioId LONG,
	dataInicio DATE null,
	dataTermino DATE null
);

create table FOO_Participante (
	participanteId LONG not null primary key,
	promocaoId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	email VARCHAR(75) null,
	primeiroNome VARCHAR(75) null,
	ultimoNome VARCHAR(75) null
);

create table FOO_Premio (
	premioId LONG not null primary key,
	promocaoId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nome VARCHAR(75) null,
	descricao VARCHAR(75) null,
	fileEntryId LONG,
	fileUrl VARCHAR(1024) null,
	userIdPremiado LONG
);

create table FOO_Premios (
	premiosId LONG not null primary key,
	promocaoId LONG,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nome VARCHAR(75) null,
	descricao VARCHAR(75) null,
	fileEntryId LONG,
	fileUrl VARCHAR(75) null
);

create table FOO_Promocao (
	uuid_ VARCHAR(75) null,
	promocaoId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	nome VARCHAR(75) null,
	descricao VARCHAR(75) null,
	fileEntryId LONG,
	fileUrl VARCHAR(1024) null,
	premioId LONG,
	dataInicio DATE null,
	dataTermino DATE null,
	sorteado BOOLEAN
);
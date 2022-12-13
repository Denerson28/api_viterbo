create table users(

    id bigint not null auto_increment,
    login varchar(100) not null,
    email varchar(100) not null,
    nome varchar(100) not null,
    afiliacao varchar(100) not null,

    primary key(id)
);
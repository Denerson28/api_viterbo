create table events(

    id bigint not null auto_increment,
    nome varchar(100) not null,
    sigla varchar(100) not null,
    descricao varchar(100) not null,

    primary key(id)
);
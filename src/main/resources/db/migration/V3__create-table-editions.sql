create table editions(

    id bigint not null auto_increment,
    numero bigint not null,
    ano int not null,
    data_inicial datetime not null,
    data_final datetime not null,
    cidade varchar(100) not null,
    id_evento bigint not null,

    primary key(id)
);
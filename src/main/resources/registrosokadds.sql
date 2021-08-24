create database registrosoka;

use registrosoka;

create table destinatario(

	idDestinatario integer auto_increment primary key,
    nombre varchar(15) not null,
    apellido varchar(20) not null,
	email varchar(50) not null
);

create table destino(

	idDestino integer auto_increment primary key,
	calle varchar(50) not null,
    numero integer not null,
    localidad varchar(100) not null,
    idDestinatario int,
	foreign key(idDestinatario) references destinatario(idDestinatario)
);

create table envio(
	idEnvio integer auto_increment primary key,
    fechaDevolucion datetime,
    pesoTotal integer,
    idDestinatario integer,
	foreign key (idDestinatario) references destinatario(idDestinatario)
);

create table paquete(
	idPaquete integer auto_increment primary key,
    peso integer not null,
    tamanio integer,
    idEnvio integer,
    foreign key (idEnvio) references envio(idEnvio)
);
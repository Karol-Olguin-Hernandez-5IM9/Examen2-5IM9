create database  Examen2;
use Examen2;

create table Rol(
	id_Rol 	int(3) primary key,
    Rol		varchar(30)
);
insert into Rol values(1,'Admin');
create table Registro(
    Nom 	varchar(30),
    AP		varchar(30),
    AM		varchar(30),
    Usu		varchar(30),
    Pas		varchar(30),
    Tel		varchar(30),
    Esc		varchar(30),
    MF		varchar(30),
    DF		varchar(30),
    id_Rol	int(3),
    foreign key (id_Rol) REFERENCES Rol(id_Rol) 
);

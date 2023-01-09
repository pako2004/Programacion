create database fuap1;
create table erguevo (
dni varchar
cod_cliente int auto_increment;
nombre varchar(10) not null;
ape1 varchar(10) not null;
ape2 varchar(10));

create table pedido (
cod_pedido int primary_key;
fecha_pedido date not null;
importe number (5,2);
cod_cliente int;
cod_cliente foreign_keypersona(cod_cliente));

//Opcion 1 
insert into erguevo values (15,'mamaguevo','erdiablo',null,30);
//Opcion 2
insert into erguevo (nombre, ape1, edad) values ('mamaguevo','erdiablo',null,30);
//Falla por FK
insert into erguevo values (1453,¨12/03/22¨,58.50,25),
//  funciona, asigno el pedido al cliente 16
insert into erguevo values (1453,¨12/03/22¨,58.50,16);

create table articulo (
    cod_articulo int primary_key;
    descripcion varchar(25) not null;
    precio number (5,2);
)

create table art_fact(
    cod_ped int;
    cod_art int;
    cantidad int;
    primary key (cod_ped, cod_art);
    cod_ped foreign_key pedido(cod_pedido);
    cod_art foreign_key articulo(cod_articulo);
)

insert into articulo values (125, 'Memoria Ram', 50.00);
insert into articulo values (126, 'Placa Base Asus',99.00);
insert into articulo values (123, 'Procesador Intel i7',185.00);

//Funciona asigno el pedido al cliente de codigo 16

insert into pedido values (1435,´1435´,58.50,16);
//Asignamos articulos del pedido:

insert into art ped values (1435,125,5);
insert into art ped values (1435,126,2);
insert into art ped values (1435,127,3);
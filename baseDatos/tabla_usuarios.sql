/*Hemos aprendido cómo ver todos los registros de una tabla:

select nombre, clave from usuarios;
El comando "select" recupera los registros de una tabla. Detallando los nombres de los campos separados por comas, indicamos que seleccione todos los campos de la tabla que nombramos.

Existe una cláusula, "where" que es opcional, con ella podemos especificar condiciones para la consulta "select". Es decir, podemos recuperar algunos registros, sólo los que cumplan con ciertas condiciones indicadas con la cláusula "where". Por ejemplo, queremos ver el usuario cuyo nombre es "MarioPerez", para ello utilizamos "where" y luego de ella, la condición:

select nombre, clave from usuarios where nombre='MarioPerez';
Para las condiciones se utilizan operadores relacionales (tema que trataremos más adelante en detalle). El signo igual(=) es un operador relacional. Para la siguiente selección de registros especificamos una condición que solicita los usuarios cuya clave es igual a 'bocajunior':

select nombre, clave from usuarios where clave='bocajunior';
Si ningún registro cumple la condición establecida con el "where", no aparecerá ningún registro.

Servidor de MySQL instalado en forma local.
Ingresemos al programa "Workbench" y ejecutamos los siguientes comandos SQL:*/

drop table if exists usuarios;
drop table if exists hijos;
drop table if exists padres;
create table hijos (
dni_hijo varchar(10) primary key,
nombre varchar(30),
apellido varchar(30),
dni_padre varchar(10),
foreign key(dni_padre) references padre(dni_padre)
);

create table padres(
dni_hijo varchar(10) primary key,
nombre varchar(30),
apellido varchar(30));



create table usuarios (
  nombre varchar(30),
  clave varchar(10)
);

describe usuarios;

insert into usuarios (nombre, clave) values ('Leonardo','payaso');
insert into usuarios (nombre, clave) values ('MarioPerez','Marito');
insert into usuarios (nombre, clave) values ('Marcelo','bocajunior');
insert into usuarios (nombre, clave) values ('Gustavo','bocajunior');

select nombre, clave from usuarios;

select nombre, clave from usuarios where nombre='Leonardo';

select nombre, clave from usuarios where clave='bocajunior';

select nombre, clave from usuarios where clave='river';

insert into padres(dni_padre, nombre, apellido) values ('27453412-T','Juan Antonio','Lopez');
insert into padres (dni_padre, nombre, apellido) values ('89898989-T','Ana','Lopez');

-- Insertamos hijos a juan ANtonio

insert into hijos (dni_hijo, nombre, apellido, dni_padre) values ('12345678-T','Pako','Guadalupe','123459-T');
insert into hijos (dni_hijo, nombre, apellido, dni_padre) values ('12345678-a','Ñapo','FUAP','123459-U');
-- Insertamos Hijos a Ana
insert into hijos (dni_hijo, nombre, apellido, dni_padre) values ('12345678-A','Paka','FLorinda','123459-h');
insert into hijos (dni_hijo, nombre, apellido, dni_padre) values ('12345678-Ñ','Ñoco','Patatucci','123459-O');

-- Quiero ver toda la infromacion sobre todos padres:
select* from padres;
-- QUiero ver DNI y Nombre de todos los padres;
select dni_padre,nombre from padres;

-- QUiero conocer todos los datos de todos los hijos de juan antonio
	select* from hijos join padres where padres.dni='27453412-T';
    
    sele


/*Comprueba los resultados*/ 
drop database if exists ejercicio3;
create database ejercicio3;
use ejercicio3;

drop table if exists cajeros;
create table cajeros(
codigo int auto_increment primary key,
nomapels nvarchar(255)
);

insert into cajeros(nomapels) value ('cajero 1');
insert into cajeros(nomapels) value ('cajero 2');
insert into cajeros(nomapels) value ('cajero 3');

drop table if exists productos;
create table productos(
codigo int auto_increment primary key,
nombre nvarchar(100),
precio int
);

insert into productos(nombre,precio) value ('producto1',100);
insert into productos(nombre,precio) value ('producto2',200);
insert into productos(nombre,precio) value ('producto3',300);

drop table if exists maquinas_registradoras;
create table maquinas_registradoras(
codigo int auto_increment primary key,
piso int
);

insert into maquinas_registradoras(piso) value (1);
insert into maquinas_registradoras(piso) value (2);
insert into maquinas_registradoras(piso) value (3);

drop table if exists venta;
create table venta(
id int auto_increment primary key,
cajero int,
maquina int,
producto int,
foreign key (cajero) references cajeros(codigo) on delete cascade on update cascade,
foreign key (maquina) references maquinas_registradoras(codigo) on delete cascade on update cascade,
foreign key (producto) references productos(codigo) on delete cascade on update cascade
);

insert into venta(cajero,maquina,producto) value (1,1,1);
insert into venta(cajero,maquina,producto) value (2,2,2);
insert into venta(cajero,maquina,producto) value (3,3,3);
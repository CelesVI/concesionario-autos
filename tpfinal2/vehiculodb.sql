create database DBVehiculo;
use DBVehiculo; 
create table tVehiculo(
    id int UNSIGNED NOT NULL AUTO_INCREMENT,
    marca VARCHAR(60) NOT NULL,
    modelo VARCHAR(60) NOT NULL,
    año int NULL,
    motor decimal UNSIGNED  NULL,
    kilometraje int UNSIGNED NULL,
    color VARCHAR(60),
    precio decimal UNSIGNED NULL,
    vendido boolean not null,
    

    primary key (id),
);
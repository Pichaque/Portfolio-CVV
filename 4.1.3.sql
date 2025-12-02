create database EmpresaTransporte;
# drop database EmpresaTransporte;
use EmpresaTRansporte;
create table TCamionero(
	cDNIID char(9) primary key not null,
    cNombre varchar(20) not null,
    cPoblacion varchar (20) not null,
    cTelefono char (12) not null,
    cDireccion varchar(50) not null,
    nSalario integer
);
# drop table TCamionero;
create table TCamion(
	cMatriculaID char(7) primary key not null,
    cPotencia varchar (25),
    cModelo varchar (35),
    cTipo varchar (20)
);
 # drop table TCamion;
create table TProvincia(
	cCodigoProvinciaID varchar(10) primary key not null,
    cNombre varchar (20) not null
);
# drop table TProvincia;
create table TPaquete(
	cCodigoPaqueteID varchar (20) primary key not null,
    cDescripcion varchar (50) not null,
    cDestinatario varchar (25) not null,
    cDireccion varchar (30) not null,
    cCodigoProvinciaID varchar(10) not null,
    foreign key (cCodigoProvinciaID) references TProvincia(cCodigoProvinciaID)
);
# drop table TPaquete;
create table Tcamioneropaquete(
	cDNIID char(9) not null,
    cCodigoPaqueteID varchar(20) not null,
    foreign key (cDNIID) references TCamionero(cDNIID),
    foreign key (cCodigoPaqueteID) references TPaquete(cCodigoPaqueteID)
);
 # drop table Tcamioneropaquete;
 create table TConduce(
	cDNIID char(9) not null,
    cMatriculaID char(7) not null,
    dFecha date,
    primary key (CDNIID,CMatriculaID),
    foreign key (cDNIID) references TCamionero(cDNIID),
    foreign key (cMatriculaID) references TCamion(cMatriculaID)
 );
 # drop table TConduce
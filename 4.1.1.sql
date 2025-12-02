create database Metro;
# drop database Metro;
use Metro;
create table TLinea(
	cNombreLinea varchar(35),
	nLineaID integer primary key
);
# drop table TLinea;
create table TEstacion(
	nEstacionID integer primary key,
    cNombreEstacion varchar (40)
);
# drop table TEstacion;
create table TCochera(
	nCocheraID integer primary key,
    cLocalizacion varchar(40),
    nEstacionID integer,
    foreign key (nEstacionID) references TEstacion(nEstacionID)
);
# drop table TCochera;
create table Ttren(
      nTrenID integer primary key,
      cNombreTren varchar(20),
      nLineaID integer,
      foreign key (nLineaID) references TLinea(nLineaID),
      nCocheraID integer
);
# drop table Ttren;
create table TLineaEstacion(
	nLineaID integer,
    nEstacionID integer,
    nNumeroOrden integer,
    primary key (nLineaID,nEstacionID),
    foreign key (nLineaID) references TLinea(nLineaID),
    foreign key (nEstacionID) references TEstacion(nEstacionID)
);
# drop table TLineaEstacion;
# show tables;
# show columns from testacion;
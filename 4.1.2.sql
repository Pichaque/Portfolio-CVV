create database VentaProducto;
# drop database ventaproducto;
use VentaProducto;
create table TCliente(
	cDNIID char(9) primary key not null,
    cNombre varchar(30) not null,
    cApellido varchar(50),
    nFechaNacimiento integer not null,
    cTelefono char (12) not null
);
# drop table TCliente;
create table TProovedor(
	cNIFID char(9) primary key not null,
    cNombre varchar(30) not null,
    cDireccion varchar (55) not null
);
# drop table TProovedor;
create table TProducto(
	nCodigoID integer primary key not null,
    cNombre varchar (30) not null,
    nPrecio integer not null,
    cNIFID char(9) not null,
    foreign key (cNIFID) references TProovedor(cNIFID)
);
# drop table TProducto;
create table TClienteProducto(
	cDNIID char(9) not null,
    nCodigoID integer not null,
    primary key (cDNIID,nCodigoID),
    foreign key (cDNIID) references TCliente(cDNIID),
    foreign key (nCodigoID) references TProducto(nCodigoID)
);
# drop table TClienteProducto;
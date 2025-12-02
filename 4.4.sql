CREATE DATABASE VENTAS;
USE VENTAS;
# drop database ventas;
CREATE TABLE TCliente(
cDNIID varchar(9) UNIQUE NOT NULL,
cNombre varchar(20) NOT NULL,
cApellido varchar(15) NOT NULL,
dFechaNacimiento date,
cTelefono varchar(9),
PRIMARY KEY (cDNIID)
);
CREATE TABLE TProveedor(
cNIFID varchar(9) UNIQUE NOT NULL,
cNombre varchar(20) NOT NULL,
cDireccion varchar(20)
);
CREATE TABLE TProducto(
nCodigoID INTEGER PRIMARY KEY,
cNombreProducto VARCHAR(20),
nPrecioProducto DOUBLE,
cNIFIDProveedor varchar(9) NOT NULL,
FOREIGN KEY (cNIFIDProveedor) REFERENCES TProveedor(cNIFID)
);
CREATE TABLE TClienteProducto(
nCodFactura integer,
cDNIIDCliente varchar(9),
nCodigoIDProducto INTEGER,
PRIMARY KEY(cDNIIDCliente,nCodigoIDProducto,nCodFactura ),
FOREIGN KEY (cDNIIDCliente) REFERENCES TCliente(cDNIID),
FOREIGN KEY (nCodigoIDProducto) REFERENCES TProducto(nCodigoID)
);
drop table TClienteProducto;
alter table TCliente 
drop primary key,
add nCodCliente integer auto_increment primary key;
describe TCliente;
alter table TProducto
modify nCodigoID integer auto_increment,
add nstock integer not null;
describe TProducto;
CREATE TABLE TClienteProducto(
nCodFactura integer,
nCodCliente integer,
nCodigoIDProducto INTEGER,
PRIMARY KEY(nCodCliente,nCodigoIDProducto,nCodFactura),
FOREIGN KEY (nCodCliente) REFERENCES TCliente(nCodCliente),
FOREIGN KEY (nCodigoIDProducto) REFERENCES TProducto(nCodigoID)
);
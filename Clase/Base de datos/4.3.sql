CREATE DATABASE VENTAS;
# drop database ventas;
USE VENTAS;
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
#drop table TProveedor;
CREATE TABLE TProducto(
nCodigoID INTEGER PRIMARY KEY,
cNombreProducto VARCHAR(20),
nPrecioProducto DOUBLE,
cNIFIDProveedor varchar(9) NOT NULL,
FOREIGN KEY (cNIFIDProveedor) REFERENCES TProveedor(cNIFID)
);
#drop table TProducto
CREATE TABLE TClienteProducto(
cDNIIDCliente varchar(9),
nCodigoIDProducto INTEGER,
PRIMARY KEY(cDNIIDCliente,nCodigoIDProducto ),
FOREIGN KEY (cDNIIDCliente) REFERENCES TCliente(cDNIID),
FOREIGN KEY (nCodigoIDProducto) REFERENCES TProducto(nCodigoID)
);
#drop table TClienteProducto
/*CREATE TABLE TClienteProducto(
CodFactura INT AUTO_INCREMENT PRIMARY KEY,
FechaFac DATE,
cDNIIDCliente VARCHAR(9),
nCodigoIDProducto INTEGER,
nCantidad DOUBLE,
FOREIGN KEY (cDNIIDCliente) REFERENCES TCliente(cDNIID),
FOREIGN KEY (nCodigoIDProducto) REFERENCES TProducto(nCodigoID)
);*/
/*alter table tcliente
Drop primary key,
add nCodCliente Integer auto_increment primary key;
Describe tcliente;
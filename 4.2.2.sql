create database Biblioteca;
# drop database Biblioteca;
use Biblioteca;
create table TTema(
	nCodTema integer primary key not null,
    cNombreTema varchar (25) not null
);
# drop table TTema;
create table TPais(
	nCodPais integer primary key not null,
    cNombre varchar (60) not null
);
# drop table TPais;
create table TEditorial(
	nCodigoEditorial integer primary key not null,
    cNombre varchar(20) not null,
    cDireccion varchar(45) not null,
    nCodPais integer not null,
    foreign key (nCodPais) references TPais (nCodPais)
);
# drop table TEditorial;
create table TAutor(
	nCodAutor integer primary key not null,
    cNombre varchar(20) not null,
    cApellidos varchar(35) not null
);
# drop table TAutor;
create table TLibro(
	nCodLibro integer primary key not null,
    cTitulo varchar (30) not null,
    dAnyoPublicacion date not null,
    nCodigoEditorial integer not null,
    foreign key(nCodigoEditorial) references TEditorial(nCodigoEditorial)
);
# drop table TLibro;
create table TEjemplar(
	cSignatura varchar(30) primary key not null,
    nCodLibro integer not null,
    foreign key(nCodLibro) references TLibro(nCodLibro)
);

# drop table TEjemplar;
create table TSocio(
	cNIF char(9) primary key not null,
    cNombre varchar(20) not null,
    cApellidos varchar(30) not null,
    cDireccion varchar(45) not null,
    cTelefono char(12),
    dFechaNacimiento date not null,
    dFechaAlta date not null
);
# drop table TSocio;
create table TAutorPais(
	nCodigoAutor integer not null,
    nCodigoPais integer not null,
    primary key(nCodigoAutor,nCodigoPais),
    foreign key(nCodigoAutor) references TAutor(nCodAutor),
    foreign key(nCodigoPais) references TPais(nCodPais)
);
# dropn table TAutorPais
create table TLibroAutor(
	nCodigoLibro integer not null,
    nCodigoAutor integer not null,
    primary key (nCodigoLibro,nCodigoAutor),
    foreign key(nCodigoAutor) references TAutor(nCodAutor),
    foreign key(nCodigoLibro) references TLibro(nCodLibro)
);
#drop table TLibroAutor
create table TLibroTema(
	nCodigoLibro integer not null,
    nCodigoTemas integer not null,
    primary key (nCodigoLibro,nCodigoTemas),
    foreign key(nCodigoLibro) references TLibro(nCodLibro),
    foreign key(nCodigoTemas) references TTema(nCodTema)
);
#drop table TLibroTema;
create table TEjemplarSocio(
	cSignatura varchar(30) not null,
    cNIF char(9) not null,
    primary key(cSignatura,cNIF),
    foreign key (cSignatura) references TEjemplar(cSignatura),
    foreign key(cNIF) references TSocio(cNIF)
);
#drop table TEjemplarSocio;
create database clase;
# drop database clase;
use clase;
create table TAlumno(
	nExpedienteID varchar (15) not null,
    dFechanacimiento date not null,
    cNombre varchar (20) not null,
    cApellidos varchar (35) not null,
    lEsdelegado boolean not null,
    nExpedientedelegado varchar(15) not null,
    primary key (nExpedienteID,nExpedientedelegado)
);
#drop table TAlumno;
create table TProfesor(
	cDNI char(9) primary key not null,
    cNombre varchar(20) not null,
    cDireccion varchar (40) not null,
    cTelefono char(12)
);
# drop table TProfesor;
create table TModulo(
	nCodigoID varchar(15) primary key not null,
    cNombre varchar (20) not null,
    cDNI char(9) not null,
    foreign key (cDNI) references TProfesor(cDNI)
);
# drop table TModulo;
create table TCursa(
	nExpedienteID varchar(15) not null,
    nCodigoID varchar(15) not null,
    primary key (nExpedienteID,nCodigoID),
    foreign key (nExpedienteID) references TAlumno (nExpedienteID),
    foreign key (nCodigoID) references TModulo (nCodigoID)
);
#drop table TCursa
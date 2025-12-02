use ventas;
insert into TProveedor
values("A12345678","TecnoPLus","C/Mayor12"),
("B87654321","OfiMarket","Av. Sol 5"),
("C11223344","HogarCenter","C/Luna 33"),
("D55667788","ElectroSur","Plaza Norte 8");
select * from  TProveedor;
insert into TCliente
values("12345678A","Carlos","Garcia","1985-04-12","600112233"),
("23456789B","María","López","1990-09-23","611223344"),
("34567890C","Lucía","Pérez","1982-01-05","622334455"),
("45678901D","Pedro","Santos","1978-12-30","633445566"),
("56789012E","Ana","Ruiz","1995-07-14","644556677"),
("67890123F","Javier","Martín","1988-03-09","655667788");
select * from  TCliente;
INSERT INTO TProducto VALUES
(1, 'Portátil 14"', 699.99, 'A12345678'),
(2, 'Ratón inalámbrico', 19.95, 'A12345678'),
(3, 'Teclado mecánico', 49.90, 'A12345678'),
(4, 'Silla de oficina', 89.50, 'B87654321'),
(5, 'Escritorio madera', 129, 'B87654321'),
(6, 'Lámpara de pie', 35.75, 'C11223344'),
(7, 'Aspiradora', 159.90, 'C11223344'),
(8, 'Televisor 55"', 749, 'D55667788');
INSERT INTO TClienteProducto VALUES
('12345678A', 1),
('12345678A', 2),
('12345678A', 4),
('23456789B', 3),
('23456789B', 4),
('23456789B', 6),
('34567890C', 2),
('34567890C', 5),
('45678901D', 7),
('45678901D', 8),
('56789012E', 1),
('56789012E', 3),
('56789012E', 6),
('67890123F', 5),
('67890123F', 8);
select * from TProducto;
select*from TClienteProducto;
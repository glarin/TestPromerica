CREATE USER mmartinez WITH PASSWORD 'dev2021';
CREATE DATABASE testPromerica WITH OWNER = mmartinez ENCODING = 'UTF8' CONNECTION LIMIT = -1;
-- importante
GRANT CONNECT ON DATABASE testpromerica to mmartinez;
GRANT ALL PRIVILEGES ON SCHEMA public to mmartinez;

-- SEQUENCES
CREATE SEQUENCE cliente_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

CREATE SEQUENCE orden_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;
	
CREATE SEQUENCE producto_seq
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

-- TABLES
-- cliente definition
-- DROP TABLE cliente;
CREATE TABLE cliente (
	id INT8 NOT NULL DEFAULT NEXTVAL('cliente_seq'::REGCLASS),
	nombres VARCHAR(100) NOT NULL,
	apellidos VARCHAR(100) NOT NULL,
	status BOOL NOT NULL DEFAULT TRUE,
	created TIMESTAMP NOT NULL DEFAULT NOW(),
	modified TIMESTAMP NULL,
	CONSTRAINT pk_cliente_id PRIMARY KEY (id)
);

-- producto definition
-- DROP TABLE producto;
CREATE TABLE producto (
	id INT8 NOT NULL DEFAULT NEXTVAL('producto_seq'::REGCLASS),
	nombre VARCHAR(100) NOT NULL,
	descripcion VARCHAR(200) NOT NULL,
	precio DECIMAL(18,2) NOT NULL,
	status BOOL NOT NULL DEFAULT TRUE,
	created TIMESTAMP NOT NULL DEFAULT NOW(),
	modified TIMESTAMP NULL,
	CONSTRAINT pk_producto_id PRIMARY KEY (id)
);

-- orden definition
-- DROP TABLE orden;
CREATE TABLE orden (
	id INT8 NOT NULL DEFAULT NEXTVAL('orden_seq'::REGCLASS),
	cliente_id INT8 NOT NULL,
	producto_id INT8 NOT NULL,
	cantidad INT8 NOT NULL,
	status BOOL NOT NULL DEFAULT TRUE,
	created TIMESTAMP NOT NULL DEFAULT NOW(),
	modified TIMESTAMP NULL,
	CONSTRAINT pk_orden_id PRIMARY KEY (id),
	CONSTRAINT fk_cliente_id FOREIGN KEY (cliente_id) REFERENCES cliente(id) ON UPDATE RESTRICT ON DELETE RESTRICT,
	CONSTRAINT fk_producto_id FOREIGN KEY (producto_id) REFERENCES producto(id) ON UPDATE RESTRICT ON DELETE RESTRICT
);

-- INSERTS
-- TABLE: cliente
INSERT INTO public.cliente
(nombres, apellidos, status, created)
VALUES('Juan', 'Pérez', true, now());
INSERT INTO public.cliente
(nombres, apellidos, status, created)
VALUES('Kevin', 'Novoa', true, now());
INSERT INTO public.cliente
(nombres, apellidos, status, created)
VALUES('Antonio', 'Ascencio', true, now());
INSERT INTO public.cliente
(nombres, apellidos, status, created)
VALUES('Francisco', 'Montoya', true, now());
INSERT INTO public.cliente
(nombres, apellidos, status, created)
VALUES('Saúl', 'Seoane', true, now());
INSERT INTO public.cliente
(nombres, apellidos, status, created)
VALUES('Eloisa', 'Gutiérrez', true, now());
INSERT INTO public.cliente
(nombres, apellidos, status, created)
VALUES('Paola', 'Sánchez', true, now());
INSERT INTO public.cliente
(nombres, apellidos, status, created)
VALUES('Erick', 'Aguilera', true, now());

-- TABLE: producto
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Huevos', 'Tamaño: Jumbo | Marca: Catalana | Presentación: Cartón de 30 unidades', 3.90, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Leche', 'Presentación: 750 ml', 1.35, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Jamón', 'Pavo - Cerdo', 3.80, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Cereal', 'Hecho de maíz', 3.20, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Manzanas', 'Unidad: Libra', 2.25, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Peras', 'Unidad: Libra', 2.75, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Kiwis', 'Unidad: Libra', 4.25, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Queso fresco', 'Unidad: Marqueta 5 cm x 10 cm', 3.50, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Queso capita', 'Unidad: Libra', 3.750, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Queso cheddar', 'Unidad: Libra', 4.50, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Queso mozzarella', 'Unidad: Libra', 4.75, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Shampoo', 'Presentación: 750 ml', 6.25, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Detergente', 'Presentación: Kilogramo', 2.75, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Jabón para ropa', 'Presentación: Bola de 250 g', 0.75, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Jabón líquido para platos', 'Presentación: 250 ml', 1.20, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Jabón de tocador', 'Presentación: Barra de 175 g', 0.35, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Jabón líquido para manos', 'Presentación: 500 ml', 2.0, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Tomate', 'Unidad: Libra', 1.50, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Cebolla', 'Unidad: Libra', 1.20, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Aguacate', 'Unidad: Libra', 1.80, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Fresas', 'Unidad: Libra', 1.70, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Chile verde', 'Unidad: Libra', 1.20, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Costilla de res', 'Unidad: Libra', 2.30, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Pecho de res', 'Unidad: Libra', 4.80, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Brazuelo de res', 'Unidad: Libra', 5.25, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Lomo de aguja de res', 'Unidad: Libra', 6.50, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Lomo rollizo de res', 'Unidad: Libra', 6.25, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Solomo de res', 'Unidad: Libra', 5.80, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Entraña de res', 'Unidad: Libra', 11.50, true, now());
INSERT INTO public.producto
(nombre, descripcion, precio, status, created)
VALUES('Matambre de res', 'Unidad: Libra', 9.60, true, now());

-- TABLE: orden
INSERT INTO public.orden
(cliente_id, producto_id, cantidad, status, created)
VALUES((select id from cliente c2 order by random() limit 1), 
	   (select id from producto p2 order by random() limit 1), 
	   (SELECT floor(random() * 10 + 1)::int), true, now());



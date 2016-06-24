
-----------------------------------------------------------------------------
-- capitulos
-----------------------------------------------------------------------------
DROP TABLE capitulos CASCADE;


CREATE TABLE capitulos
(
                                    idcapitulo serial,
                                    nombre varchar (150) default '',
    PRIMARY KEY (idcapitulo)
);


-----------------------------------------------------------------------------
-- categorias
-----------------------------------------------------------------------------
DROP TABLE categorias CASCADE;


CREATE TABLE categorias
(
                                    idcategoria serial,
                                    descripcion varchar (510) default '',
    PRIMARY KEY (idcategoria)
);


-----------------------------------------------------------------------------
-- clientes
-----------------------------------------------------------------------------
DROP TABLE clientes CASCADE;


CREATE TABLE clientes
(
                                    idcliente serial,
                                    cif varchar (10) default '',
                                    fechaalta varchar (8) default '',
                                    fechabaja varchar (8) default '',
                                    nombre varchar (50) default '',
                                    razonsocial varchar (50) default '',
                                    referencia varchar (50) default '',
                                    contacto varchar (50) default '',
                                      -- REFERENCES localidades (idlocalidad)
    idlocalidad integer default 0,
                                    direccion varchar (50) default '',
                                    cp varchar (5) default '',
                                    telefono varchar (9) default '',
                                    fax varchar (9) default '',
                                    movil varchar (9) default '',
                                    email varchar (50) default '',
                                    www varchar (50) default '',
                                    observaciones varchar (500) default '',
    PRIMARY KEY (idcliente)
);


-----------------------------------------------------------------------------
-- incidencias
-----------------------------------------------------------------------------
DROP TABLE incidencias CASCADE;


CREATE TABLE incidencias
(
                                    idincidencia serial,
                                      -- REFERENCES uejecuciones (iduejecucion)
    iduejecucion integer default 0,
                                      -- REFERENCES operarios (idoperario)
    idoperario integer default 0,
                                      -- REFERENCES maquinarias (idmaquinaria)
    idmaquinaria integer default 0,
                                      -- REFERENCES tipoincidencias (idtipoincidencia)
    idtipoincidencia integer default 0,
                                    fecha varchar (8) default '',
                                    referencia varchar (50) default '',
                                    descripcion varchar (500) default '',
                                    observaciones varchar (500) default '',
                                    horas float default 0,
                                    importe float default 0,
                                    kilometros float default 0,
                                    tonelaje float default 0,
    PRIMARY KEY (idincidencia)
);


-----------------------------------------------------------------------------
-- localidades
-----------------------------------------------------------------------------
DROP TABLE localidades CASCADE;


CREATE TABLE localidades
(
                                    idlocalidad serial,
                                      -- REFERENCES provincias (idprovincia)
    idprovincia integer default 0,
                                    nombre varchar (50) default '',
    PRIMARY KEY (idlocalidad)
);


-----------------------------------------------------------------------------
-- maquinarias
-----------------------------------------------------------------------------
DROP TABLE maquinarias CASCADE;


CREATE TABLE maquinarias
(
                                    idmaquinaria serial,
                                    nombre varchar (50) default '',
                                    referencia varchar (50) default '',
                                    bastidor varchar (50) default '',
                                    matricula varchar (10) default '',
                                    fechaalta varchar (8) default '',
                                    fechabaja varchar (8) default '',
                                    responsable varchar (50) default '',
                                    coste float default 0,
                                    modelo varchar (50) default '',
                                    marca varchar (50) default '',
                                    tipo varchar (50) default '',
                                    alquilado integer default 0,
                                    observaciones varchar (500) default '',
    PRIMARY KEY (idmaquinaria)
);


-----------------------------------------------------------------------------
-- obras
-----------------------------------------------------------------------------
DROP TABLE obras CASCADE;


CREATE TABLE obras
(
                                    idobra serial,
                                      -- REFERENCES clientes (idcliente)
    idcliente integer default 0,
                                    numerocontrato varchar (10) default '',
                                    referencia varchar (50) default '',
                                    nombre varchar (50) default '',
                                      -- REFERENCES localidades (idlocalidad)
    idlocalidad integer default 0,
                                    calle varchar (50) default '',
                                    cp varchar (50) default '',
                                    fechaalta varchar (8) default '',
                                    fechacomienzo varchar (8) default '',
                                    fechafin varchar (8) default '',
                                    jornadas integer default 0,
                                    observaciones varchar (500) default '',
    PRIMARY KEY (idobra)
);


-----------------------------------------------------------------------------
-- operarios
-----------------------------------------------------------------------------
DROP TABLE operarios CASCADE;


CREATE TABLE operarios
(
                                    idoperario serial,
                                      -- REFERENCES categorias (idcategoria)
    idcategoria integer default 0,
                                    referencia varchar (50) default '',
                                    nif varchar (10) default '',
                                    nombre varchar (50) default '',
                                    apellidouno varchar (50) default '',
                                    apellidodos varchar (50) default '',
                                    fechaalta varchar (8) default '',
                                    fechabaja varchar (8) default '',
                                    numeross varchar (20) default '',
                                    direccion varchar (50) default '',
                                    cp varchar (5) default '',
                                      -- REFERENCES localidades (idlocalidad)
    idlocalidad integer default 0,
                                    telefono varchar (9) default '',
                                    movil varchar (9) default '',
                                    email varchar (25) default '',
                                    coste float default 0,
                                    externo integer default 0,
                                    observaciones varchar (500) default '',
    PRIMARY KEY (idoperario)
);


-----------------------------------------------------------------------------
-- partes
-----------------------------------------------------------------------------
DROP TABLE partes CASCADE;


CREATE TABLE partes
(
                                    idparte serial,
                                      -- REFERENCES uejecuciones (iduejecucion)
    iduejecucion integer default 0,
                                      -- REFERENCES operarios (idoperario)
    idoperario integer default 0,
                                      -- REFERENCES maquinarias (idmaquinaria)
    idmaquinaria integer default 0,
                                    fecha varchar (8) default '',
                                    referencia varchar (50) default '',
                                    descripcion varchar (500) default '',
                                    observaciones varchar (500) default '',
                                    horas float default 0,
                                    importe float default 0,
    PRIMARY KEY (idparte)
);


-----------------------------------------------------------------------------
-- provincias
-----------------------------------------------------------------------------
DROP TABLE provincias CASCADE;


CREATE TABLE provincias
(
                                    idprovincia serial,
                                    nombre varchar (50) default '',
    PRIMARY KEY (idprovincia)
);


-----------------------------------------------------------------------------
-- subcapitulos
-----------------------------------------------------------------------------
DROP TABLE subcapitulos CASCADE;


CREATE TABLE subcapitulos
(
                                    idsubcapitulo serial,
                                      -- REFERENCES capitulos (idcapitulo)
    idcapitulo integer default 0,
                                    nombre varchar (150) default '',
                                    referencia varchar (50) default '',
    PRIMARY KEY (idsubcapitulo)
);


-----------------------------------------------------------------------------
-- tipoincidencias
-----------------------------------------------------------------------------
DROP TABLE tipoincidencias CASCADE;


CREATE TABLE tipoincidencias
(
                                    idtipoincidencia serial,
                                    referencia varchar (50) default '',
                                    descripcion varchar (150) default '',
    PRIMARY KEY (idtipoincidencia)
);


-----------------------------------------------------------------------------
-- uejecuciones
-----------------------------------------------------------------------------
DROP TABLE uejecuciones CASCADE;


CREATE TABLE uejecuciones
(
                                    iduejecucion serial,
                                      -- REFERENCES obras (idobra)
    idobra integer default 0,
                                      -- REFERENCES subcapitulos (idsubcapitulo)
    idsubcapitulo integer default 0,
                                    fechacomienzo varchar (8) default '',
                                    fechafin varchar (8) default '',
                                    horasestimadas float default 0,
                                    referencia varchar (50) default '',
                                    descripcion varchar (500) default '',
                                    observaciones varchar (500) default '',
                                    importe float default 0,
    PRIMARY KEY (iduejecucion)
);


----------------------------------------------------------------------
-- uejecuciones                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- capitulos                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- categorias                                                      
----------------------------------------------------------------------

ALTER TABLE clientes
    ADD CONSTRAINT clientes_FK_1 FOREIGN KEY (idlocalidad)
    REFERENCES localidades (idlocalidad)
;

----------------------------------------------------------------------
-- clientes                                                      
----------------------------------------------------------------------

ALTER TABLE incidencias
    ADD CONSTRAINT incidencias_FK_1 FOREIGN KEY (idmaquinaria)
    REFERENCES maquinarias (idmaquinaria)
;
ALTER TABLE incidencias
    ADD CONSTRAINT incidencias_FK_2 FOREIGN KEY (idoperario)
    REFERENCES operarios (idoperario)
;
ALTER TABLE incidencias
    ADD CONSTRAINT incidencias_FK_3 FOREIGN KEY (idtipoincidencia)
    REFERENCES tipoincidencias (idtipoincidencia)
;
ALTER TABLE incidencias
    ADD CONSTRAINT incidencias_FK_4 FOREIGN KEY (iduejecucion)
    REFERENCES uejecuciones (iduejecucion)
;

----------------------------------------------------------------------
-- incidencias                                                      
----------------------------------------------------------------------

ALTER TABLE localidades
    ADD CONSTRAINT localidades_FK_1 FOREIGN KEY (idprovincia)
    REFERENCES provincias (idprovincia)
;

----------------------------------------------------------------------
-- localidades                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- maquinarias                                                      
----------------------------------------------------------------------

ALTER TABLE obras
    ADD CONSTRAINT obras_FK_1 FOREIGN KEY (idcliente)
    REFERENCES clientes (idcliente)
;
ALTER TABLE obras
    ADD CONSTRAINT obras_FK_2 FOREIGN KEY (idlocalidad)
    REFERENCES localidades (idlocalidad)
;

----------------------------------------------------------------------
-- obras                                                      
----------------------------------------------------------------------

ALTER TABLE operarios
    ADD CONSTRAINT operarios_FK_1 FOREIGN KEY (idcategoria)
    REFERENCES categorias (idcategoria)
;
ALTER TABLE operarios
    ADD CONSTRAINT operarios_FK_2 FOREIGN KEY (idlocalidad)
    REFERENCES localidades (idlocalidad)
;

----------------------------------------------------------------------
-- operarios                                                      
----------------------------------------------------------------------

ALTER TABLE partes
    ADD CONSTRAINT partes_FK_1 FOREIGN KEY (idmaquinaria)
    REFERENCES maquinarias (idmaquinaria)
;
ALTER TABLE partes
    ADD CONSTRAINT partes_FK_2 FOREIGN KEY (idoperario)
    REFERENCES operarios (idoperario)
;
ALTER TABLE partes
    ADD CONSTRAINT partes_FK_3 FOREIGN KEY (iduejecucion)
    REFERENCES uejecuciones (iduejecucion)
;

----------------------------------------------------------------------
-- partes                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- provincias                                                      
----------------------------------------------------------------------

ALTER TABLE subcapitulos
    ADD CONSTRAINT subcapitulos_FK_1 FOREIGN KEY (idcapitulo)
    REFERENCES capitulos (idcapitulo)
;

----------------------------------------------------------------------
-- subcapitulos                                                      
----------------------------------------------------------------------


----------------------------------------------------------------------
-- tipoincidencias                                                      
----------------------------------------------------------------------

ALTER TABLE uejecuciones
    ADD CONSTRAINT uejecuciones_FK_1 FOREIGN KEY (idobra)
    REFERENCES obras (idobra)
;
ALTER TABLE uejecuciones
    ADD CONSTRAINT uejecuciones_FK_2 FOREIGN KEY (idsubcapitulo)
    REFERENCES subcapitulos (idsubcapitulo)
;

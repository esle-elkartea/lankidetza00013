--Sección de reseteo de las secuencias

select resetsecuencia('provincias', 'idprovincia', 'provincias_idprovincia_seq');
select resetsecuencia('localidades', 'idlocalidad', 'localidades_idlocalidad_seq');
select resetsecuencia('categorias', 'idcategoria', 'categorias_idcategoria_seq');
select resetsecuencia('operarios', 'idoperario', 'operarios_idoperario_seq');
select resetsecuencia('clientes', 'idcliente', 'clientes_idcliente_seq');
select resetsecuencia('maquinarias', 'idmaquinaria', 'maquinarias_idmaquinaria_seq');
select resetsecuencia('capitulos', 'idcapitulo', 'capitulos_idcapitulo_seq');
select resetsecuencia('subcapitulos', 'idsubcapitulo', 'subcapitulos_idsubcapitulo_seq');
select resetsecuencia('obras', 'idobra', 'obras_idobra_seq');
select resetsecuencia('uejecuciones', 'iduejecucion', 'uejecuciones_iduejecucion_seq');
select resetsecuencia('partes', 'idparte', 'partes_idparte_seq');
select resetsecuencia('incidencias', 'idincidencia', 'incidencias_idincidencia_seq');
select resetsecuencia('tipoincidencias', 'idtipoincidencia', 'tipoincidencias_idtipoincidencia_seq');

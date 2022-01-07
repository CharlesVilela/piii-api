create table usuario(
	id bigint,
	nome varchar,
	
	constraint usuariopk primary key(id)

);

CREATE TABLE SENHA(
	id bigint,
	senha varchar,
	apelido varchar,
	id_usuario bigint,
	
	CONSTRAINT SENHAPK PRIMARY KEY (id),
	constraint id_usuariofk foreign key (id_usuario) references usuario(id)
);


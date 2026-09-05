/* create table tb_usuarios (
  	id SERIAL PRIMARY KEY,
  	email VARCHAR(200) NOT NULL UNIQUE, 
  	senha VARCHAR(255) NOT NULL
  );

  INSERT INTO tb_usuarios (email, senha) values ('admin1@teste.com', '1234')


 CREATE table tb_voluntarios(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
 	email VARCHAR(100) NOT NULL UNIQUE,
	telefone VARCHAR(100) NOT NULL,
	cidade VARCHAR(100) NOT NULL,
 	estado VARCHAR(2),
 	endereco VARCHAR(20)
 );


CREATE table tb_organizacao(
	id SERIAL PRIMARY KEY,
	nome VARCHAR(100) NOT NULL,
	cnpj VARCHAR(100),
	email VARCHAR(100) NOT NULL UNIQUE,
	telefone VARCHAR(100) NOT NULL, 
	cidade VARCHAR(100) NOT NULL,
	estado VARCHAR(2),
	endereco VARCHAR(100)
);


CREATE table tb_vagas(
	id SERIAL PRIMARY KEY,
	titulo VARCHAR(100) NOT NULL,
	descricao VARCHAR(200) NOT NULL,
	cargaHoras INT,
	numeroVagas INT NOT NULL,
	dataVaga DATE NOT NULL,
	status VARCHAR(10),
	id_organizacao INTEGER NOT NULL,

		CONSTRAINT fk_vaga_organizacao
		FOREIGN KEY (id_organizacao)
		REFERENCES tb_organizacao(id)
);
*/

--ALTER TABLE tb_voluntarios
--ALTER COLUMN endereco TYPE VARCHAR(150);

--SELECT * FROM tb_vagas
--SELECT * FROM tb_organizacao

--SELECT version();
 
 
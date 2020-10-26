-- Atividade 3

/*Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
informações dos alunos deste registro dessa escola.*/

CREATE DATABASE db_escola;

USE db_escola;

/*Crie uma tabela alunos/a e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos alunos/a para se trabalhar com o serviço dessa escola.*/


CREATE TABLE tb_alunos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    genero VARCHAR(20) NOT NULL,
    serie VARCHAR(20) NOT NULL,
    nota DOUBLE NOT NULL,
    PRIMARY KEY(id)
);

-- Popule esta tabela com até 8 dados;

INSERT INTO tb_alunos (nome, idade, genero, serie, nota)
VALUES ("João", 9, "Masculino", "3° série", 8.0);
INSERT INTO tb_alunos (nome, idade, genero, serie, nota)
VALUES ("Maria", 10, "Feminino", "4° série", 7.5);
INSERT INTO tb_alunos (nome, idade, genero, serie, nota)
VALUES ("Sofia", 8, "Não binário", "2° série", 9.0);
INSERT INTO tb_alunos (nome, idade, genero, serie, nota)
VALUES ("Eduardo", 7, "Masculino", "1° série", 6.25);
INSERT INTO tb_alunos (nome, idade, genero, serie, nota)
VALUES ("Rebeca", 10, "Feminino", "3° série", 5.5);
INSERT INTO tb_alunos (nome, idade, genero, serie, nota)
VALUES ("Pedro", 8, "Masculino", "1° série", 4.0);
INSERT INTO tb_alunos (nome, idade, genero, serie, nota)
VALUES ("Felipe", 9, "Masculino", "3° série", 8.5);
INSERT INTO tb_alunos (nome, idade, genero, serie, nota)
VALUES ("Aline", 10, "Feminino", "4° série", 10.0);

-- Faça um select que retorne o/as alunos/a com a nota maior do que 7.

SELECT nome, serie, nota FROM tb_alunos WHERE nota > 7;

-- Faça um select que retorne o/as alunos/a com a nota menor do que 7.

SELECT nome, serie, nota FROM tb_alunos WHERE nota < 7;

-- Ao término atualize um dado desta tabela através de uma query de atualização.

UPDATE tb_alunos SET serie = "2° série", nota = 6.5
WHERE id = 6;

SELECT * FROM tb_alunos;
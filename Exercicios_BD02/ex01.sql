-- Atividade 1

/*Crie um banco de dados para um serviço de RH de uma empresa, o nome do banco deverá
ter o seguinte nome db_RH2, onde o sistema trabalhará com as informações dos funcionários desta empresa.
O sistema trabalhará com 2 tabelas tb_funcionário e tb_cargo.*/

CREATE DATABASE db_RH2;

USE db_RH2;

/*Crie uma tabela tb_cargo utilizando a habilidade de abstração e determine 3 atributos
relevantes do Cargos para se trabalhar com o serviço deste RH.*/

CREATE TABLE tb_cargos(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    setor VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

/*Crie uma tabela tb_funcionário e utilizando a habilidade de abstração e determine 5
atributos relevantes dos funcionários para se trabalhar com o serviço deste RH (não
esqueça de criar a foreign key de tb_cargo nesta tabela).*/

CREATE TABLE tb_funcionarios(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cpf BIGINT NOT NULL,
    rg BIGINT NOT NULL,
    funcao VARCHAR(50) NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
    cargo_id BIGINT,
    PRIMARY KEY(id),
    FOREIGN KEY(cargo_id) REFERENCES tb_cargos (id)
);

-- Popule esta tabela cargos com até 5 dados.

INSERT INTO tb_cargos (nome, setor)
	VALUES ("Software Enginner", "TI");
INSERT INTO tb_cargos (nome, setor)
	VALUES ("Suporte Técnico", "TI");
INSERT INTO tb_cargos (nome, setor)
	VALUES ("Scrum Master", "TI");
INSERT INTO tb_cargos (nome, setor)
	VALUES ("Product Owner", "TI");
INSERT INTO tb_cargos (nome, setor)
	VALUES ("Tech Lead", "TI");
    
-- Popule esta tabela funcionarios com até 15 dados.

INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("João", 9999999999, 44444444, "Desenvolvedor Java", 5000, 1);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Maria", 9999999998, 44444440, "Desenvolvedora Python", 4000, 1);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Joaquim", 9999999997, 44444443, "DevOps", 8000, 1);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Aline", 9999999996, 44444442, "CTO", 15000, 5);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario)
	VALUES ("Victor", 9999999995, 44444441, "UX Designer", 5000);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Caio", 9999999994, 44444440, "Desenvolvedor Javascript", 4500, 1);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Camila", 9999999993, 44444445, "Estagiária de Desenvolvimento", 1800, 1);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Judas", 9999999992, 44444446, "Estagiário de Desenvolvimento", 1800, 1);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Fernanda", 9999999991, 44444447, "Suporte", 2000, 2);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Pedro", 9999999990, 44444448, "QA", 4000, 1);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Glória", 9999999989, 44444449, "Sysadmin", 4500, 2);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario)
	VALUES ("Carlos", 9999999979, 44444434, "Segurança", 1800);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario)
	VALUES ("Rebeca", 9999999969, 44444424, "Analista de Riscos", 6000);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario)
	VALUES ("Samuka", 9999999959, 44444414, "CEO", 25000);
INSERT INTO tb_funcionarios (nome, cpf, rg, funcao, salario, cargo_id)
	VALUES ("Ester", 9999999949, 44444404, "Desenvolvedora C#", 4500, 1);
    
-- Faça um select que retorne os funcionários com o salário maior do que 2000.

SELECT * FROM tb_funcionarios WHERE salario > 2000;

-- Faça um select trazendo os funcionários com salário entre 1000 e 2000.

SELECT * FROM tb_funcionarios WHERE salario BETWEEN 1000 AND 2000;

-- Faça um select utilizando LIKE buscando os Funcionários com a letra C.

-- Começando com a letra C
SELECT * FROM tb_funcionarios WHERE nome LIKE "C%";

-- Qualquer letra C no nome
SELECT * FROM tb_funcionarios WHERE nome LIKE "%C%";

-- Atividade 1

/* Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema 
 trabalhará com as informações dos funcionários desta empresa. */
 
 CREATE DATABASE db_rh;
 
 USE db_rh;
 
 /*Crie uma tabela de funcionários e utilizando a habilidade de abstração e determine 5
 atributos relevantes dos funcionários para se trabalhar com o serviço deste RH.*/
 
 CREATE TABLE tb_funcionarios(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cpf BIGINT NOT NULL,
    funcao VARCHAR(100) NOT NULL,
    salario DECIMAL(10,2) NOT NULL,
    PRIMARY KEY(id)
 );
 
 -- Popule esta tabela com até 5 dados;
 
 INSERT INTO tb_funcionarios (nome, cpf, funcao, salario)
 VALUES ("João da Silva", 31112345678, "Software Engineer", 5000);
 INSERT INTO tb_funcionarios (nome, cpf, funcao, salario)
 VALUES ("Maria Aparecida", 31112345699, "Scrum Master", 10000);
 INSERT INTO tb_funcionarios (nome, cpf, funcao, salario)
 VALUES ("Joaquim Teixeira", 34412345600, "UX", 4000);
 INSERT INTO tb_funcionarios (nome, cpf, funcao, salario)
 VALUES ("Ednaldo Pereira", 35512345698, "Tech Lead", 15000);
 INSERT INTO tb_funcionarios (nome, cpf, funcao, salario)
 VALUES ("Ananias Jr.", 32266345690, "Estagiário de Desenvolvimento", 1800);
 
 -- Faça um select que retorne os funcionários com o salário maior do que 2000.
 
 SELECT * FROM tb_funcionarios WHERE salario > 2000;
 
 -- Faça um select que retorne os funcionários com o salário menor do que 2000.
 
 SELECT * FROM tb_funcionarios WHERE salario < 2000;
 
 -- Ao término atualize um dado desta tabela através de uma query de atualização.
 
 UPDATE tb_funcionarios SET nome = "Maradona", cpf = 22222233300, salario = 8000
 WHERE id = 2;
 
 SELECT * FROM tb_funcionarios;

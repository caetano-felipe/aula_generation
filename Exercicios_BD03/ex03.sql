-- Atividade 3

/*Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco
deverá ter o seguinte nome db_cursoDaMinhaVida, onde o sistema trabalhará com as
informações dos produtos desta empresa.
O sistema trabalhará com 2 tabelas tb_curso e tb_categoria.*/

CREATE DATABASE db_cursoDaMinhaVida;

USE db_cursoDaMinhaVida;

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste site de cursos onlines.*/

CREATE TABLE tb_categoria(
    id BIGINT AUTO_INCREMENT,
    descricao VARCHAR(100) NOT NULL,
    ativo BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);

/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de um site de cursos
onlines(não esqueça de criar a foreign key de tb_categoria nesta tabela).*/

CREATE TABLE tb_produto(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    duracao VARCHAR(20) NOT NULL,
    preco DECIMAL(6,2) NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

-- Popule esta tabela Categoria com até 5 dados.

INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Desenvolvimento Backend", true);
INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Desenvolvimento Frontend", true);
INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Redes de Computadores", true);
INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Sistemas Operacionais", true);
INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Banco de Dados", true);

-- Popule esta tabela Produto com até 8 dados.

INSERT INTO tb_produto (nome, duracao, preco, categoria_id)
	VALUES ("Java básico", "40 horas", 599.99, 1);
INSERT INTO tb_produto (nome, duracao, preco, categoria_id)
	VALUES ("Javascript básico", "40 horas", 399.99, 2);
INSERT INTO tb_produto (nome, duracao, preco, categoria_id)
	VALUES ("Linux Ubuntu 20", "80 horas", 899.99, 4);
INSERT INTO tb_produto (nome, duracao, preco, categoria_id)
	VALUES ("Implantação de Redes Locais", "60 horas", 499.99, 3);
INSERT INTO tb_produto (nome, duracao, preco, categoria_id)
	VALUES ("Java Avançado", "80 horas", 1299.99, 1);
INSERT INTO tb_produto (nome, duracao, preco, categoria_id)
	VALUES ("HTML5 e CSS3", "60 horas", 299.99, 2);
INSERT INTO tb_produto (nome, duracao, preco, categoria_id)
	VALUES ("MySQL", "100 horas", 999.99, 5);
INSERT INTO tb_produto (nome, duracao, preco, categoria_id)
	VALUES ("Angular 9", "80 horas", 1299.99, 2);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.

SELECT * FROM tb_produto WHERE preco > 50.00;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

-- Faça um select utilizando LIKE buscando os Produtos com as letras JAV.

SELECT * FROM tb_produto WHERE nome LIKE "%JAV%";

-- Faça um um select com Inner join entre tabela categoria e produto.

SELECT tb_produto.id, nome, duracao, preco, tb_categoria.descricao as descricao, tb_categoria.id as id_categoria
FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria Java).*/

SELECT nome, duracao, preco, tb_categoria.descricao as descricao
FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id
WHERE tb_categoria.descricao LIKE "%Desenvolvimento%"
ORDER BY nome ASC;

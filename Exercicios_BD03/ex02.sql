-- Atividade 2

/*Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome
do banco deverá ter o seguinte nome db_construindo_a_nossa_vida, onde o sistema
trabalhará com as informações dos produtos desta empresa.
O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.*/

CREATE DATABASE db_construindo_a_nossa_vida;

USE db_construindo_a_nossa_vida;

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.*/

CREATE TABLE tb_categoria(
    id BIGINT AUTO_INCREMENT,
    descricao VARCHAR(100) NOT NULL,
    ativo BOOLEAN NOT NULL,
    PRIMARY KEY(id)
);

/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos
(não esqueça de criar a foreign key de tb_categoria nesta tabela).*/

CREATE TABLE tb_produto(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    preco DECIMAL(8,2) NOT NULL,
    qtd_produto INT NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

-- Popule esta tabela Categoria com até 5 dados.

INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Alvenaria", true);
INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Elétrica", true);
INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Hidráulica", true);
INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Segurança Eletrônica", true);
INSERT INTO tb_categoria (descricao, ativo)
	VALUES ("Automação Residencial", true);
    
-- Popule esta tabela Produto com até 8 dados.

INSERT INTO tb_produto (nome, marca, preco, qtd_produto, categoria_id)
	VALUES ("100 metros de Cabo 4mm flexível", "Prysmian", 159.99, 50, 2);
INSERT INTO tb_produto (nome, marca, preco, qtd_produto, categoria_id)
	VALUES ("Tijolo refratário", "Cerâmica Togni", 5.09, 1000, 1);
INSERT INTO tb_produto (nome, marca, preco, qtd_produto, categoria_id)
	VALUES ("Cano PVC para esgosto 6 metros 100mm", "Tigre", 80.50, 100, 3);
INSERT INTO tb_produto (nome, marca, preco, qtd_produto, categoria_id)
	VALUES ("Caixa de Inspeção/ Interligação 100mm", "Tigre", 230, 100, 3);
INSERT INTO tb_produto (nome, marca, preco, qtd_produto, categoria_id)
	VALUES ("Câmera Fish Eye", "Hikvision", 319.99, 50, 4);
INSERT INTO tb_produto (nome, marca, preco, qtd_produto, categoria_id)
	VALUES ("Nvr 16 canais POE", "Hikvision", 2199.99, 30, 4);
INSERT INTO tb_produto (nome, marca, preco, qtd_produto, categoria_id)
	VALUES ("Microcontrolador Arduino Uno", "Arduino", 99.99, 20, 5);
INSERT INTO tb_produto (nome, marca, preco, qtd_produto, categoria_id)
	VALUES ("Módulo de relés 5V com 8 canais", "Arduino", 48.90, 30, 5);

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.

SELECT * FROM tb_produto WHERE preco > 50.00;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.

SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

-- Faça um select utilizando LIKE buscando os Produtos com as letras CI.

SELECT * FROM tb_produto WHERE nome LIKE "%CI%";

-- Faça um um select com Inner join entre tabela categoria e produto.

SELECT tb_produto.id, nome, marca, preco, tb_categoria.descricao as descricao, tb_categoria.id as id_categoria
FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id;

/*Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
os produtos que são da categoria hidráulica).*/

SELECT nome, marca, preco, tb_categoria.descricao as descricao
FROM tb_produto
INNER JOIN tb_categoria ON tb_categoria.id = tb_produto.categoria_id
WHERE tb_categoria.descricao LIKE "%Hidráulica%";

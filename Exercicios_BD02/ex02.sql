-- Atividade 2

/*Crie um banco de dados para um serviço de ecommerce de uma empresa, o nome do
banco deverá ter o seguinte nome db_ecommerce, onde o sistema trabalhará com as
informações dos produtos desta empresa.
O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.*/

CREATE DATABASE db_ecommerce;

USE db_ecommerce;

/*Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.*/

CREATE TABLE tb_categoria(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    PRIMARY KEY(id)
);

/*Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
atributos relevantes dos tb_produto para se trabalhar com o serviço deste ecommerce (não
esqueça de criar a foreign key de tb_categoria nesta tabela).*/

CREATE TABLE tb_produto(
    id BIGINT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    marca VARCHAR(20) NOT NULL,
    preco DECIMAL(10,2) NOT NULL,
    quantidade INT NOT NULL,
    categoria_id BIGINT NOT NULL,
    PRIMARY KEY(id),
    FOREIGN KEY(categoria_id) REFERENCES tb_categoria(id)
);

-- Popule esta tabela Categoria com até 5 dados.

INSERT INTO tb_categoria (nome, tipo)
	VALUES ("Televisor", "TV e Home Theater");
INSERT INTO tb_categoria (nome, tipo)
	VALUES ("Celular", "TCelulares e Smartphones");
INSERT INTO tb_categoria (nome, tipo)
	VALUES ("Vitrola", "Áudio");
INSERT INTO tb_categoria (nome, tipo)
	VALUES ("Guitarra", "Instrumentos musicais");
INSERT INTO tb_categoria (nome, tipo)
	VALUES ("Notebook", "Informática");
    
-- Popule esta tabela Produto com até 15 dados.

INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("TV 42 polegadas", "Sony", 2000, 30, 1);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Vitrola Retrô", "Raveo", 1000, 20, 3);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("MI 9T", "Xiaomi", 1850, 50, 2);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Galaxy S10", "Samsumg", 2500, 23, 2);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Guitarra Les Paul", "Gibson", 10000, 5, 4);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Guitarra SG", "Gibson", 11000, 3, 4);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Notebook Dell vostro", "Dell", 4800, 39, 5);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Vitrola maleta", "Crosley", 1499, 18, 3);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Notebook Asus Zenbook", "Asus", 6000, 10, 5);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("TV 43 polegadas 4k", "Samsung", 1950, 21, 1);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Iphone 11", "Apple", 4499, 2, 2);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Guitarra Telecaster", "Tagima", 899, 13, 4);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("TV 50 polegadas 4k", "Philips", 2199, 22, 1);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("TV 65 polegadas 4k", "samsumg", 5000, 6, 1);
INSERT INTO tb_produto (nome, marca, preco, quantidade, categoria_id)
	VALUES ("Guitarra Flying V", "Jackson", 3500, 8, 4);
    
-- Faça um select que retorne os Produtos com o valor maior do que 2000.

SELECT * FROM tb_produto WHERE preco > 2000;

-- Faça um select trazendo os Produtos com valor entre 1000 e 2000.

SELECT * FROM tb_produto WHERE preco BETWEEN 1000 AND 2000;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C.

-- Começando com a letra C
SELECT * FROM tb_produto WHERE nome LIKE "C%";

-- Qualquer letra C nos dados
SELECT * FROM tb_produto WHERE nome LIKE "%C%";

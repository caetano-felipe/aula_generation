-- Atividade 2

/*Crie um banco de dados para um e commerce, onde o sistema trabalhará com as 
informações dos produtos deste ecommerce.*/

CREATE DATABASE db_ecommerce;

USE db_ecommerce;

/*Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
relevantes dos produtos para se trabalhar com o serviço deste ecommerce.*/

CREATE TABLE tb_produtos(
	id BIGINT AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    categoria VARCHAR(100) NOT NULL,
    valor DECIMAL(10,2) NOT NULL,
    quantidade INT NOT NULL,
    PRIMARY KEY(id)
);

-- Popule esta tabela com até 8 dados.

INSERT INTO tb_produtos (nome, marca, categoria, valor, quantidade)
VALUES ("MI 9T", "Xiaomi", "Smartphones", 2000, 20);
INSERT INTO tb_produtos (nome, marca, categoria, valor, quantidade)
VALUES ("Kindle", "Amazon", "E-books", 349.90, 10);
INSERT INTO tb_produtos (nome, marca, categoria, valor, quantidade)
VALUES ("Arduino Uno", "Arduino", "Eletrônicos", 99.90, 30);
INSERT INTO tb_produtos (nome, marca, categoria, valor, quantidade)
VALUES ("SmartTV 42° polegadas", "Sony", "Televisores", 2500, 18);
INSERT INTO tb_produtos (nome, marca, categoria, valor, quantidade)
VALUES ("Cadeira Gamer", "DT3 Sports", "Cadeiras", 999.90, 7);
INSERT INTO tb_produtos (nome, marca, categoria, valor, quantidade)
VALUES ("Cafeteira", "Nespresso", "Cafeteiras", 360.90, 5);
INSERT INTO tb_produtos (nome, marca, categoria, valor, quantidade)
VALUES ("Vitrola", "Audio Technica", "Som", 1199.90, 15);
INSERT INTO tb_produtos (nome, marca, categoria, valor, quantidade)
VALUES ("Liquidificador", "Philco", "Eletrodomésticos", 125.90, 40);

-- Faça um select que retorne os produtos com o valor maior do que 500.

SELECT * FROM tb_produtos WHERE valor > 500;

-- Faça um select que retorne os produtos com o valor menor do que 500.

SELECT * FROM tb_produtos WHERE valor < 500;

-- Ao término atualize um dado desta tabela através de uma query de atualização.

UPDATE tb_produtos SET categoria = "Eletrônicos"
WHERE id = 2;

SELECT * FROM tb_produtos;

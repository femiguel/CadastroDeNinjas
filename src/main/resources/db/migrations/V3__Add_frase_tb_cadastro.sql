-- V3: Migrations para adicionar a coluna altura na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN altura DOUBLE;
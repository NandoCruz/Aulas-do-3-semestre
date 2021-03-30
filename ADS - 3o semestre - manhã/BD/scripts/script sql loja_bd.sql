-- criação do banco de dados:
create database loja_bd;
-- criação da tabela:
create table cliente (
  -- colunas da tabela:
  cod_cliente   int not null , 
  nome_cliente  varchar(200) not null ,
  email_cliente varchar(100) not null , 
  senha         varchar(20) not null ,
  logradouro    varchar(200) not null,
  cep           varchar(9) not null,
  bairro        varchar(100)
);
-- criação da tabela produto:
create table produto (
  -- colunas:
  cod_produto  int not null,
  nome_produto varchar(200) not null,
  marca        varchar(100) not null, 
  peso         decimal(10,2) null,
  cod_cliente  int null
);
-- alterar a tabela cliente para definir chave-primária:
ALTER TABLE cliente
ADD PRIMARY KEY (cod_cliente);
-- alternar a tabela produto para definir chave-primária:
ALTER TABLE produto
ADD PRIMARY KEY (cod_produto);
-- relacionamento entre tabelas (chave estrangeira):
ALTER TABLE    produto
ADD CONSTRAINT fk_cliente
FOREIGN KEY    (cod_cliente)
REFERENCES     cliente (cod_cliente);
-- inserir clientes na tabela cliente:
insert into cliente
(cod_cliente, nome_cliente, email_cliente, senha, 
 logradouro, cep, bairro)
values
(1, 'Luan Santana', 'luan@email.com', '123456',
 'Av. Almirante Barroso, 100', '660321039', 'Marco') , 
(2, 'Maria Silva', 'maria@email.com', 'admin',
 'Av. Alcindo Cacela, 900', '669000091', 'Umarizal') ,
(3, 'José Souza', 'zeze@email.com', 'jose123',
 'Tv. Mauriti, 800', '666212873', 'Pedreira');
-- inserção na tabela produto:
insert into produto
(cod_produto, nome_produto, marca, peso)
values
(1, 'Playstation 4',   'Sony',      2.8) , 
(2, 'Nintendo Switch', 'Nintendo',  1.9) , 
(3, 'Xbox One',        'Microsoft', 3.1);
-- atualizar a tabela produto para cliente 1:
update produto
set    cod_cliente = 1
where  cod_produto in (1, 2);
-- atualizar a tabela produto para cliente 2:
update produto 
set    cod_cliente = 2
where  cod_produto = 3;
-- o nome, email, logradouro e bairro de todos os clientes cadastrados na tabela “cliente”;
select nome_cliente, email_cliente, logradouro, bairro
from cliente;
-- todos os registros e as colunas da tabela “produto” ordenados nome em ordem alfabética (A-Z);
select * 
from produto
order by nome_produto;
-- todos os produtos com peso maior que 2 kg.
select * 
from produto
where peso > 2;
-- remover produto de código 3:
delete from produto where cod_produto = 3;





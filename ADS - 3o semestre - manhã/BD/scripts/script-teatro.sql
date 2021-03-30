-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE DATABASE IF NOT EXISTS `teatro_bd` DEFAULT CHARACTER SET utf8 ;
USE `teatro_bd` ;

-- -----------------------------------------------------
-- Table `mydb`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cliente` (
  `cod_cliente` INT NOT NULL,
  `nome_cliente` VARCHAR(200) NOT NULL,
  `cpf_cliente` VARCHAR(14) NOT NULL,
  `email_cliente` VARCHAR(100) NOT NULL,
  `senha_cliente` VARCHAR(20) NOT NULL,
  `data_hora` DATETIME NOT NULL,
  PRIMARY KEY (`cod_cliente`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`evento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `evento` (
  `cod_evento` INT NOT NULL,
  `nome_evento` VARCHAR(100) NOT NULL,
  `data_hora_evento` DATETIME NOT NULL,
  `nome_responsavel` VARCHAR(100) NOT NULL,
  `qtd_max` INT NOT NULL,
  `qtd_min` INT NOT NULL,
  PRIMARY KEY (`cod_evento`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`ingresso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ingresso` (
  `cod_ingresso` INT NOT NULL,
  `tipo_ingresso` VARCHAR(50) NOT NULL,
  `valor_ingresso` DECIMAL(10,2) NOT NULL,
  `numero_cadeira` VARCHAR(10) NOT NULL,
  `data_hora` DATETIME NOT NULL,
  `cod_evento` INT NOT NULL,
  PRIMARY KEY (`cod_ingresso`),
  INDEX `fk_evento` (`cod_evento` ASC),
  CONSTRAINT `fk_ingresso_evento1`
    FOREIGN KEY (`cod_evento`)
    REFERENCES `evento` (`cod_evento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`pagamento`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `pagamento` (
  `cod_cliente` INT NOT NULL,
  `cod_ingresso` INT NOT NULL ,
  `valor_total` DECIMAL(10,2) NOT NULL,
  `tipo_pagto` VARCHAR(50) NOT NULL,
  `situacao` VARCHAR(50) NOT NULL,
  `data_hora` DATETIME NOT NULL,
  PRIMARY KEY (`cod_cliente`, `cod_ingresso`),
  INDEX `fk_ingresso` (`cod_ingresso` ASC),
  INDEX `fk_cliente` (`cod_cliente` ASC),
  CONSTRAINT `fk_cliente_has_ingresso_cliente`
    FOREIGN KEY (`cod_cliente`)
    REFERENCES `cliente` (`cod_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_ingresso_ingresso1`
    FOREIGN KEY (`cod_ingresso`)
    REFERENCES `ingresso` (`cod_ingresso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- DML (data manipulation language):
-- INSERIR DADOS:
INSERT INTO cliente 
(cod_cliente, nome_cliente, cpf_cliente, email_cliente, senha_cliente, data_hora)
VALUES
(1, 'Fabio', '893.342.311-99', 'fabio@email.com', md5('123456'), now()),
(2, 'Maria', '437.743.742-99', 'maria@email.com', md5('maria123'), now()),
(3, 'José', '643.742.473-83', 'zezinho@email.com', md5('zeze0800'), now());

select * from cliente;

insert into evento
(cod_evento, nome_evento, data_hora_evento, 
	nome_responsavel, qtd_max, qtd_min)
VALUES
(1, 'Orquestra Sinfônica', '2020-04-02 19:00', 'Adriano dos Anjos', 1000, 100),
(2, 'Standup do Lucas', '2020-04-07 21:00', 'Miller', 2000, 50);

select * from evento;

insert into ingresso
(cod_ingresso, tipo_ingresso, valor_ingresso, 
	numero_cadeira, data_hora, cod_evento)
VALUES
(1, 'Inteira', 90.00, 'A1', now(), 1),
(2, 'Inteira', 90.00, 'A2', now(), 1),
(3, 'Meia', 45.00, 'A3', now(), 1),
(4, 'Meia', 45.00, 'A4', now(), 1),
(5, 'Inteira', 50.00, 'A1', now(), 2),
(6, 'Inteira', 50.00, 'A2', now(), 2),
(7, 'Meia', 25.00, 'A3', now(), 2),
(8, 'Meia', 25.00, 'A4', now(), 2);

select * from ingresso;

insert into pagamento
(cod_cliente, cod_ingresso, valor_total, 
	tipo_pagto, situacao, data_hora)
values
(1, 1, 90, 'Boleto', 'Aguardando', now()),
(1, 2, 90, 'Crédito', 'Aguardando', now()),
(1, 2, 90, 'Boleto', 'Aguardando', now());

select * from pagamento;
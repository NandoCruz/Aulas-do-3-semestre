create database BD_ADS;
-- drop database BD_ADS;
use BD_ADS;

create table conta_corrente (
   agencia int not null ,
   conta   int not null ,
   tipo    varchar(2) not null,
   saldo   decimal(16,2) not null,
   primary key(agencia, conta)
) ENGINE=InnoDB;

create table transferencia (
   cod_transf int not null primary key, 
   agencia_origem int not null,
   conta_origem int not null,
   agencia_destino int not null,
   conta_destino int not null,
   valor decimal(16,2) not null,
   data_hora_transf timestamp
) ENGINE=InnoDB;

alter table transferencia add
 constraint `fk_agencia_origem` foreign key (`agencia_origem`)
 references `conta_corrente` (`agencia`);
alter table transferencia add
 constraint `fk_conta_origem` foreign key (`conta_origem`)
 references `conta_corrente` (`conta`);
alter table transferencia add
 constraint `fk_agencia_destino` foreign key (`agencia_destino`)
 references `conta_corrente` (`agencia`);
alter table transftg_transferencia add
 constraint `fk_conta_destino` foreign key (`conta_destino`)
 references `conta_corrente` (`conta`);

insert into conta_corrente
(agencia, conta, tipo, saldo)
values
(1000, 20, 'PF', 5000),
(1000, 30, 'PF', 7500),
(3000, 40, 'PJ', 9000);
select * from conta_corrente;

delimiter $
create trigger tg_transf after insert on transferencia
for each row
begin
  update conta_corrente set saldo = saldo - new.valor
  where agencia = new.agencia_origem
  and conta = new.conta_origem;
  update conta_corrente set saldo = saldo + new.valor
  where agencia = new.agencia_destino
  and conta = new.conta_destino;
end$
delimiter ;

insert into transferencia
values
( 1, 1000, 20, 1000, 30, 200, now() ),
( 2, 3000, 40, 1000, 30, 500, now() );

select * from transferencia;
select * from conta_corrente;

show triggers;
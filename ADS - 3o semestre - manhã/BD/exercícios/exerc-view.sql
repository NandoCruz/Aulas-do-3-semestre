use BD_ADS;

create view vw_transf_cliente
(cod_transf, agencia, conta, tipo, valor_transf, 
data_hora_transf)
AS
select t.cod_transf, c.agencia, c.conta, c.tipo,
	   t.valor, t.data_hora_transf
from transferencia as t
inner join conta_corrente as c 
	on (c.agencia = t.agencia_origem and 
        c.conta = t.conta_origem);
        
        
select * from vw_transf_cliente
where valor_transf > 200;


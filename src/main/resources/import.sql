-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

insert into concessionaria (marca, nomeConcessionaria) values('Triumph', 'Triumph Motorcycles Ltd');
insert into concessionaria (marca, nomeConcessionaria) values('BMW', 'BMW Motorrad');
insert into concessionaria (marca, nomeConcessionaria) values('Kawasaki', 'Kawasaki');

insert into motos (nome, marca, cor) values('Tiger 900 GT', 1, 'Vermelho');
insert into motos (nome, marca, cor) values('R 1250 GS Adventure', 2, 'Triple Black');
insert into motos (nome, marca, cor) values('Versys 1000', 3, 'Verde');
insert into motos (nome, marca, cor) values('S 1000 RR', 2, 'Racing Red');
insert into motos (nome, marca, cor) values('Z 1000 R Edition', 3, 'Verde');
insert into motos (nome, marca, cor) values('Tiger Sport 660', 1, 'Azul');
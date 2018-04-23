--insert into balance (balance) values (12000);


--insert into user (name, email,salary, balance_id) values ('luisdany', 'luisdany@gmail.com', 20000, 1);
insert into user (name, email,salary) values ('rosalba', 'rosalba@gmail.com', 20000);
--insert into user (name, email,salary) values ('abraham', 'abraham@gmail.com', 20000);
--insert into user (name, email,salary) values ('josselin', 'josselin@gmail.com', 20000);

--insert into discount (applied, description, name, user_id) values (false, 'Cargo por pago de parqueo', 'Parqueo', 1);

insert into expense ( amount, date, description, name, user_id) values ( 15, sysdate, 'Pago de parqueo cc', 'pago', 1);

--insert into expense ( amount, date, description, name) values ( 15, sysdate, 'Pago de parqueo cc', 'pago');
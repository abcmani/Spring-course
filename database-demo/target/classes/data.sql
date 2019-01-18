/*
create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255),
DOB timestamp,
primary key(id)
);
*/

insert into person (ID,NAME,LOCATION,DOB) 
values (10001, 'mani', 'pune', sysdate());
insert into person (ID,NAME,LOCATION,DOB) 
values (10002, 'manideep', 'punjab', sysdate());
insert into person (ID,NAME,LOCATION,DOB) 
values (10003, 'singha', 'pune', sysdate());
insert into person (ID,NAME,LOCATION,DOB) 
values (10004, 'sachin', 'pune', sysdate());
use koreaitdb;

create table items(
item_id int not null auto_increment,
item_name varchar(100) not null,
item_price int,
primary key(item_id)
);
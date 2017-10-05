create table users(
	id int not null auto_increment primary key,
	age int not null,
	user_login varchar(50) not null,
	user_pass varchar(50) not null
)
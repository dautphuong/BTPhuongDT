create database sms;
use sms;
drop database sms;
create table Customer (
	customer_id int primary key,
	customer_name nvarchar(100)
);

create table Employee (
	employee_id int primary key,
	employee_name nvarchar(100),
	salary float,
	spvrId int
);


create table Product (
	product_id int primary key,
	product_name nvarchar(100),
	list_price float
);

create table Orders (
	order_id int primary key,
	order_date date,
	customer_id int,
	employee_id int,
	total float
	foreign key (customer_id) references Customer(customer_id),
	foreign key (employee_id) references Employee(employee_id),
)

create table LineItem (
	order_id int,
	product_id int,
	quantity int,
	price float,
	primary key(order_id,product_id),
	foreign key (order_id) references Orders(order_id),
	foreign key (product_id) references Product(product_id),
)
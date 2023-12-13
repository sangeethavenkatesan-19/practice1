>create database estore_zone_db;
>use estore_zone_db;
>select database();
>create table eproduct(product_id int primary key auto_increment, product_name varchar(100), price decimal(10,2)
 product_desc varchar(255), create_at timestamp default now())
 >select * from eproduct;
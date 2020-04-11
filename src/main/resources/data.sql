--create table if not exists USER(
--	id int not null primary key,
--    username varchar(50) not null primary key,
--    password varchar(50) not null,
--    active boolean not null,
--    roles varchar(50)
--);

--INSERT INTO USER VALUES ('ANGELA', '12345', 1, 'ROLE_ADMIN');
--INSERT INTO USER VALUES ('DANIEL', '12345', 1, 'ROLE_USER');

--INSERT IGNORE INTO USER VALUES ('ANGELA', '12345', 1, 'ROLE_ADMIN');
--INSERT IGNORE INTO USER VALUES ('DANIEL', '12345', 1, 'ROLE_USER');

INSERT IGNORE INTO user (id, username, password, active, roles) VALUES (1,'ANGELA', '12345', 1, 'ROLE_ADMIN');
INSERT IGNORE INTO user (id, username, password, active, roles) VALUES (2, 'DANIEL', '12345', 1, 'ROLE_USER');

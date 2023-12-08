use koreaitdb;

create table config(
config_id int not null auto_increment,
config_code varchar(10) unique,
config_title varchar(255) not null,
config_comment char(1),
config_color char(7),
config_date date,
primary key(config_id)
);

-- board_코드값 : 게시판

create table board_${configCode}(
id int not null auto_increment,
subject varchar(255) not null,
writer varchar(20) not null,
content text,
visit int,
regdate date,
grp int,
seq int,
depth int,
primary key(id)
);

-- files_코드값 : 다중파일업로드
create table files_${configCode}(
id int not null,
orgName varchar(255),
savedFileName varchar(255),
savedPathFileName varchar(255),
savedFileSize bigint,
folderName varchar(10),
ext varchar(20)
);

-- comment_코드값 : 댓글
create table comment_${configCode}(
c_id int not null auto_increment,
c_subject varchar(50),
c_writer varchar(20),
c_comment varchar(100),
c_visit int,
c_regdate date,
primary key(c_id)
);

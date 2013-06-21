BEGIN TRANSACTION;
CREATE TABLE sqlite_stat1(tbl,idx,stat);
INSERT INTO sqlite_stat1 VALUES('t_статьи',NULL,3);
INSERT INTO sqlite_stat1 VALUES('t_должности',NULL,4);
CREATE TABLE t_checker( 
t_checkerID INT(4) , 
t_checkerVersion VARCHAR );
INSERT INTO t_checker VALUES(666,1.0);
CREATE TABLE t_дела( 
t_делаID INT(8) , 
id_человека INT(8) , 
статус VARCHAR(40) , 
id_статьи INT(8) );
INSERT INTO 't_дела' VALUES(1,1,'открыто',1);
INSERT INTO 't_дела' VALUES(2,2,'закрыто',2);
INSERT INTO 't_дела' VALUES(3,3,'открыто',3);
CREATE TABLE t_должности( 
t_должностиID INT(4) NOT NULL , 
t_должностиName VARCHAR(30) , 
t_должностиСтавка DOUBLE(12) );
INSERT INTO 't_должности' VALUES(0,'Никто',0.0);
INSERT INTO 't_должности' VALUES(1,'Подозреваемый',0.0);
INSERT INTO 't_должности' VALUES(2,'Следователь',10000.0);
INSERT INTO 't_должности' VALUES(3,'Убийца',0.0);
CREATE TABLE t_люди( 
t_людиID INTEGER(4) NOT NULL , 
t_людиName VARCHAR(50) , 
t_людиДолжностьId INT(4) NOT NULL PRIMARY KEY , 
t_людиЗарплата INTEGER(20) , 
t_людиКоэффициентЗарплаты DOUBLE(8) NOT NULL );
INSERT INTO 't_люди' VALUES(1,'Василий Петрович Убийцин',3,0,0.0);
INSERT INTO 't_люди' VALUES(2,'Иван Иванович Подозревателькин',1,0,0.0);
INSERT INTO 't_люди' VALUES(3,'Петр Абдулаев Слетователькин',2,0,0.0);
CREATE TABLE t_статьи( 
t_статьиID INT(4) , 
t_статьиName VARCHAR(50) , 
t_статьиКоэффициент DOUBLE(4) );
INSERT INTO 't_статьи' VALUES(1,'Убийство',0.3);
INSERT INTO 't_статьи' VALUES(2,'Взятка',0.2);
INSERT INTO 't_статьи' VALUES(3,'Жульничество',0.1);
CREATE TABLE t_экспертизы( 
id_экспертизы INT(8) , 
коэффициент DOUBLE(8) , 
дата VARCHAR(40) );
INSERT INTO 't_экспертизы' VALUES(1,0.2,'20.10.1999');
INSERT INTO 't_экспертизы' VALUES(2,0.6,'20.11.2010');
INSERT INTO 't_экспертизы' VALUES(3,0.3,'11.11.1911');
CREATE TABLE t_эксперты_дела( 
id_человека INT(4) , 
id_дела INT(8) , 
id_экспертизы INT(8) );
INSERT INTO 't_эксперты_дела' VALUES(2,2,1);
INSERT INTO 't_эксперты_дела' VALUES(2,1,2);
INSERT INTO 't_эксперты_дела' VALUES(3,3,3);
COMMIT;

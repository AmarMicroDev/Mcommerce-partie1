-- http://h2database.com/html/main.html

-------------------------
-- For H2 Database only
-------------------------

INSERT INTO product VALUES(1, 'Ordinateur portable' , 350, 120);
INSERT INTO product VALUES(2, 'Aspirateur Robot' , 500, 200);
INSERT INTO product VALUES(3, 'Table de Ping Pong' , 750, 400);

ALTER SEQUENCE HIBERNATE_SEQUENCE RESTART WITH 4

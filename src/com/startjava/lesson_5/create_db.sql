DROP TABLE IF EXISTS jaegers;

CREATE DATABASE Jaegers;

CREATE TABLE jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark INTEGER,
    height DECIMAL(4, 2),
    weight DECIMAL(4, 3),
    status TEXT,
    origin TEXT,
    launch DATE NOT NULL,
    kaijuKill INTEGER
);

\ir init_db.sql
\ir queries.sql

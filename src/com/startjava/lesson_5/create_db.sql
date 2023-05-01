CREATE DATABASE Jaegers;

CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY,
    modelName TEXT,
    mark INTEGER,
    height DECIMAL(4, 2),
    weight DECIMAL(4, 3),
    status TEXT,
    origin TEXT,
    launch TEXT,
    kaijuKill INTEGER
);

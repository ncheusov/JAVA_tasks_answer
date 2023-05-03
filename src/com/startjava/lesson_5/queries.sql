\echo '-- print the whole table'
SELECT *
FROM jaegers;

\echo '-- print only active robots'
SELECT *
FROM jaegers
WHERE status = 'Active';

\echo '-- print Mark-1 and Mark-4'
SELECT modelName, mark
FROM jaegers
WHERE mark <= 4;

\echo '-- print all robots except Mark-1 and Mark-4'
SELECT modelName, mark
FROM jaegers
WHERE mark NOT IN (1, 4);

\echo '-- order robots by mark in decreasing'
SELECT *
FROM jaegers
ORDER BY mark DESC;

\echo '-- info about oldest robot'
SELECT *
FROM jaegers
WHERE launch =
      (SELECT MIN(launch)
       FROM jaegers);

\echo '-- robots that destroyed the most kaiju'
SELECT modelName, kaijuKill
FROM jaegers
ORDER BY kaijuKill DESC 
LIMIT 3;

\echo '-- average weigth of robots'
SELECT AVG(weight)
FROM jaegers;

\echo '-- increase by one the number of destroyed kaiju in robots that are still active'
UPDATE jaegers
SET kaijuKill = kaijuKill + 1
WHERE status = 'Active';

\echo '-- delete destroyed robots'
DELETE FROM jaegers
WHERE status = 'Destroyed';

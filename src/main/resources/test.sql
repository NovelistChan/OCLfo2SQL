SELECT *
FROM (SELECT *
FROM SnapShotTest
WHERE SnapShotTest.timeStamp > 0
UNION
SELECT *
FROM SnapShotTest
WHERE SnapShotTest.timeStamp <= 0)
WHERE id NOT IN SELECT id FROM (SELECT *
FROM SnapShotTest
WHERE SnapShotTest.timeStamp > 0
INTERSECTION
SELECT *
FROM SnapShotTest
WHERE SnapShotTest.timeStamp <= 0);
SELECT ANIMAL_TYPE, COUNT(*) AS 수량
FROM ANIMAL_INS 
WHERE ANIMAL_TYPE IN ('Dog', 'Cat')
GROUP BY ANIMAL_TYPE
ORDER BY ANIMAL_TYPE
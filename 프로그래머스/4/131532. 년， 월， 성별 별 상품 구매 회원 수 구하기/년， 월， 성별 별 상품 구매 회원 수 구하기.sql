SELECT 
EXTRACT(YEAR FROM s.SALES_DATE) AS YEAR,
EXTRACT(MONTH FROM s.SALES_DATE) AS MONTH,
u.GENDER AS GENDER,
COUNT(DISTINCT s.USER_ID) AS USERS
FROM ONLINE_SALE s
JOIN USER_INFO u ON s.USER_ID = u.USER_ID
WHERE u.GENDER IS NOT NULL
GROUP BY YEAR, MONTH, GENDER 
ORDER BY YEAR, MONTH, GENDER, USERS ASC;
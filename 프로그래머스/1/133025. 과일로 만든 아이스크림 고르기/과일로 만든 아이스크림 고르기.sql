SELECT h.FLAVOR
FROM FIRST_HALF h
JOIN ICECREAM_INFO o ON h.FLAVOR = o.FLAVOR
WHERE h.TOTAL_ORDER >= 3000
AND o.INGREDIENT_TYPE IN ('fruit_based')
ORDER BY h.TOTAL_ORDER DESC
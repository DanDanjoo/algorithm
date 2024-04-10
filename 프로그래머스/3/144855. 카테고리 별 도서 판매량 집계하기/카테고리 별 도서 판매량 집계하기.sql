SELECT b.CATEGORY AS CATEGORY,
       SUM(bs.SALES) AS TOTAL_SALES
FROM BOOK b, BOOK_SALES bs
WHERE b.BOOK_ID = bs.BOOK_ID
      AND bs.SALES_DATE BETWEEN '2022-01-01' AND '2022-01-31'
GROUP BY b.CATEGORY
ORDER BY b.CATEGORY ASC;
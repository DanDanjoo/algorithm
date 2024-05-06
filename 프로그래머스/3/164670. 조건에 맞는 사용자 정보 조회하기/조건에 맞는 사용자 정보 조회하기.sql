SELECT u.USER_ID, u.NICKNAME
,CONCAT(u.city,' ',u.street_address1,' ', u.street_address2) AS 전체주소
,CONCAT(LEFT(tlno,3), '-', MID(tlno,4,4), '-', RIGHT(tlno,4)) AS 전화번호
FROM USED_GOODS_BOARD b 
JOIN USED_GOODS_USER u ON u.USER_ID = b.WRITER_ID
GROUP BY b.WRITER_ID
HAVING COUNT(b.WRITER_ID) >= 3
ORDER BY u.USER_ID DESC
SELECT name
FROM salesperson

MINUS

SELECT s.name
FROM salesperson s
JOIN orders o ON s.sales_id = o.sales_id
JOIN company c ON o.com_id = c.com_id
WHERE c.name = 'RED';

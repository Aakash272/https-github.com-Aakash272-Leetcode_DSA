select distinct email as 'Email' from Person where id Not in (select Min(id) from Person group by email);

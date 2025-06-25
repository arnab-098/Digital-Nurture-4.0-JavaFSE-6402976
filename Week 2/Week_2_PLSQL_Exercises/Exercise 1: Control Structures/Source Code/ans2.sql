declare
    cursor cust_cursor is
        select customer_id
        from customers
        where balance > 10000;

begin
    for cust_rec in cust_cursor loop
        update customers
        set isvip = 'Y'
        where customer_id = cust_rec.customer_id;
    end loop;

    commit;
end;
/

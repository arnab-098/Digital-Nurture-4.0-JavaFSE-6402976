declare
    cursor cust_cursor is
        select customer_id
        from customers
        where age > 60;
begin
    for cust_rec in cust_cursor loop
        update loans
        set interest_rate = interest_rate - 1
        where customer_id = cust_rec.customer_id;
    end loop;

    commit;
end;
/

set serveroutput on;

declare
    cursor loan_cursor is
        select c.name, l.due_date
        from loans l
        join customers c on l.customer_id = c.customer_id
        where l.due_date between sysdate and sysdate + 30;

begin
    for loan_rec in loan_cursor loop
        dbms_output.put_line(
            'Reminder: loan for ' || loan_rec.name ||
            ' is due on ' || to_char(loan_rec.due_date, 'dd-mon-yyyy')
        );
    end loop;
end;
/


create or replace procedure processmonthlyinterest is
begin
    update accounts
    set balance = balance + (balance * 0.01)
    where account_type = 'savings';

    commit;
end;
/

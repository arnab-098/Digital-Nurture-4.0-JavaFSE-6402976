create or replace procedure transferfunds(
    source_account in accounts.account_id%type,
    target_account in accounts.account_id%type,
    p_amount in number
) is
    v_balance number;
begin
    select balance into v_balance
    from accounts
    where account_id = source_account
    for update;

    if v_balance < p_amount then
        raise_application_error(-20001, 'insufficient funds');
    end if;

    update accounts
    set balance = balance - p_amount
    where account_id = source_account;

    update accounts
    set balance = balance + p_amount
    where account_id = target_account;

    commit;
end;
/

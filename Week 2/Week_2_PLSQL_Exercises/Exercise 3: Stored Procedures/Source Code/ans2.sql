create or replace procedure updateemployeebonus(
    p_dept_id in employees.department_id%type,
    p_bonus_percent in number
) is
begin
    update employees
    set salary = salary + (salary * p_bonus_percent / 100)
    where department_id = p_dept_id;

    commit;
end;
/

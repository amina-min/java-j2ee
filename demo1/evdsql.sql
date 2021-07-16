sqlplus/nolog
connect system/123456

drop user min cascade;

create user min identified by min;
grant create session, create table ,create view, create sequence to min;
alter user min quota 100m on system;
connect min/min;


--no 1.
drop table emp1264435;
create table emp1264435(
    eid number (3) ,
    ename varchar2(12),
    salary number(6),
    hire_date date,
    eaddress varchar2(10)    
);
alter table emp1264435 
add primary key (eid); 

-- no 2.
alter table emp1264435 add(
    department_id number (5),
    department_name varchar2 (10)    
);

--no. 3
select department_id,avg(salary)
from emp1264435
group by department_id
having max(salary)>12000;

--no. 4
create view emp as select ename, department_name,salary
from emp1264435
where department_id=80;

--no. 5
create index emp_index
on emp1264435(ename);



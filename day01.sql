 -- DDL:数据定义类型
/*指的就是数据库对象的定义,例如,表的创建,以及数据库的创建
     使用到的关键字:create,alter,drop
   */
-- DCL:数据控制语言
/*    指的就是数据库的权限问题等
      关键字:grant和revoke
*/
-- DQL:数据查询语言
/*    指的就是数据的查询
      关键字:select
*/
-- DML:数据操作语言
/*    指的就是数据的增删改
      关键字:insert delete update
*/

-- 1.创建表
 语法:
create table 表名(
   字段名1  字段的数据类型,
   字段名2  字段的数据类型,
   ...
   字段名n  字段的数据类型,
)

-- 字段的数据类型
  char(10):字符串类型
  表示表的字段的字符串允许最大的长度是10个字节
  但是,如果你存入的字符串不足10个字节,数据库会
  默认的给你补满10个字节
  varchar(10):字符串类型
  表示表的字段的字符串允许最大的长度是10个字节
  但是,它是存多少,算多少,不会自动补满10字节
  int(4):并不是代表整数类型只能存4位,而是表示
  如果存入的整数类型没有超过4位,会默以0在前面
  补充,例如int(4),如果我们存入一个整数1,则会显示
  成(0001)
  double(10,2):表示存入的是一个小数,此时10表示的是该
  小数最大的位数是10,而小数位最大是2,那么整数位最大是8
  例如88.88

-- 创建一个emp表,表中包含字段:
   id 整数类型          -- id,可以表示成序号
   name 字符串类型      -- 员工姓名   
   salary 小数类型      -- 员工的薪水
   gender 字符串类型    -- 员工的性别
   deptno 整数类型      -- 员工的部门编号

create table emp(
 id int(4),
 name varchar(12),
 salary double(10,2),
 gender varchar(10),
 deptno int(4)
)

-- 查看表结构
   desc emp;

/*
  练习:创建一张test表,
  包含字段:
   id    id值
   name  姓名
   job   职位
*/

create table test(
 id int(4),
 name varchar(12),
 job varchar(12)
 )

   desc test;
-- 2.alter:一般是用来修改表结构的
/*
  往已经创建的test表中添加一个字段
  interesting(兴趣爱好)
  语法:alter table 表名 add 字段名 数据类型
*/
alter table test add interesting varchar(20);
desc test;

-- 3.drop:可以用来删除字段,也可以用来直接删除表
/*
 将test表中的name字段删除
 语法: alter table 表名 drop 字段名
 将整个test表删除
 语法:drop 表名
 使用drop删除的表,会连带表结构一起删除
 delete:删除表的数据

*/
alter table test drop name;
drop table test;

-- 4.insert 插入数据
/*
 语法一:insert INTO 表名 VALUES(值1,值2,值3...)
 语法二:insert INTO 表名(字段名1,字段名1,字段名1...)VALUES(值1,值2,值3...)            
 注意:语法一中,如果在表名后面不跟字段名,则表示以默认的表中的字段顺序
      来插入值,这种写法,就要求value值一个都不能少,必须挨个匹配
      语法二中,我们可以通过在表名后面添加字段名,这个字段名,可以不是
      全部的表中的字段.
      (那么如果没有写出来的字段,值会以默认的方式,系统自动给我们设置进去)
*/
-- 往emp表中插入一条数据
insert INTO emp VALUES(1,'张三',5000,'男',10);
select * from emp;
insert INTO emp(id,salary,gender,deptno)VALUES(1,5000,'男',10);  

-- 5.查看表数据
/*
  语法:select 字段名1,字段名2,...from 表名
  查看表中所有的数据:select * from 表名
*/
select name,salary from emp;
select * from emp;

delete from emp;
truncate table emp;
drop table emp;


create table emp(
   empono int(4)primary key,
   ename varchar(20)not null,
   salary double(10,2),
   job varchar(50),
   comm double(10,2),
   deptno int(4),
   gender varchar(10)default'男',
   hiredate date,
   manager int(4)
)
create table dept(
    deptno int(4)primary key,
    location varchar(50),
    dname varchar(20)
)





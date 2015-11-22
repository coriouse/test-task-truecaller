truncate table t_user;
insert into  t_user(id) values(1);
insert into  t_user(id) values(2);
insert into  t_user(id) values(3);
insert into  t_user(id) values(4);
insert into  t_user(id) values(5);

truncate table t_profile;
insert into  t_profile(id, user, name) values(1,1, 'Peter');
insert into  t_profile(id, user, name) values(2,2, 'Sergey');
insert into  t_profile(id, user, name) values(3,3, 'Aleksey');
insert into  t_profile(id, user, name) values(4,4, 'Jonas');
insert into  t_profile(id, user, name) values(5,5, 'Joan');


truncate table  t_history;
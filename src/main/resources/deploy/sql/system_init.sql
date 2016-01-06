-- 创建初始化用户，系统管理员admin和测试用户test
insert into t_auth_user (user_code,user_name,pass_word,create_time,update_time)
values ('admin', '管理员', 'admin', sysdate(), null);
insert into t_auth_user (user_code,user_name,pass_word,create_time,update_time)
values ('test', '测试用户', 'test', sysdate(), null);

-- 插入默认角色，默认用户角色关系
insert into t_auth_role(role_name,role_remark,create_time,create_user)
select '系统管理员', '系统管理员', sysdate(), a.user_id 
  from t_auth_user a
 where a.user_code = 'admin';

insert into t_auth_user_role(user_id,role_id,status,create_time,create_user)
select a.user_id, b.role_id, '1', sysdate(), a.user_id
  from t_auth_user a, t_auth_role b
 where a.user_code = 'admin'
   and b.role_name = '系统管理员';

delete from t_auth_permission where permission_id <> 0;
insert into t_auth_permission(role_id,menu_id,user_type,create_time)
select b.role_id, a.menu_id, '0', sysdate() 
  from t_auth_menu a, t_auth_role b
 where b.role_name = '系统管理员';


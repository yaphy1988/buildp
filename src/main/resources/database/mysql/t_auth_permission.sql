drop table t_auth_permission;

/*==============================================================*/
/* table: t_auth_permission                                     */
/*==============================================================*/
create table t_auth_permission 
(
   permission_id        bigint(16) auto_increment primary key not null  comment '授权id',
   role_id              bigint(16) 										comment '角色id',
   menu_id              bigint(16)										comment '菜单id',
   user_type            varchar(32)										comment '用户类型',
   create_time          datetime										comment '创建时间'
);
alter table `t_auth_permission` 
comment = 't_auth_permission-系统权限表，记录用户与菜单权限的授权关系' ;

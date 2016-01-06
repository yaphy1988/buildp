drop table t_auth_role;

/*==============================================================*/
/* table: t_auth_role                                           */
/*==============================================================*/
create table t_auth_role 
(
   role_id              bigint(16) auto_increment primary key not null comment '角色id',
   role_name            varchar(32)										comment '角色名称',
   role_remark          varchar(256)									comment '角色说明',
   create_time          datetime										comment '创建时间',
   create_user          bigint(16)										comment '创建人,t_auth_user.user_id'
);

alter table `t_auth_role` 
comment = 't_auth_role-系统角色表，系统角色划分，用户属于哪个角色，一个用户可以属于多个角色';
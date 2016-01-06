drop table t_auth_user_role;

/*==============================================================*/
/* table: t_auth_user_role                                      */
/*==============================================================*/
create table t_auth_user_role 
(
   user_id              bigint(16)           not null comment '用户id',
   role_id              bigint(16)           not null comment '角色id',
   status               varchar(1)					  comment '状态：0-失效，1-有效',
   create_time          date						  comment '创建时间',
   create_user          bigint(16)					  comment '创建人'
);

alter table `t_auth_user_role` 
comment = 't_auth_user_role-用户角色表';
drop table t_auth_user;

/*==============================================================*/
/* table: t_auth_user                                           */
/*==============================================================*/
create table t_auth_user 
(
   user_id              bigint(16) auto_increment primary key not null  comment '工号',
   user_code            varchar(32)	not null							comment '登录用户名',
   user_name            varchar(128)									comment '用户名称',
   pass_word            varchar(256)									comment '密码',
   create_time          datetime										comment '创建时间',
   update_time          datetime										comment '更新时间'
);

alter table `t_auth_user` 
comment = 't_auth_user-用户表';
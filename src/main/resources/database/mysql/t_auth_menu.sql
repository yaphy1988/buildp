drop table t_auth_menu;

/*==============================================================*/
/* table: t_auth_menu                                           */
/*==============================================================*/
create table t_auth_menu
(
   menu_id              bigint(16) primary key not null	comment '菜单id，六位数字编码，三级菜单：100101格式',
   parent_menu          bigint(16)						comment '父菜单id',
   menu_name            varchar(64)						comment '菜单名称',
   menu_url             varchar(128)					comment '菜单url',
   menu_level           varchar(1)						comment '菜单层级',
   order_num            bigint(16)						comment '菜单排序',
   remark               varchar(256)					comment '菜单备注',
   create_time          datetime						comment '创建时间'
);
alter table `t_auth_menu` 
comment = '菜单表，保存菜单信息' ;
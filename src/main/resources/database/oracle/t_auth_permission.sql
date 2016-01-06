drop table T_AUTH_PERMISSION cascade constraints;

/*==============================================================*/
/* Table: T_AUTH_PERMISSION                                     */
/*==============================================================*/
create table T_AUTH_PERMISSION 
(
   PERMISSION_ID        NUMBER(16)           not null,
   ROLE_ID              NUMBER(16),
   MENU_ID              NUMBER(16),
   USER_TYPE            VARCHAR2(32),
   CREATE_TIME          DATE,
   constraint PK_T_AUTH_PERMISSION primary key (PERMISSION_ID)
);

comment on table T_AUTH_PERMISSION is
'T_AUTH_PERMISSION-系统权限表，记录用户与菜单权限的授权关系';

comment on column T_AUTH_PERMISSION.PERMISSION_ID is
'序号，seq_auth_permission';

comment on column T_AUTH_PERMISSION.ROLE_ID is
'角色ID';

comment on column T_AUTH_PERMISSION.MENU_ID is
'菜单ID';

comment on column T_AUTH_PERMISSION.USER_TYPE is
'用户类型';

comment on column T_AUTH_PERMISSION.CREATE_TIME is
'创建时间';

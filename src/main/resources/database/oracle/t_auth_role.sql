drop table T_AUTH_ROLE cascade constraints;

/*==============================================================*/
/* Table: T_AUTH_ROLE                                           */
/*==============================================================*/
create table T_AUTH_ROLE 
(
   ROLE_ID              NUMBER(16)           not null,
   ROLE_NAME            VARCHAR2(32),
   ROLE_REMARK          VARCHAR2(256),
   CREATE_TIME          DATE,
   CREATE_USER          NUMBER(16),
   constraint PK_T_AUTH_ROLE primary key (ROLE_ID)
);

comment on table T_AUTH_ROLE is
'T_AUTH_ROLE-系统角色表，系统角色划分，用户属于哪个角色，一个用户可以属于多个角色';

comment on column T_AUTH_ROLE.ROLE_ID is
'角色ID，seq_auth_role.next_val';

comment on column T_AUTH_ROLE.ROLE_NAME is
'角色名称';

comment on column T_AUTH_ROLE.ROLE_REMARK is
'角色说明';

comment on column T_AUTH_ROLE.CREATE_TIME is
'创建时间';

comment on column T_AUTH_ROLE.CREATE_USER is
'创建人,t_auth_user.user_id';

drop table T_AUTH_USER_ROLE cascade constraints;

/*==============================================================*/
/* Table: T_AUTH_USER_ROLE                                      */
/*==============================================================*/
create table T_AUTH_USER_ROLE 
(
   USER_ID              NUMBER(16)           not null,
   ROLE_ID              NUMBER(16)           not null,
   STATUS               VARCHAR2(1),
   CREATE_TIME          DATE,
   CREATE_USER          NUMBER(16),
   constraint PK_T_AUTH_USER_ROLE primary key (USER_ID, ROLE_ID)
);

comment on table T_AUTH_USER_ROLE is
'T_AUTH_USER_ROLE-用户角色表';

comment on column T_AUTH_USER_ROLE.USER_ID is
'用户ID';

comment on column T_AUTH_USER_ROLE.ROLE_ID is
'角色ID';

comment on column T_AUTH_USER_ROLE.STATUS is
'状态';

comment on column T_AUTH_USER_ROLE.CREATE_TIME is
'创建时间';

comment on column T_AUTH_USER_ROLE.CREATE_USER is
'创建人';

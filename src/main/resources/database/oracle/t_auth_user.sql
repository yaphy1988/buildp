drop table T_AUTH_USER cascade constraints;

/*==============================================================*/
/* Table: T_AUTH_USER                                           */
/*==============================================================*/
create table T_AUTH_USER 
(
   USER_ID              NUMBER(16)           not null,
   USER_CODE            VARCHAR2(32),
   USER_NAME            VARCHAR2(128),
   PASS_WORD            VARCHAR2(256),
   CREATE_TIME          DATE,
   UPDATE_TIME          DATE,
   constraint PK_T_AUTH_USER primary key (USER_ID)
);

comment on table T_AUTH_USER is
'T_AUTH_USER-用户表';

comment on column T_AUTH_USER.USER_ID is
'工号';

comment on column T_AUTH_USER.USER_CODE is
'用户名';

comment on column T_AUTH_USER.USER_NAME is
'称呼';

comment on column T_AUTH_USER.PASS_WORD is
'密码';

comment on column T_AUTH_USER.CREATE_TIME is
'创建时间';

comment on column T_AUTH_USER.UPDATE_TIME is
'更新时间';

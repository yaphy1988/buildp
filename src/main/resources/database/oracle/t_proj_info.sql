drop table T_PROJ_INFO cascade constraints;

/*==============================================================*/
/* Table: T_PROJ_INFO                                           */
/*==============================================================*/
create table T_PROJ_INFO 
(
   PROJ_ID              NUMBER(16)           not null,
   PROJ_LEADER          NUMBER(16),
   START_TIME           DATE,
   END_TIME             NUMBER(10),
   CREATE_TIME          DATE,
   CREATE_USER          VARCHAR2(32),
   UPDATE_TIME          DATE,
   UPDATE_USER          VARCHAR2(32),
   constraint PK_T_PROJ_INFO primary key (PROJ_ID)
);

comment on table T_PROJ_INFO is
'项目信息，序列SEQ_PROJ_INFO';

comment on column T_PROJ_INFO.PROJ_ID is
'项目工程ID';

comment on column T_PROJ_INFO.PROJ_LEADER is
'项目负责人';

comment on column T_PROJ_INFO.START_TIME is
'工程开工时间';

comment on column T_PROJ_INFO.END_TIME is
'工程结束时间';

comment on column T_PROJ_INFO.CREATE_TIME is
'创建时间';

comment on column T_PROJ_INFO.CREATE_USER is
'创建人';

comment on column T_PROJ_INFO.UPDATE_TIME is
'修改时间';

comment on column T_PROJ_INFO.UPDATE_USER is
'修改人';

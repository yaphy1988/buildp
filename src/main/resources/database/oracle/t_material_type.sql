drop table T_MATERIAL_TYPE cascade constraints;

/*==============================================================*/
/* Table: T_MATERIAL_TYPE                                       */
/*==============================================================*/
create table T_MATERIAL_TYPE 
(
   TYPE_ID              NUMBER(16)           not null,
   TYPE_NAME            VARCHAR2(64),
   PARENT_TYPE_ID       NUMBER(16),
   END_NODE             VARCHAR2(1),
   SORTS                NUMBER(16),
   STATUS               VARCHAR2(1),
   CREATE_TIME          DATE,
   CREATE_STAFF         VARCHAR2(32),
   UPDATE_TIME          DATE,
   UPDATE_STAFF         VARCHAR2(32),
   constraint PK_T_MATERIAL_TYPE primary key (TYPE_ID)
);

comment on table T_MATERIAL_TYPE is
'T_MATERIAL_TYPE-材料类型表，树形结构表示的材料类型';

comment on column T_MATERIAL_TYPE.TYPE_ID is
'类型编码';

comment on column T_MATERIAL_TYPE.TYPE_NAME is
'类型名称';

comment on column T_MATERIAL_TYPE.PARENT_TYPE_ID is
'父类型编码';

comment on column T_MATERIAL_TYPE.END_NODE is
'是否叶子结点,(0：非叶子结点，1：叶子结点)';

comment on column T_MATERIAL_TYPE.SORTS is
'排序';

comment on column T_MATERIAL_TYPE.STATUS is
'状态（0：无效，1：有效）';

comment on column T_MATERIAL_TYPE.CREATE_TIME is
'创建时间';

comment on column T_MATERIAL_TYPE.CREATE_STAFF is
'创建人';

comment on column T_MATERIAL_TYPE.UPDATE_TIME is
'更新时间';

comment on column T_MATERIAL_TYPE.UPDATE_STAFF is
'更新人';

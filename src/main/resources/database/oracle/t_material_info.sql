drop table T_MATERIAL_INFO cascade constraints;

/*==============================================================*/
/* Table: T_MATERIAL_INFO                                       */
/*==============================================================*/
create table T_MATERIAL_INFO 
(
   MATERIAL_ID          NUMBER(16)           not null,
   MATERIAL_NAME        VARCHAR2(64),
   MATERIAL_TYPE        NUMBER(16),
   STANDARD             VARCHAR2(32),
   STATUS               VARCHAR2(1),
   CREATE_TIME          DATE,
   CREATE_STAFF         VARCHAR2(32),
   UPDATE_TIME          DATE,
   UPDATE_STAFF         VARCHAR2(32),
   constraint PK_T_MATERIAL_INFO primary key (MATERIAL_ID)
);

comment on table T_MATERIAL_INFO is
'材料信息表';

comment on column T_MATERIAL_INFO.MATERIAL_ID is
'材料编码，seq_material_info';

comment on column T_MATERIAL_INFO.MATERIAL_NAME is
'材料名称';

comment on column T_MATERIAL_INFO.MATERIAL_TYPE is
'材料类型,t_material_type.type_id';

comment on column T_MATERIAL_INFO.STANDARD is
'规格描述';

comment on column T_MATERIAL_INFO.STATUS is
'状态（0：失效，1：有效）';

comment on column T_MATERIAL_INFO.CREATE_TIME is
'创建时间';

comment on column T_MATERIAL_INFO.CREATE_STAFF is
'创建人';

comment on column T_MATERIAL_INFO.UPDATE_TIME is
'更新时间';

comment on column T_MATERIAL_INFO.UPDATE_STAFF is
'更新人';

drop table T_SUPPLIER_INFO cascade constraints;

/*==============================================================*/
/* Table: T_SUPPLIER_INFO                                       */
/*==============================================================*/
create table T_SUPPLIER_INFO 
(
   SUPPLIER_ID          NUMBER(16)           not null,
   SUPPLIER_NAME        VARCHAR2(128),
   REGION_CODE          VARCHAR2(6),
   BUSINESS_PERMIT      VARCHAR2(64),
   BUSINESS_INTRODUCE   VARCHAR2(2048),
   STATUS               VARCHAR2(1),
   CREATE_TIME          DATE,
   CREATE_STAFF         VARCHAR2(32),
   UPDATE_TIME          DATE,
   UPDATE_STAFF         VARCHAR2(32),
   constraint PK_T_SUPPLIER_INFO primary key (SUPPLIER_ID)
);

comment on table T_SUPPLIER_INFO is
'T_SUPPLIER_INFO-供货商信息表';

comment on column T_SUPPLIER_INFO.SUPPLIER_ID is
'供货商编码';

comment on column T_SUPPLIER_INFO.SUPPLIER_NAME is
'供货商名称';

comment on column T_SUPPLIER_INFO.REGION_CODE is
'行政区域编码';

comment on column T_SUPPLIER_INFO.BUSINESS_PERMIT is
'营业执照编码';

comment on column T_SUPPLIER_INFO.BUSINESS_INTRODUCE is
'主营业务介绍';

comment on column T_SUPPLIER_INFO.STATUS is
'状态（0：无效，1：有效）';

comment on column T_SUPPLIER_INFO.CREATE_TIME is
'创建时间';

comment on column T_SUPPLIER_INFO.CREATE_STAFF is
'创建人';

comment on column T_SUPPLIER_INFO.UPDATE_TIME is
'更新时间';

comment on column T_SUPPLIER_INFO.UPDATE_STAFF is
'更新人';

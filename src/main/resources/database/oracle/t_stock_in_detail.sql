drop table T_STOCK_IN_DETAIL cascade constraints;

/*==============================================================*/
/* Table: T_STOCK_IN_DETAIL                                     */
/*==============================================================*/
create table T_STOCK_IN_DETAIL 
(
   DETAIL_ID            NUMBER(16)           not null,
   STOCK_OPT_ID         NUMBER(16),
   STOCK_ID             NUMBER(16)           not null,
   OPT_TYPE             VARCHAR2(2),
   CREATE_TIME          DATE,
   CREATE_STAFF         VARCHAR2(32),
   constraint PK_T_STOCK_IN_DETAIL primary key (DETAIL_ID)
);

comment on table T_STOCK_IN_DETAIL is
'单品进货详细,序列SEQ_STOCK_IN_DETAIL';

comment on column T_STOCK_IN_DETAIL.DETAIL_ID is
'详情ID';

comment on column T_STOCK_IN_DETAIL.STOCK_OPT_ID is
'库存量操作记录ID';

comment on column T_STOCK_IN_DETAIL.STOCK_ID is
'单品库存量ID';

comment on column T_STOCK_IN_DETAIL.OPT_TYPE is
'操作类型：01. 进货入库 02. 工程余料';

comment on column T_STOCK_IN_DETAIL.CREATE_TIME is
'创建时间';

comment on column T_STOCK_IN_DETAIL.CREATE_STAFF is
'创建人';

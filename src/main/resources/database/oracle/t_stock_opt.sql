drop table T_STOCK_OPT cascade constraints;

/*==============================================================*/
/* Table: T_STOCK_OPT                                           */
/*==============================================================*/
create table T_STOCK_OPT 
(
   STOCK_OPT_ID         NUMBER(16)           not null,
   STOCK_ID             NUMBER(16)           not null,
   SUPPLIER_ID          NUMBER(16),
   MATERIAL_ID          NUMBER(16),
   OPT_TYPE             VARCHAR2(2),
   COUNT                NUMBER(16),
   CREATE_TIME          DATE,
   CREATE_STAFF         VARCHAR2(32),
   REMARK               VARCHAR2(32),
   constraint PK_T_STOCK_OPT primary key (STOCK_OPT_ID)
);

comment on table T_STOCK_OPT is
'单品库存操作记录表，序列SEQ_STOCK_OPT';

comment on column T_STOCK_OPT.STOCK_OPT_ID is
'库存量操作记录ID';

comment on column T_STOCK_OPT.STOCK_ID is
'单品库存量ID';

comment on column T_STOCK_OPT.SUPPLIER_ID is
'供货商编码';

comment on column T_STOCK_OPT.MATERIAL_ID is
'材料编码';

comment on column T_STOCK_OPT.OPT_TYPE is
'操作类型:01. 入库 02. 出库';

comment on column T_STOCK_OPT.COUNT is
'操作数量';

comment on column T_STOCK_OPT.CREATE_TIME is
'创建时间';

comment on column T_STOCK_OPT.CREATE_STAFF is
'创建人';

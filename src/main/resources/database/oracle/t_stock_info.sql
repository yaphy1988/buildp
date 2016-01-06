drop table T_STOCK_INFO cascade constraints;

/*==============================================================*/
/* Table: T_STOCK_INFO                                          */
/*==============================================================*/
create table T_STOCK_INFO 
(
   STOCK_ID             NUMBER(16)           not null,
   MATERIAL_ID          NUMBER(16)           not null,
   SUPPLIER_ID          NUMBER(16),
   COUNT                NUMBER(10),
   AVAIL_COUNT          NUMBER(10),
   CREATE_TIME          DATE,
   CREATE_USER          VARCHAR2(32),
   UPDATE_TIME          DATE,
   UPDATE_USER          VARCHAR2(32),
   constraint PK_T_STOCK_INFO primary key (STOCK_ID),
   constraint PK_T_STOCK_INFO2 unique (MATERIAL_ID)
);

comment on table T_STOCK_INFO is
'材料单品库存量，序列SEQ_STOCK_INFO';

comment on column T_STOCK_INFO.STOCK_ID is
'单品库存量ID';

comment on column T_STOCK_INFO.MATERIAL_ID is
'材料编码';

comment on column T_STOCK_INFO.SUPPLIER_ID is
'供货商编码';

comment on column T_STOCK_INFO.COUNT is
'实际库存总数量';

comment on column T_STOCK_INFO.AVAIL_COUNT is
'可用库存总数量';

comment on column T_STOCK_INFO.CREATE_TIME is
'创建时间';

comment on column T_STOCK_INFO.CREATE_USER is
'创建人';

comment on column T_STOCK_INFO.UPDATE_TIME is
'修改时间';

comment on column T_STOCK_INFO.UPDATE_USER is
'修改人';

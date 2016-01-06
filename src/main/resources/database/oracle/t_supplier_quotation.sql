drop table T_SUPPLIER_QUOTATION cascade constraints;

/*==============================================================*/
/* Table: T_SUPPLIER_QUOTATION                                  */
/*==============================================================*/
create table T_SUPPLIER_QUOTATION 
(
   QUOTATION_ID         NUMBER(16)           not null,
   PROJECT_ID           VARCHAR2(32),
   QUOTATION_BATCH      NUMBER(16),
   SUPPLIER_ID          NUMBER(16),
   MATERIAL_ID          NUMBER(16),
   UNIT_PRICE           NUMBER(16),
   AMOUNT               NUMBER(8),
   MEASURE_CODE         VARCHAR2(8),
   TOTAL_PRICE          NUMBER(16),
   CREATE_TIME          DATE,
   CREATE_USER          NUMBER(16),
   UPDATE_TIME          DATE,
   UPDATE_USER          NUMBER(16),
   constraint PK_T_SUPPLIER_QUOTATION primary key (QUOTATION_ID)
);

comment on table T_SUPPLIER_QUOTATION is
'T_SUPPLIER_QUOTATION-供货商报价单';

comment on column T_SUPPLIER_QUOTATION.QUOTATION_ID is
'序列号，SEQ_SUPPLIER_QUOTATION';

comment on column T_SUPPLIER_QUOTATION.PROJECT_ID is
'项目编码，关联项目编码';

comment on column T_SUPPLIER_QUOTATION.QUOTATION_BATCH is
'报价批号，关联项目进货批次';

comment on column T_SUPPLIER_QUOTATION.SUPPLIER_ID is
'供货商编码';

comment on column T_SUPPLIER_QUOTATION.MATERIAL_ID is
'材料编码';

comment on column T_SUPPLIER_QUOTATION.UNIT_PRICE is
'单价';

comment on column T_SUPPLIER_QUOTATION.AMOUNT is
'数量';

comment on column T_SUPPLIER_QUOTATION.MEASURE_CODE is
'度量单位';

comment on column T_SUPPLIER_QUOTATION.TOTAL_PRICE is
'总价';

comment on column T_SUPPLIER_QUOTATION.CREATE_TIME is
'创建时间';

comment on column T_SUPPLIER_QUOTATION.CREATE_USER is
'创建人';

comment on column T_SUPPLIER_QUOTATION.UPDATE_TIME is
'更新时间';

comment on column T_SUPPLIER_QUOTATION.UPDATE_USER is
'更新人';

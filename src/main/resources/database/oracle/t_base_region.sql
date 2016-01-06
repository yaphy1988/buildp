drop table T_BASE_REGION cascade constraints;

/*==============================================================*/
/* Table: T_BASE_REGION                                         */
/*==============================================================*/
create table T_BASE_REGION 
(
   REGION_CODE          VARCHAR2(12)         not null,
   REGION_NAME          VARCHAR2(64),
   PARENT_CODE          VARCHAR2(12),
   INITIAL_CHAR         VARCHAR2(2),
   INITIAL_PINYIN       VARCHAR2(32),
   FULL_PINYIN          VARCHAR2(128),
   REGION_SUFFIX        VARCHAR2(64),
   AREA_CODE            VARCHAR2(4),
   ORDER_NUM            NUMBER(6),
   constraint PK_T_BASE_REGION primary key (REGION_CODE)
);

comment on table T_BASE_REGION is
'T_BASE_REGION-行政区域表';

comment on column T_BASE_REGION.REGION_CODE is
'行政区域编码';

comment on column T_BASE_REGION.REGION_NAME is
'行政区域名称';

comment on column T_BASE_REGION.PARENT_CODE is
'上级区域编码';

comment on column T_BASE_REGION.INITIAL_CHAR is
'首字母';

comment on column T_BASE_REGION.INITIAL_PINYIN is
'首字母拼音';

comment on column T_BASE_REGION.FULL_PINYIN is
'拼音全称';

comment on column T_BASE_REGION.REGION_SUFFIX is
'区域名称后缀';

comment on column T_BASE_REGION.AREA_CODE is
'区号';

comment on column T_BASE_REGION.ORDER_NUM is
'排序';

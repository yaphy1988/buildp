drop table T_MEASURE_UNITS cascade constraints;

/*==============================================================*/
/* Table: T_MEASURE_UNITS                                       */
/*==============================================================*/
create table T_MEASURE_UNITS 
(
   MEASURE_CODE         VARCHAR2(8)          not null,
   MEASURE_NAME         VARCHAR2(32),
   MEASURE_TYPE         VARCHAR2(2),
   MEASURE_TYPE_NAME    VARCHAR2(32),
   MEASURE_REMARK       VARCHAR2(256),
   constraint PK_T_MEASURE_UNITS primary key (MEASURE_CODE)
);

comment on table T_MEASURE_UNITS is
'T_MEASURE_UNITS-度量单位定义表，材料计量单位，项目工程计量，预算计量单位';

comment on column T_MEASURE_UNITS.MEASURE_CODE is
'度量单位编码';

comment on column T_MEASURE_UNITS.MEASURE_NAME is
'度量单位名称';

comment on column T_MEASURE_UNITS.MEASURE_TYPE is
'度量类型（01：长度，02：面积，03：体积，04：容量，05：质量，06：数量，99：其他）';

comment on column T_MEASURE_UNITS.MEASURE_TYPE_NAME is
'度量类型名称';

comment on column T_MEASURE_UNITS.MEASURE_REMARK is
'备注';

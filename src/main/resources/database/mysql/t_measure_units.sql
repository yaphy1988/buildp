drop table t_measure_units;

/*==============================================================*/
/* table: t_measure_units                                       */
/*==============================================================*/
create table t_measure_units 
(
   measure_code         varchar(8) primary key not null comment '度量单位编码',
   measure_name         varchar(32)						comment '度量单位名称',
   measure_type         varchar(2)						comment '度量类型（01：长度，02：面积，03：体积，04：容量，05：质量，06：数量，99：其他）',
   measure_type_name    varchar(32)						comment '度量类型名称',
   measure_remark       varchar(256)					comment '备注'
);

alter table `t_measure_units` 
comment = 't_measure_units-度量单位定义表，材料计量单位，项目工程计量，预算计量单位';
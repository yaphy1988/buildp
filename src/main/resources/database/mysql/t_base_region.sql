drop table t_base_region;

/*==============================================================*/
/* table: t_base_region                                         */
/*==============================================================*/
create table t_base_region 
(
   region_code          varchar(12) primary key not null 	comment '行政区域编码',
   region_name          varchar(64)							comment '行政区域名称',
   parent_code          varchar(12)							comment '父区域编码',
   initial_char         varchar(2)							comment '首字母',
   initial_pinyin       varchar(32)							comment '首字母拼音',
   full_pinyin          varchar(128)						comment '拼音全称',
   region_suffix        varchar(64)							comment '区域名称后缀',
   area_code            varchar(4)							comment '区号',
   order_num            int(6)								comment '排序'
);

alter table `t_base_region` 
comment = 't_base_region-行政区域表';
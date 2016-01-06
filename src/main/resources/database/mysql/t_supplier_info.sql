drop table t_supplier_info;

/*==============================================================*/
/* table: t_supplier_info                                       */
/*==============================================================*/
create table t_supplier_info 
(
   supplier_id          bigint(16) auto_increment primary key not null	comment '供应商id',
   supplier_name        varchar(128)									comment '供应商名称',
   region_code          varchar(6)										comment '行政区域编码',
   business_permit      varchar(64)										comment '营业执照编码',
   business_introduce   varchar(2048)									comment '主营业务介绍',
   status               varchar(1)										comment '状态：0-无效，1-有效',
   create_time          datetime										comment '创建时间',
   create_staff         varchar(32)										comment '创建人',
   update_time          datetime										comment '更新时间',
   update_staff         varchar(32)										comment '更新人'
);

alter table t_supplier_info
comment = 't_supplier_info-供货商信息表';

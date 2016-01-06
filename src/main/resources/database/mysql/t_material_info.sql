drop table t_material_info;

/*==============================================================*/
/* table: t_material_info                                       */
/*==============================================================*/
create table t_material_info 
(
   material_id          bigint(16) auto_increment primary key not null	comment '材料编码',
   material_name        varchar(64)										comment '材料名称',
   material_type        bigint(16)										comment '材料类型，t_material_type.type_id',
   standard             varchar(32)										comment '规格描述',
   status               varchar(1)										comment '状态',
   create_time          datetime										comment '创建时间',
   create_staff         varchar(32)										comment '创建人',
   update_time          datetime										comment '更新时间',
   update_staff         varchar(32)										comment '更新人'
);

alter table `t_material_info` 
comment = '材料信息表';
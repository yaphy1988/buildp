drop table t_material_type;

/*==============================================================*/
/* table: t_material_type                                       */
/*==============================================================*/
create table t_material_type 
(
   type_id              bigint(16) auto_increment primary key not null	comment '类型编码',
   type_name            varchar(64)										comment '类型名称',
   parent_type_id       bigint(16)										comment '父类型编码',
   end_node             varchar(1)										comment '是否叶子节点',
   sorts                bigint(16)										comment '排序',
   status               varchar(1)										comment '状态',
   create_time          datetime										comment '创建时间',
   create_staff         varchar(32)										comment '创建人',
   update_time          datetime										comment '更新时间',
   update_staff         varchar(32)										comment '更新人'
);

alter table `t_material_type` 
comment = 't_material_type-材料类型表，树形结构表示的材料类型';
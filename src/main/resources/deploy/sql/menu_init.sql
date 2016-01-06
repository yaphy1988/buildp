---------------------------------------------------------------
-- 系统菜单基础信息初始化
---------------------------------------------------------------
delete from t_auth_menu where menu_id <> 1;

-- 系统管理模块菜单
insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (110001,100000,'用户管理','user/usermanage','0',1,'用户管理', sysdate());
insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (110002,100000,'权限分配','manager/allroles','0',1,'权限分配', sysdate());
insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (110003,100000,'参数维护','base/paramcfg','0',1,'参数维护', sysdate());

-- 供货商管理模块菜单120000开头
insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (120001,100000,'供货商信息','supplier/info','0',1,'供货商信息', sysdate());

-- 材料管理模块菜单130000开头
insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (130001,100000,'材料类型维护','material/types','0',1,'材料类型维护', sysdate());
insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (130002,100000,'材料信息','material/infos','0',1,'材料信息', sysdate());

-- 库存管理模块菜单140000开头
insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (140001,100000,'库存管理','stock/manager','1',1,'库存管理', sysdate());

insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (140011, 140001, '库存操作查询', 'stock/opthis', '2', 2, '库存操作查询', sysdate());

insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (140021, 140001, '库存信息查询', 'stock/manager', '2', 1, '库存信息查询', sysdate());

insert into t_auth_menu(menu_id,parent_menu,menu_name,menu_url,menu_level,order_num,remark,create_time)
values (140031, 140001, '出入库操作', 'stock/option', '2', 3, '出入库库操作', sysdate());

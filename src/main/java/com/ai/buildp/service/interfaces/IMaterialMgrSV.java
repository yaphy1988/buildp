package com.ai.buildp.service.interfaces;

import java.util.List;

import com.ai.buildp.dao.model.PageInfo;
import com.ai.buildp.dao.model.TMaterialInfo;
import com.ai.buildp.dao.model.TMaterialType;
import com.ai.buildp.model.view.TMaterialInfoView;
import com.ai.buildp.model.view.TMaterialTypeView;

public interface IMaterialMgrSV {

    /**
     * 查询材料类型信息
     * @return
     * Date: 2015年2月27日 <br>
     * @author xuanjian
     */
    public List<TMaterialType> getMaterialType();
    
    /**
     * 获取材料信息
     * @return
     * Date: 2015年3月2日 <br>
     * @author xuanjian
     */
    public List<TMaterialInfo> getAllMaterialInfo();
    
    /**
     * 根据typeId删除材料类型
     * @param typeId
     * Date: 2015年3月6日 <br>
     * @author huangguozhu
     */
    public boolean deleteMaterialTypeById(Long typeId);
    
    /**
     * 根据materialId删除材料信息
     * @param record
     * Date: 2015年3月6日 <br>
     * @author huangguozhu
     */
    public boolean deleteMaterialInfoById(Long materialId);
    
    /**
     * 添加材料类型
     * @param record
     * Date: 2015年3月6日 <br>
     * @author huangguozhu
     */
    public boolean addMaterialType(TMaterialType record);
    
    /**
     * 添加材料信息
     * @param record
     * Date: 2015年3月6日 <br>
     * @author huangguozhu
     */
    public boolean addMaterialInfo(TMaterialInfo record);
    
    /**
	 * 按照分页获取类型，返回一页的角色数据
	 * @return
	 */
    public void getTypesPerPage(PageInfo<TMaterialTypeView> pageInfo, TMaterialTypeView param);
    
    /**
	 * 按照分页获取材料信息，返回一页的角色数据
	 * @return
	 */
    public void getInfosPerPage(PageInfo<TMaterialInfoView> pageInfo, TMaterialInfoView param);
    
    /**
     * 根据材料信息id获取材料信息对象
     * @param materialId
     * @return
     */
    public TMaterialInfo getInfoByMaterialId(Long materialId);
    
    /**
     * 更新材料信息
     * @param info
     * @return
     */
    public boolean updateMaterilInfo(TMaterialInfo info);
    
    /**
     * 根据材料类型id获取材料类型对象
     * @param materialId
     * @return
     */
    public TMaterialType getTypeByTypeId(Long typeId);
 
    /**
     * 更新材料类型
     * @param type
     * @return
     */
    public boolean updateMaterilType(TMaterialType type);
    
    /**
     * 判断类型名称是否存在
     * @return
     */
    public boolean isExistTypeName(String typeName);
}

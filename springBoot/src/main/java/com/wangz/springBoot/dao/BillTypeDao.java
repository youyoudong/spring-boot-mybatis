package com.wangz.springBoot.dao;

import com.wangz.springBoot.bean.BillType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 账单分类DAO
 * Created by wangz on 2017/10/16.
 */
@Mapper
public interface BillTypeDao {

    /**
     * 插入账单分类信息
     * @param bt
     */
    void insertBillType(BillType bt);

    /**
     * 查询账单分类名称是否重复
     * @param name
     * @return
     */
    int selectBillTypeByName(String name);

    /**
     * 查询所有一级账单分类
     * @return list<BillType>
     */
    List<BillType> selectAllParentBillType();

    /**
     * 查询一级账单分类下的所有二级账单分类
     * @param parentId
     * @return list<BillType>
     */
    List<BillType> selectAllChildBillType(String parentId);

    /**
     * 修改账单分类名称
     * @param billType
     * @return
     */
    int updateBillType(BillType billType);
}

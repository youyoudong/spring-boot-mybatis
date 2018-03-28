package com.wangz.springBoot.service;

import com.wangz.springBoot.bean.BillType;
import com.wangz.springBoot.dao.BillTypeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * 账单分类Service
 * Created by wangz on 2017/10/17.
 */
@Service
public class BillTypeService {

    @Autowired
    private BillTypeDao billTypeDao;

    /**
     * 插入账单分类信息
     * @param bt
     */
    public void insertBillType(BillType bt){
        String id = UUID.randomUUID().toString().replaceAll("-", "");
        bt.setId(id);
        this.billTypeDao.insertBillType(bt);
    }

    /**
     * 查询账单分类名称是否重复
     * @param name
     * @return
     */
    public int selectBillTypeByName(String name){
        return this.billTypeDao.selectBillTypeByName(name);
    }

    /**
     * 查询所有一级账单分类
     * @return list<BillType>
     */
    public List<BillType> selectAllParentBillType(){
        return this.billTypeDao.selectAllParentBillType();
    }

    /**
     * 查询一级账单分类下的所有二级账单分类
     * @param parentId
     * @return list<BillType>
     */
    public List<BillType> selectAllChildBillType(String parentId){
        return this.billTypeDao.selectAllChildBillType(parentId);
    }

    /**
     * 修改账单分类名称
     * @param billType
     * @return
     */
    public int updateBillType(BillType billType){
        return this.billTypeDao.updateBillType(billType);
    }

    /**
     * 根据id获取账单分类信息
     * @param id
     * @return
     */
    public BillType selectBillTypeById(String id){
        return this.billTypeDao.selectBillTypeById(id);
    }

    /**
     * 分页查询billtype
     * @return list<BillType>
     */
    public List<BillType> getPageList(){
        return this.billTypeDao.getPageList();
    }
}

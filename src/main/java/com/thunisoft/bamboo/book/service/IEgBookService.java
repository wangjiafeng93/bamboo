package com.thunisoft.bamboo.book.service;

import java.util.List;

import com.thunisoft.bamboo.pojo.EgBook;

/**
 * 
 * IEgBookService
 *
 * @description 图书列表
 * @author artery6一键生成
 * @author huayu
 * @date 2019年05月13日 21:45
 * @version 1.0
 */
public interface IEgBookService {

    /**
     * 根据主键查询
     * 
     * @param id
     * @return
     */
    public EgBook selectByPrimaryKey(String id);

    /**
     * 查询所有
     * 
     * @return
     */
    public List<EgBook> selectAll();

    /**
     * 根据主键更新
     * 
     * @param egBook
     * @return
     */
    public int updateByPrimaryKey(EgBook egBook);

    /**
     * 删除所有
     * 
     * @param id
     * @return
     */
    public int deleteByPrimaryKey(String id);
    
    /**
     * 插入
     * 
     * @param jzglLog
     * @return
     */
    public int insert(EgBook egBook);
}
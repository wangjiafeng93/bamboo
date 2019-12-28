package com.thunisoft.bamboo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.thunisoft.artery.data.mybatis.page.BaseMapper;
import com.thunisoft.bamboo.pojo.EgBook;

/**
 * 
 * EgBookMapper
 * 
 * @description EgBookMapper
 * @author  huayu
 * @date 2019年05月13日 21:45
 * @version 1.0
 */
@Mapper
public interface EgBookMapper extends BaseMapper<EgBook, String> {

    
}

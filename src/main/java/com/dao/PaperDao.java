package com.dao;

import com.pojo.Paper;

import java.util.List;

/**
 *   @author Young
 *   @date 2019/3/7 15:44
 *   @description：DAO层
*/
public interface PaperDao {
    //新增Paper
    int addPaper(Paper paper);
    //删除Paper
    int deletePaperById(long id);
    //修改Paper
    int updatePaper(Paper paper);
    //根据编号查询Paper
    Paper queryById(long id);
    //查询全部Paper
    List<Paper> queryAllPaper();
}

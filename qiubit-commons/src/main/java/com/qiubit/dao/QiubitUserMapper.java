package com.qiubit.dao;

import com.qiubit.pojo.QiubitUser;
import com.qiubit.pojo.QiubitUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QiubitUserMapper {
    long countByExample(QiubitUserExample example);

    int deleteByExample(QiubitUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(QiubitUser record);

    int insertSelective(QiubitUser record);

    List<QiubitUser> selectByExample(QiubitUserExample example);

    QiubitUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") QiubitUser record, @Param("example") QiubitUserExample example);

    int updateByExample(@Param("record") QiubitUser record, @Param("example") QiubitUserExample example);

    int updateByPrimaryKeySelective(QiubitUser record);

    int updateByPrimaryKey(QiubitUser record);
}
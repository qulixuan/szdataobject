package com.sto.szdataobject.dao;

import com.sto.szdataobject.model.pojo.priceDao;
import org.springframework.stereotype.Repository;

@Repository
public interface priceDaoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbg.generated Wed May 20 11:03:42 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbg.generated Wed May 20 11:03:42 CST 2020
     */
    int insert(priceDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbg.generated Wed May 20 11:03:42 CST 2020
     */
    int insertSelective(priceDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbg.generated Wed May 20 11:03:42 CST 2020
     */
    priceDao selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbg.generated Wed May 20 11:03:42 CST 2020
     */
    int updateByPrimaryKeySelective(priceDao record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table price
     *
     * @mbg.generated Wed May 20 11:03:42 CST 2020
     */
    int updateByPrimaryKey(priceDao record);

    priceDao selectInfo(priceDao price);
}
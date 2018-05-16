package com.mycollab.module.user.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.user.domain.Role;
import com.mycollab.module.user.domain.RoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface RoleMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    long countByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    int deleteByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    int insert(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    int insertSelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    List<Role> selectByExample(RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    Role selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    int updateByPrimaryKeySelective(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    int updateByPrimaryKey(Role record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    Integer insertAndReturnKey(Role value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table s_roles
     *
     * @mbg.generated Fri Dec 01 20:52:17 ICT 2017
     */
    void massUpdateWithSession(@Param("record") Role record, @Param("primaryKeys") List primaryKeys);
}
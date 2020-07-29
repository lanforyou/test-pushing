package com.lank.demo.sys.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lank.demo.sys.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 系统用户 Mapper 接口
 * </p>
 *
 * @author ljx
 * @since 2019-05-29
 */
public interface UserMapper extends BaseMapper<User> {
    @Select("select * from sys_user")
    List<Map<String, Object>> getAllUser();

    List<Map<String, Object>> getAllByXml(@Param("id") Long id);

    IPage<User> selectPageVo(Page page, @Param("username") String username);
}

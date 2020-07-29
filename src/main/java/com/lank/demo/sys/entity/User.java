package com.lank.demo.sys.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;

import java.time.LocalDateTime;

import com.lank.demo.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 系统用户
 * </p>
 *
 * @author ljx
 * @since 2019-05-29
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("sys_user")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;
    /**
     * 用户名
     */
    private String nickname;

    /**
     * 登录用户名
     */
    private String username;

    /**
     * 登录密码
     */
    private String loginPassword;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 用户所在机构
     */
    private Long userOrgId;

    /**
     * 状态(0-初始,1:正常,-1:注销,-2:锁定,-3:过期,-4:无效)
     */
    private Boolean userStatus;

    /**
     * 记录版本号
     */
    private Long ver;

    /**
     * 删除标志
     */
    @TableLogic
    @TableField("is_deleted")
    private boolean deleted;

    /**
     * 记录创建者
     */
    private Long creator;

    /**
     * 记录修改者
     */
    private Long modifier;

    /**
     * 记录创建时间
     */
    private LocalDateTime utcCreated;

    /**
     * 记录修改时间
     */
    private LocalDateTime utcModified;
}

package com.highjet.modules.accounting.rc.entity;

    import com.highjet.common.entity.BaseEntity;
    import com.baomidou.mybatisplus.annotation.TableName;
    import com.baomidou.mybatisplus.annotation.TableField;
    import lombok.Data;
    import lombok.EqualsAndHashCode;
    import lombok.experimental.Accessors;

/**
* <p>
    * 表描述表
    * </p>
*
* @author ljx
* @since 2020-07-16
*/
    @Data
        @EqualsAndHashCode(callSuper = true)
    @Accessors(chain = true)
    @TableName("TDT_TABLE")
    public class TdtTable extends BaseEntity {

    private static final long serialVersionUID = 1L;

            /**
            * 表id
            */
        @TableField("ID")
    private String id;

            /**
            * 包含所有内容，通常是json字符串，
            */
        @TableField("CONTENT")
    private String content;

        @TableField("COLUMNS")
    private String columns;

            /**
            * 包含所有内容，通常是json字符串，
            */
        @TableField("SELECT_SQL")
    private String selectSql;


}

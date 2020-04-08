package com.example.mpd.model;


import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.annotation.*;
import com.example.mpd.mapper.handler.JSONTypeHandler;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author EDZ
 */
@Data
@TableName(value = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -5223436669413172015L;

    @TableId(value = "student_number",type = IdType.AUTO)
    private Integer studentNumber;

    @TableField(value = "name",updateStrategy = FieldStrategy.IGNORED)
    private String name;

    @TableField(value = "address",updateStrategy = FieldStrategy.NOT_NULL)
    private String address;

    @TableField(value = "create_time",fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(value = "update_time",fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableField(value = "detail_info",typeHandler = JSONTypeHandler.class)
    private JSONObject detailInfo;
}

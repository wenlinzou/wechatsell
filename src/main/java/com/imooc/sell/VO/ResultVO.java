package com.imooc.sell.VO;

import lombok.Data;

/** http返回的最外层对象
 * @description
 * @author mqliu
 * @date 2018/10/29 15:14
 */
@Data
public class ResultVO<T> {
    /**错误码*/
    private Integer code;
    /**提示信息*/
    private String msg;
    /**具体内容*/
    private T data;
}

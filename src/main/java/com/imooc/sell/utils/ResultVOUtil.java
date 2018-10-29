package com.imooc.sell.utils;

import com.imooc.sell.VO.ResultVO;

/**
 * @description
 * @author mqliu
 * @date 2018/10/29 15:49
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer code, String message) {
        ResultVO resultVO = new ResultVO();
        resultVO.setMsg(message);
        resultVO.setCode(code);
        return resultVO;
    }
}

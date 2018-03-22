package ForController;

import Util.CastUtil;

import java.util.Map;


public class Param {
    private Map<String, Object> paramMap;

    /**
     * 构造函数
     *
     * @param paramMap
     */
    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取long型参数值
     *
     * @param name
     * @return
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     *
     * @return
     */
    public Map<String, Object> getParamMap() {
        return paramMap;
    }
}

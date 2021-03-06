package ForController;

import java.util.HashMap;
import java.util.Map;


public class View {
    /**
     * 视图路径
     */
    private String path;
    /**
     * 模型数据
     */
    private Map<String, Object> model;

    /**
     * 构造函数
     *
     * @param path
     */
    public View(String path) {
        this.path = path;
        model = new HashMap<String, Object>();
    }

    /**
     * 根据key和value 生成View
     *
     * @param key
     * @param value
     * @return ForController.View
     */
    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

    /**
     * 获取路径
     *
     * @return
     */
    public String getPath() {
        return path;
    }

    /**
     * 获取model
     *
     * @return Map<String, Object>
     */
    public Map<String, Object> getModel() {
        return model;
    }
}

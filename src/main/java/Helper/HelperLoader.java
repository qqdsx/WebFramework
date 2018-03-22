package Helper;

import Util.ClassUtil;

public final class HelperLoader {
    //初始化，加载类
    public static void init(){
        Class<?> [] classList = {ClassHelper.class, BeanHelper.class, AopHelper.class,IocHelper.class, ControllerHelper.class,};
        for (Class<?> cls: classList) {
            ClassUtil.loadClass(cls.getName(),true);
        }
    }
}

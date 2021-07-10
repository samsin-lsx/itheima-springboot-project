package com.itheima.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 * 说明：自定义条件控制类，如果返回true则@Conditional标注的类不执行，否则就执行
 * @author：李尚兴
 * @date：2021-07-09 8:33
 * @version：1.0
 */
public class ClassCondition implements Condition {
    /**
     * 匹配条件是否满足
     * @param conditionContext 上下文对象，可以获取环境信息、类加载器、BeanFactory等
     * @param annotatedTypeMetadata 注解元数据对象，可以获取注解中属性值
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 1.需求：导入Jedis坐标后创建UserBean对象
        // 2.需求：导入任意指定坐标后才创建Bean对象，否则不创建
        boolean flag = true;
        // 获取注解元对象中的属性值
        Map<String, Object> annotationAttributesMap = annotatedTypeMetadata.getAnnotationAttributes(ConditionOnClass.class.getName());
        String[] valueArray = (String[]) annotationAttributesMap.get("value");
        try {
            for (String className : valueArray) {
                // 判断redis.clients.jedis.Jedis文件是否已经存在，利用异常进行处理
                Class.forName(className);
            }
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;
    }
}

package com.itheima.springboot.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 说明：字节码条件控制类，如果返回true则@Conditional标注的类不执行，否则就执行
 * @author：李尚兴
 * @date：2021-07-09 8:33
 * @version：1.0
 */
public class ClassCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 1.需求：导入Jedis坐标后创建UserBean对象
        boolean flag = true;
        // 判断redis.clients.jedis.Jedis文件是否已经存在，利用异常进行处理
        try {
            Class.forName("redis.clients.jedis.Jedis");
        } catch (ClassNotFoundException e) {
            flag = false;
        }
        return flag;
    }
}

package com.itheima.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 实现ImportSelector接口导入Bean对象
 * @Auther: Administrator
 * @Date: 2021/7/11 00:33
 * @Version: 1.0
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {"com.itheima.bean.Customer", "com.itheima.bean.Member"};
    }
}

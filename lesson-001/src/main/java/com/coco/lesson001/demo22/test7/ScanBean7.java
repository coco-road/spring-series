package com.coco.lesson001.demo22.test7;

import com.coco.lesson001.demo22.test4.IService;
import com.coco.lesson001.demo22.test6.beans.ScanClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@ComponentScan(basePackageClasses = ScanClass.class)
@ComponentScan(
        useDefaultFilters = false, //不启用默认过滤器
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = IService.class)
        })
public class ScanBean7 {
}

package com.coco.lesson001.demo25.test1;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({BeanConfig1.class,BeanConfig2.class})
@Configuration
public class MainConfig1 {
}

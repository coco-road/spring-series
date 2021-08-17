package com.coco.lesson001.demo24.test1;

import com.coco.lesson001.demo24.test1.Service1;
import com.coco.lesson001.demo24.test1.Service2;
import org.springframework.context.annotation.Import;

@Import({Service1.class, Service2.class})
public class MainConfig1 {
}

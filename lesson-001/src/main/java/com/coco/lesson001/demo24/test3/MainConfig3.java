package com.coco.lesson001.demo24.test3;

import com.coco.lesson001.demo24.test3.module1.CompontentScanModule1;
import com.coco.lesson001.demo24.test3.module2.CompontentScanModule2;
import org.springframework.context.annotation.Import;

@Import({CompontentScanModule1.class, CompontentScanModule2.class})
public class MainConfig3 {
}

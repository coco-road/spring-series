package com.coco.lesson001.demo24.test8;

import org.springframework.context.annotation.Import;

@Import({
        DeferredImportSelector1.class,
        DeferredImportSelector2.class,
})
public class MainConfig8 {
}

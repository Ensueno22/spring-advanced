package hello.advanced.callback;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallBackTest {

    @Test
    public void callback() {
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(() -> log.info("비지니스1 실행"));
    }

}

package hello.advanced.strategy;

import hello.advanced.template.AbstractTemplate;
import hello.advanced.template.SubClassLogic1;
import hello.advanced.template.SubClassLogic2;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class StrategyTest {

    @Test
    void templateMethodV1() {
        logic1();
        logic2();
    }

    @Test
    void templateMethodV2(){

        ContextV0 context = new ContextV0(() -> log.info("call 호출 2번 메소드"));
        context.execute();
    }

    private void logic1() {
        long startTime = System.currentTimeMillis();

        log.info("비지니스 로직1 실행");

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }

    private void logic2() {
        long startTime = System.currentTimeMillis();

        log.info("비지니스 로직2 실행");

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }

}

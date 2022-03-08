package hello.advanced.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ContextV0 {

    private StrategyV0 strategyV0;

    public ContextV0(StrategyV0 strategyV0) {
        this.strategyV0 = strategyV0;
    }

    public void execute(){
        long startTime = System.currentTimeMillis();

        // 비지니스 로직의 공통화
        strategyV0.call();

        long endTime = System.currentTimeMillis();
        long resultTime = endTime - startTime;
        log.info("resultTime={}", resultTime);
    }
}

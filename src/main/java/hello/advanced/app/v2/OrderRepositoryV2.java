package hello.advanced.app.v2;

import hello.advanced.hellotrace.HelloTraceV2;
import hello.advanced.trace.TraceId;
import hello.advanced.trace.TraceStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class OrderRepositoryV2 {

    private final HelloTraceV2 trace;

    public void save(TraceId id, String itemId) {
        //저장 로직

        TraceStatus status = null;

        try {
            status = trace.beginSync(id, "OrderRepository.request()");
            if (itemId.equals("ex")) {
                throw new IllegalStateException("예외 발생!");
            }
            trace.end(status);
            sleep(1000);
        } catch (Exception e) {
            trace.exception(status, e);
            throw e; // 예외를 다시 던져주어야 합니다.
        }

    }

    private void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

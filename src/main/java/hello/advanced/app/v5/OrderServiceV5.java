package hello.advanced.app.v5;

import hello.advanced.trace.callback.LogTemplate;
import hello.advanced.trace.callback.TraceCallBack;
import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceV5 {

    private final OrderRepositoryV5 orderRepository;
    private LogTemplate logTemplate;

    public OrderServiceV5(OrderRepositoryV5 orderRepository, LogTrace logTrace) {
        this.orderRepository = orderRepository;
        this.logTemplate = new LogTemplate(logTrace);

    }

    public void orderItem(String itemId) {
        logTemplate.execute("OrderService.request()", () -> {
            orderRepository.save(itemId);
            return null;
        });
    }
}

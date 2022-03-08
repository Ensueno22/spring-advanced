package hello.advanced.template;

import org.junit.jupiter.api.Test;

public class SubClassLogic1 extends AbstractTemplate {

    @Override
    public void call() {
        System.out.println("비지니스 로직 1");
    }

}

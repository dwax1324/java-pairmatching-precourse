package pairmatching;

import pairmatching.controller.Controller;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO 구현 진행
        Controller controller = new Controller(new InputView(), new OutputView());
        controller.run();
    }
}

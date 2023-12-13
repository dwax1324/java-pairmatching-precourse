package pairmatching.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {
    public String read() {
        return Console.readLine();
    }

    public String readAndNotify(String s) {
        System.out.println(s);
        return Console.readLine();
    }
}

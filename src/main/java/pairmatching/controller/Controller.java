package pairmatching.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pairmatching.domain.MatchingComputer;
import pairmatching.utils.Parser;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Controller {

    private final InputView inputView;
    private final OutputView outputView;
    private MatchingComputer matchingComputer;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        List<String> backendCrews = setTestData("src/main/resources/backend-crew.md");
        List<String> frontendCrews = setTestData("src/main/resources/frontend-crew.md");
        matchingComputer = new MatchingComputer(frontendCrews, backendCrews);
        outputView.printMainScreen();
        try {
            handleCommand();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    private void handleCommand() {
        String input = inputView.read();
        if (input.equals("Q")) {
            return;
        }
        if (input.equals("1")) {
            matchingSubControl();
        }
        if (input.equals("2")) {
//            matchingSubControl();
        }
        if (input.equals("3")) {
//            matchingSubControl();
        }
    }

    private void matchingSubControl() {
        outputView.printMatchingScreen();
        String input = inputView.readAndNotify("과정, 레벨, 미션을 선택하세요.\n"
                + "ex) 백엔드, 레벨1, 자동차경주\n");
        List<String> s = Parser.parseStringByDelimiter(input, ",");

        if (matchingComputer.hasMission(s.get(2)) && !rematch()) {
            return;
        }
        matchingComputer.setM
    ission(input);
        outputView.printMatchingResult();
    }

    private boolean rematch() {
        String YES = "네";
        String NO = "아니오";
        String input = inputView.readAndNotify("매칭 정보가 있습니다. 다시 매칭하시겠습니까?\n"
                + "네 | 아니오");
        if (input.equals(YES)) {
            return true;
        }
    }

    private List<String> setTestData(String filePath) {
        File file = new File(filePath);
        List<String> ret = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                ret.add(line);
            }
            return ret;
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR]");
        }
        return null;
    }
}
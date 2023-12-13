package pairmatching.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class Controller {

    private final InputView inputView;
    private final OutputView outputView;

    public Controller(InputView inputView, OutputView outputView){
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run(){
        setTestData();
        outputView.printMainScreen();
        String input = inputView.read();
        if(input.equals("Q")){
            return;
        }
        if(input.equals("1")){
            matchingSubControl();
        }
        if(input.equals("2")){
//            matchingSubControl();
        }
        if(input.equals("3")){
//            matchingSubControl();
        }
    }

    private void setTestData() {
        String filePath = "src/main/resources/backend-crew.md";
        File file = new File(filePath);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR]");
        }
    }

    private void matchingSubControl() {
        outputView.printMatchingScreen();
        String input = inputView.readAndNotify("과정, 레벨, 미션을 선택하세요.\n"
                + "ex) 백엔드, 레벨1, 자동차경주\n");
        outputView.printMatchingResult();
    }
}

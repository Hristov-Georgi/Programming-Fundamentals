package ListsTraining;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MoreEx03TakeSkipRope {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputData = scanner.nextLine();

        List<String> correctDataList = Arrays.stream(inputData.split(""))
                .collect(Collectors.toList());

        List<String> nonNumList = new ArrayList<>();
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i <= correctDataList.size() -1 ; i++) {

            if(correctDataList.get(i).equals("0")
            || correctDataList.get(i).equals("1")
            || correctDataList.get(i).equals("2")
            || correctDataList.get(i).equals("3")
            || correctDataList.get(i).equals("4")
            || correctDataList.get(i).equals("5")
            || correctDataList.get(i).equals("6")
            || correctDataList.get(i).equals("7")
            || correctDataList.get(i).equals("8")
            || correctDataList.get(i).equals("9")) {

                numList.add(Integer.valueOf(correctDataList.get(i)));
            } else {

                nonNumList.add(correctDataList.get(i));
            }
        }

        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int j = 0; j < numList.size(); j++) {

            if(j % 2 == 0) {
                takeList.add(numList.get(j));
            } else {
                skipList.add(numList.get(j));
            }
        }

        String result = "";

        int takeLetters = 0;

        for (int iterate = 0; iterate < takeList.size(); iterate++) {

            int take = takeList.get(iterate);
            int skip = skipList.get(iterate);

            if(take + takeLetters >= nonNumList.size()){

                for (int i = takeLetters; i <= nonNumList.size() - 1; i++) {
                    result += nonNumList.get(i);
                }
                break;
            } else {
                for (int i = takeLetters; i < (takeLetters + take) ; i++) {

                    result += nonNumList.get(i);
                }
                takeLetters = takeLetters + take + skip;
            }
        }
        System.out.println(result.toString());
    }
}

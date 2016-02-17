package com.example;

import java.util.ArrayList;

//1. self-number가 아닌 숫자를 찾아 리스트로 정리한다.
//2. 1 - 4999중 해당 리스트에 포함되지 않는 숫자를 전부 더한다.

public class SelfNumber {
    //5000은 포함 하지 않는다
    private static final int LIMIT = 50;

    //generator를 가지는 1 - LIMIT 범위 내의 숫자 목록
    private static ArrayList<Integer> notSelfNumberList;

    public static void main(String[] args) {
        initNotSelfNumberList();

        printTotalSelftNumberSum();
    }

    //not self-number list 셋팅
    public static void initNotSelfNumberList() {
        notSelfNumberList = new ArrayList<Integer>();

        //5000보다 작으며 5000에 가장 근접한 self값을 모르며 제한되는 generator를 모르기 때문에 LIMIT까지 진행.
        for (int i = 0; i <= LIMIT ; i++) {
            //해당 숫자를 generator로 가지는 값을 찾아 낸다.
            //찾아낸 수는 generator를 가지고 있으므로 notSelfNumberList에 포함 한다.
            //이때 생성된 수가 최초로 LIMIT값을 넘게 되는 순간 break(해당 숫자는 notSelfNumberList에 포함 안함)

            String strNum = String.valueOf(i);

            //자기 자신도 더해야 하므로 우선 자기 자신을 최초 숫자로 셋팅
            int notSelfNumber = i;
            //각 자리수를 전부 분해하여 더한다.
            for (int idx = 0; idx < strNum.length(); idx++) {
            	System.out.println(strNum.substring(idx, idx+1));
                notSelfNumber += Integer.parseInt(strNum.substring(idx, idx+1));
            }

            //더한 숫자가 한도 범위를 벗어 난다면 for문 중단.
            if (notSelfNumber > LIMIT) break;

            //한도를 넘지 않았다면 not self-number list에 포함
            notSelfNumberList.add(notSelfNumber);
        }
    }

    public static void printTotalSelftNumberSum() {
        int sum = 0;

        //1부터 LIMIT까지 진행
        for (int i = 1; i <= LIMIT; i++) {
            //not self-number list에 포함되어 있다면 통과
            if (notSelfNumberList.contains(i)) continue;

            //아니라면 최종합에 더하기.
            sum += i;
        }

        System.out.println("1 부터 " + LIMIT + "까지 self-number 가 아닌 모든 수의 합 : " + sum);
    }

}
package io.zipcoder;

public class Problem3 {

    public String wuTangWuTang(int limit) {

        String wuTangAnswer = "";

        for (int i = 1; i < limit+1; i++) {

            if (i%3 == 0 && i%5 == 0) {
                wuTangAnswer += "WuTang";
            } else if (i%3 == 0) {
                wuTangAnswer += "Wu";
            } else if (i%5 == 0) {
                wuTangAnswer += "Tang";
            } else {
                wuTangAnswer += i;
            }
            if (i < limit) {
                wuTangAnswer += ", ";
            }
        }

        return wuTangAnswer;
    }


}

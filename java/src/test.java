class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int len = phone_number.length();
        int numberLen = len - 4;

        answer = phone_number.substring(0, numberLen);
        String number = phone_number.substring(numberLen, len);

        answer = answer.replaceAll("[0-9]", "*");

        return answer+number;
    }
}
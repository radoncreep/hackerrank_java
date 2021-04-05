public class Substring {
    public static void main(String[] args) {
        String result = getSmallestAndLargest("welcometojava", 3);
        System.out.println(result);
    }

    public static String getSmallestAndLargest(String input, int k) {
        char[] strtOArr = input.toCharArray();
        int formula = (strtOArr.length - k) + 1;
        java.util.ArrayList<String> arr = new java.util.ArrayList<String>();

        for (int i = 0; i < formula; i++) {
            String temp = "";
            int counter = 0;
            int track = i;
            while (counter < k) {
                temp += strtOArr[track];
                track++;
                counter++;
            };
            arr.add(temp);
        }

        java.util.Collections.sort(arr);
        String smallest = arr.get(0), largest = arr.get(arr.size() - 1);
        return smallest + "\n" + largest;
    }
}

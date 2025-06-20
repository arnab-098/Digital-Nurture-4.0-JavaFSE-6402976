import java.util.List;

public class Search {
    public static int linearSearch(List<String> array, String key) {
        for (int i=0; i<array.size(); i++) {
            if (array.get(i) == key) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(List<String> array, String key) {
        int left = 0, right = array.size()-1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = array.get(mid).compareTo(key);
            if (compare == 0) {
                return mid;
            } else if (compare > 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
}

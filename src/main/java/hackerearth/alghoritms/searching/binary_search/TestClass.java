package hackerearth.alghoritms.searching.binary_search;

public class TestClass {
    public static void main(String[] args) {
        int[] ints = {2, 3, 5, 6, 8, 9, 12, 13, 14};
        int  i =  process(ints[0], ints.length - 1, 13, ints);
        System.out.println(i);
    }

    public static int process(int low, int high, int key, int[] a)
    {
        while (low <= high)
        {
            int mid = (low+high)/2;
            if(a[mid] < key) {
                low = mid + 1;
            } else if(a[mid] > key)
            {
                high = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}

package hackerearth.alghoritms.searching.ternary_search;

public class TestClass {
    public static void main(String[] args) {
        int[] ints = {2, 3, 5, 6, 8, 9, 12, 13, 14};

        int i = ternary_search(0, ints.length - 1, 13, ints);

        System.out.println(i);

    }

    public static int ternary_search(int l, int r, int x, int[] ar) {
        if (r >= l) {
            int mid1 = l + (r - l) / 3;
            int mid2 = r - (r - l) / 3;

            if (ar[mid1] == x) return  mid1;
            if (ar[mid2] == x) return mid2;

            if (x < ar[mid1]) return ternary_search(l, mid1 - 1, x, ar);
            else if (x > ar[mid2]) return ternary_search(mid2 + 1, r, x , ar);
            else return  ternary_search(mid1 + 1, mid2 - 1, x, ar);
        }
        return -1;
    }
}

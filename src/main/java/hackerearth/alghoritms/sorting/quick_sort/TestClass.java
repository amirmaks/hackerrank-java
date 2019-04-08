package hackerearth.alghoritms.sorting.quick_sort;

public class TestClass {
    public static void main(String[] args) {
//        int[] A = {7,5,4,2};
        int[] A = {
              7, 8, 3, 2, 1, 9
        };

        int p  = partition(A, 0, A.length - 1);
        System.out.println(p);
    }

    static int partition(int A[], int start, int end) {
        int i = start + 1;
        int piv = A[start];
        for (int j = start + 1; j <= end; j++) {
            if(A[j] < piv) {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
                i += 1;
            }
        }
        int temp = A[start];
        A[start] = A[i - 1];
        A[i - 1] = temp;
        return i - 1;
    }

    static int[] swap(int[] A, int a, int b) {
        int temp = A[a];
        A[a] = A[b];
        A[b] = temp;
        return A;
    }

    static void quick_sort(int[] A, int start, int end) {
        if(start < end) {
            int piv_pos = partition(A, start, end);
            quick_sort(A, start, piv_pos - 1);
            quick_sort(A, piv_pos + 1, end);
        }
    }
}

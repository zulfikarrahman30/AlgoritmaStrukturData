/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author USER
 */
public class UTS {

    public UTS() {
    }

    void merge(char arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        char L[] = new char[n1];
        char R[] = new char[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[l + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    void sort(char arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    void keluar(char[] numbers, int target) {
        if (numbers == null) {
            return;
        }

        int low = 0, high = numbers.length - 1;

        int startIndex = -1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (numbers[mid] > target) {
                high = mid - 1;
            } else if (numbers[mid] == target) {
                startIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        int endIndex = -1;
        low = 0;
        high = numbers.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            if (numbers[mid] > target) {
                high = mid - 1;
            } else if (numbers[mid] == target) {
                endIndex = mid;
                low = mid + 1;
            } else {
                low = mid + 1;
            }
        }

        if (startIndex != -1 && endIndex != -1) {
            System.out.print("Terdapat di index: ");
            for (int i = 0; i + startIndex <= endIndex; i++) {
                if (i > 0) {
                    System.out.print(',');
                }
                System.out.print(i + startIndex);
            }
        }
    }

    void sequentialSearch(char[] arr, char cari) {
        boolean found = false;
        int p = arr.length;
        int[] a = new int[p];

        for (int j = 0; j < p; j++) {
            if (arr[j] == cari) {
                a[j] = j;
                found = true;
            }
        }

        System.out.print("Terdapat di index: ");
        for (int i : a) {
            if (i > 0) {
                System.out.print(i + " ");
            }
        }

        if (!found) {
            System.out.println("data " + cari + " tidak ditemukan");
        }
    }

    void tampil(char arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

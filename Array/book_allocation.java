package Array;

public class book_allocation {
    public static void main(String[] args) {
        int []pages = {10,20,30,40};
        int nos = 2;
        System.out.println(min_pages(pages, nos));
    }
    public static int min_pages(int [] pages, int nos ){
        int lo = 0;
        int hi = 0;
        for (int i = 0; i < pages.length; i++) {
            hi += pages[i];
        }
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi)/2;
            if (is_it_possible(pages,nos,mid) == true) {
                ans = mid;
                hi = mid - 1;
            }else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    public static boolean is_it_possible(int []pages, int nos, int mid){
        int student = 1;
        int readpages = 0;
        for (int i = 0; i < pages.length;) {
        if ((readpages + pages[i]) <= mid) {
            readpages = pages[i];
            i++;
        }else{
            readpages = 0;
            student++;
        }
        if (student > nos) {
            return false;
        }   
    }
    return true;
    }
}

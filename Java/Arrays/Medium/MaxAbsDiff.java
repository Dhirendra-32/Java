package Arrays.Medium;

public class MaxAbsDiff {
    public static int solution(int []arr){
        int ans = Integer.MIN_VALUE;
        int abs ;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                abs = Math.abs(arr[i]-arr[j])+Math.abs((i-j));
                ans = Math.max(ans,abs);
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int []arr = new int[]{-98, -5, 37, -97, 38, 22, 70, 42, 61, 84};
        System.out.println(solution(arr));
    }
}

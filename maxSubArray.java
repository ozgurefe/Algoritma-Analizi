
public class Analiz
{
  public int maxSubArray(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];
 
		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}
 
		return max;
	}
  
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Analiz analiz = new Analiz();
    analiz.maxSubArray({1,-1,3,-9,6});
  }
}



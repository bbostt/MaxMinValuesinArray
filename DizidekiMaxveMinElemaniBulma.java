
public class DizidekiMaxveMinElemaniBulma {

	public static void main(String[] args) {
		
		int[] arr = {55, -5, 66, 124, -33, 75};
		
		int min = arr[0];
		int max = arr[0];
		
		
		
		for(int i : arr) {
			if(i < min) {
				min = i;
			}
			
			if(i > max) {
				max = i;
			}
		}
		
		System.out.println("Maximum deðer : " +max);
		System.out.println("Minimum deðer : " +min);

	}

}

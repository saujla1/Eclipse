package first;

public class darray {

	public static void main(String[] args) {
		int[][]n=new int[5][4];
		int [][]p={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(p.length);
		System.out.println(n.length);
		for(int i=0;i<n.length;i++) {
			for (int x:n[i]) {
				System.out.print(x+"\t");
			}
			System.out.println();
		}
				

	}

}

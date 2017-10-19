public class ants{
	public static void main(){
		
		int l = 10;
		int n = 3;
		int x[] = new int[n];
		x[0] = 2;
		x[1] = 6;
		x[2] = 7;

		int ans = 0;
		boolean flg;
		boolean a[] = new boolean[n];
		for(int i = 0; i < n; i++){
			a[i] = true;
		}
		for(int i = 0; i < l; i++){
			flg = false;
			for(int j = 0; j < n; j++){
				if(j %  2 == 0){
					x[j]++;
				}else{
					x[j]--;
				}

			}
			for(int j = 1; j < n; j++){
				if((x[j - 1] == true) || (x[j] == true))){
					flg = true;
					if(x[j - 1] == x[j]){
						a[j - 1] = false;
						a[j] = false;
					}
				}
			}
			if(flg == false){
				ans = i;
				break;
			}
		}

	System.out.println("time =" + ans);
	}
}

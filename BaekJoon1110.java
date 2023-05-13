import java.util.*;

class BaekJoon1110 {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		int count = 0;
		int copy = a;
		
		while(true) {
			a = ((a%10)*10)+(((a/10)+(a%10))%10);
			count++;
			
			if(copy == a) {
				break;
			}
		}
		System.out.println(count);
    }
}
package Exercise4_14_First;
//esa no. jo 1 se aur khud apne aap se divide ho jaaye use prime no. kehte h
public class Exercise11_Prime {
	public static void main(String[] args) {
		
		
int n=19;
int prime=0;

for(int i=2;i<=n-1;i++) {
	if(n%i==0) {
	prime=prime+1;
}
}
if(prime==0) {
	System.out.println("prime");
}else {
	System.out.println("not prime");
}


}

}

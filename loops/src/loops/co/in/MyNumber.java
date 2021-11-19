package loops.co.in;

public class MyNumber {
	int number;
	

	public MyNumber(int number) {
	this.number=number;
	}

	public boolean isprime() {
	for(int i=2;i<=number-1;i++) {
    if(number%i!=0) {
    return true;
    }
	}
    return false;
    }

    public int sumUptoN() {
    int sum= 0;
    for(int i=0;i<=number;i++) {
    sum = sum+i;
    }
    return sum;
    }

	public int sumofdivisers() {
	int sum=0;
	for(int i=2;i<=number;i++) {
	if(number%i==0) {
	sum=sum+i;
	}
	}
	return sum;
	}

	public void printanumbertriangle() {

	for(int i=1;i<=number;i++) {
	for(int j=1;j<=i;j++) {
    System.out.print(j+" ");
	}
	System.out.println();
	}
	}
    }


		
	




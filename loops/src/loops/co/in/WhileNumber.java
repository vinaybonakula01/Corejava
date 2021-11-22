package loops.co.in;

public class WhileNumber {
int number;

public void whileNmuber(int number) {
	this.number=number;
}

public void printSquaresuptolimit() {
	int i=1;
	while(i*i<number) {
		System.out.println(i*i);
		i++;
	}
	
}

}

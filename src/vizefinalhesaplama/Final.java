package vizefinalhesaplama;

import java.util.Scanner;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu = new Scanner(System.in);
System.out.println("Merhaba Hoþgeldiniz . Adýnýz ?");
String isim = okuyucu.next();
System.out.println("Vize Notunuz ?");
int vize = okuyucu.nextInt();
System.out.println("Final Notunuz ?");
int finalnotu = okuyucu.nextInt();

double ortalama = finalnotu*0.60 + vize*0.40;
String harfnotu = "AA";
String harfnotuba = "BA";
String harfnotub = "BB";
String harfnotucb = "CB";
String harfnotuc = "CC";
String harfnotudc = "DC";
String harfnotud = "DD";
String harfnotufd = "FD";
String harfnotuf="FF";
System.out.println(ortalama);

if (ortalama<10) {
	harfnotu = harfnotuf ;
} else if (ortalama<20) {
	harfnotu = harfnotufd ;
} else {

} if (ortalama<30) {
	harfnotu = harfnotud ;
} else if (ortalama<40) {
	harfnotu = harfnotudc;
} else {

} if (ortalama<50) {
	harfnotu = harfnotuc ;
} else if (ortalama<60) {
	harfnotu = harfnotucb;
} else {

} if (ortalama<70) {
	harfnotu = harfnotub;
} else if (ortalama<85) {
	harfnotu = harfnotuba;
} else {

} if (ortalama<100) {
	harfnotu = harfnotu ;
} else {

}{

}{

}{

} {

	System.out.println("Harfnotu = " + harfnotu);


}
}
	}



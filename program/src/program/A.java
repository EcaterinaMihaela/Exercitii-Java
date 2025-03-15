package program;

public class A 
{
	int x;
	
	//constructor
	public A(int x) 
	{
		this.x =x;
	}
	
	public A() {}
	
	//@Override  //adnotare  //daca nu e suprascrisa returneaza un hashcod care e o adresa si e diferit pt fiec obj
	public String toString()
	{
		return "x = " +x;
	}
}
//interfata -clasa abstracta(nu poate avea instante)
//extends cand resscriem metode(cu atribute comune)
//diferenta dintre interfata si clasa abstracta este ca interfata o fol cand avem mai multe clase cu metode comune si implementarea difera f mult

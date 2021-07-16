public class ResultExpreassion{
	public static void main(String[] args){
		String s1 = "wellcome to java";
		String s2="Programming is fun";
		String s3 = "wellcome to java";
		
		boolean a= (s1==s2);
		System.out.println(a);
		
		boolean b= (s2==s3);
		System.out.println(b);
		
		boolean c =s1.equals(s2);
		System.out.println(c);
		
		boolean d =s1.equals(s3);
		System.out.println(d);
		
		int e = s1.compareTo(s2);
		System.out.println(e);
		
		int f = s2.compareTo(s3);
		System.out.println(f);
		
		int g = s2.compareTo(s2);
		System.out.println(g);
		
		int h=s1.charAt(0);
		System.out.println(h);  //119 ?
		
		int i=s1.indexOf('j');
		System.out.println(i);
		
		int j=s1.indexOf("to");
		System.out.println(j);
		
		int k=s1.lastIndexOf('a');
		System.out.println(k);
		
		int l=s1.lastIndexOf("o",15); //?  10 ans
		System.out.println(l);
		
		int m=s1.length();
		System.out.println(m);
		
		String n=s1.substring(5);
		System.out.println(n);
		
		String o=s1.substring(5,11);
		System.out.println(o);
		
		boolean p=s1.startsWith("Wel");
		System.out.println(p);
		
		boolean q=s1.endsWith("java");
		System.out.println(q);
		
		String r=s1.toLowerCase();
		System.out.println(r);
		
		String s=s1.toUpperCase();
		System.out.println(s);
		
		String t=s1.concat(s2);
		System.out.println(t);
		
		boolean u=s1.contains(s2);
		System.out.println(u);
		
		String v="\t Wel \t".trim();
		System.out.println(v);
		
		
		
		
	}
}
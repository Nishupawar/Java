public class StringBuilderDemo
 {
    public static void main(String[] args) 
	{
		StringBuilder s = new StringBuilder();
		System.out.println(s.capacity()); //16 
		StringBuilder sb = new StringBuilder("Nishu");
		StringBuilder sb1 = new StringBuilder("Nishigandha");
		System.out.println(sb.capacity());            //21
		System.out.println(sb.append("Pawar"));       // NishuPawar
		System.out.println(sb.delete(1, 4));          //NuPawar
		System.out.println(sb.charAt(2));             //p
		System.out.println(sb.equals(sb1));           //false
		System.out.println(sb.compareTo(sb1)>0);      //true
		System.out.println(sb.isEmpty());             //false
		System.out.println(sb1.insert(0, 'v'));       //vNishigandha
		System.out.println(sb1.indexOf("i"));         //2
		System.out.println(sb1.lastIndexOf("i"));     //5
		     
		StringBuilder sb2 = new StringBuilder("pawar");
		System.out.println(sb2.replace(2, 4, "m"));  //pamr
		System.out.println(sb2.reverse());           //rmap
		System.out.println(sb2.substring(1));        //map
		System.out.println(sb2.append("nishu"));     //rmapnishu
		System.out.println(sb2.substring(0, 3));     //rma
		System.out.println(sb2.subSequence(1, 5));   //mapn
		System.out.println(sb2);                     //rmapnishu
		
	}
    
}

public class StringBufferDemo
 {
    public static void main(String[] args) 
    {
        StringBuffer s = new StringBuffer();
	System.out.println(s.capacity()); //16 
	StringBuffer sb = new StringBuffer("Nishu");
	StringBuffer sb1 = new StringBuffer("Nishigandha");
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
	     
	StringBuffer sb2 = new StringBuffer("pawar");
	System.out.println(sb2.replace(2, 4, "m"));  //pamr
	System.out.println(sb2.reverse());           //rmap
	System.out.println(sb2.substring(1));        //map
	System.out.println(sb2.append("nishu"));     //rmapnishu
	System.out.println(sb2.substring(0, 3));     //rma
	System.out.println(sb2.subSequence(1, 5));   //mapn
	System.out.println(sb2);                     //rmapnishu
	
        
    }
}

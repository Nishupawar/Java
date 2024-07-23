public class StringSentence3 {
    public static void main(String[] args) {
		String s1="You all are very very very good students";
		//stneduts doog yrev yrev yrev era lla uoY 
		String[] sa=s1.split(" ");
		String mainAns="";
		
		for(int i=sa.length-1;i>=0;i--)
		{
			String temp=sa[i];
			String rev ="";
			for(int j=temp.length()-1;j>=0;j--)
			{
				rev = rev+temp.charAt(j);
			}
			mainAns= mainAns+rev+" ";
		}
		System.out.println(mainAns);
	}

}

public class Pattern31 {
    public static void main(String[] args) {
        // int mid=5;
        // for(int i=1;i<=6;i++)
		// {
        //     int ch=0;
		// 	for(int j=1;j<=6;j++)
		// 	{
        //         if(j<=mid)
        //         System.out.print(" ");
        //         else
		// 		System.out.print((char)(ch+65)+" ");
        //         ch++;
		// 	}
        //       mid--;
		// 	System.out.println();
		// }		
        int mid=5;
		//int ch=0;
		for(int i=1;i<=6;i++)
		{
			int ch=0;
			for(int j=1;j<=6;j++)
			{
				//int ch=0;
				if(j<=mid)
				System.out.print(" ");
				else
				{
					System.out.print((char)(ch+65)+" ");
					ch++;
				}
            }
			mid--;
			System.out.println();
    }
}
}

//      A 
//     A B
//    A B C 
//   A B C D
//  A B C D E
// A B C D E F
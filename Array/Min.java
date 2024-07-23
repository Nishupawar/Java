public class Min {
    
        public static void main(String[] args) {
            
           
            int[] a= {12,233,455,667,7};
             int min= Integer.MAX_VALUE;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]<min)
    min=a[i];
            }
            System.out.println(min);
        }
    }
    


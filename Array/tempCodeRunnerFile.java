int[] a = { 1, 1, 2 };
        int uniqueCnt = 0;
        for (int i = 0; i < a.length; i++) {
            int cnt = 0;
            for (int j = 0; j < i; j++) {
                if (a[i] == a[j])
                    cnt++;
            }
            if (cnt == 0)
                uniqueCnt++;
        }
        int[] b = new int[uniqueCnt];
        int index = 0;
        for (int i = 0; i < a.length; i++)
         {
            int cnt1 = 0;
            for (int j = 0; j < i; j++) 
            {
                if (a[i] == a[j])
                    cnt1++;
            }
            if (cnt1 == 0) {
                b[index] = a[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(b));

        for (int i = 0; i < b.length; i++)
         {
            for (int j = 0; j < b.length; j++)
             {
                System.out.println(b[i] + " " + b[j]);
            }
        }

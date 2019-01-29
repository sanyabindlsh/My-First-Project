import java.util;
class salesperson{
	public static vod main(String[] args)
	{
	    float S = new float [5][6];
	    Scanner in = new Scanner(System.in);
	    for(int i=0; i<4; i++)
	    {
	        sop("enter" +i+ " person sales record");
	        for(j=0; j<5; j++)
	        {
	            sop("enter" +j+ " sold amount");
	            S[i][j] = in.nextDouble();
	        }
	    }
	    for(i=0; i<4; i++)
	    {
	        for(j=0; j<5; j++)
	        {
	            S[i][5]+ = S[i][j];
	            S[4][j]+ = S[i][j];
	        }
	    }
	    for(int i=0; i<5; i++)
	    {
	        for(int j=0; j<6; j++)
	        {
	            sop(S[i][j]);
	        }
	        sop("\n");
	    }
	}
}
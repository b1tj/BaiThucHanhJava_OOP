public class App11 {
    public static void main(String[] args) throws Exception {
        for(int i = 0; i <= 20; i++)
        {
            for(int j = 0; j <= 10; j++)
            {
                for(int k = 0; k <= 4; k++)
                {
                    if(i*10 + j*20 + k*50 == 200)
                    {
                        System.out.println(i+" to 10k "+j+" to 20k "+k+" 50k");
                    }
                }
            }
        }
    }
}
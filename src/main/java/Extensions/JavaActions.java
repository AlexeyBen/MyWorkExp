package Extensions;

import WorkFlows.WebFlows;

public class JavaActions extends WebFlows
{


    public static String GivenTime  ()
    {
        String CurrentTime = WebFlows.a;
        String GivenHours[] = CurrentTime.split(":");
        String Hours = ( GivenHours [0] );
        String Minutes = ( GivenHours [1] );
        String Seconds = ( GivenHours [2] );
        String FinalTIme = Hours + Minutes + Seconds;
        return FinalTIme ;
    }

}

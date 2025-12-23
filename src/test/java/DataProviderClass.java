import org.testng.annotations.DataProvider;
public class DataProviderClass {
    @DataProvider(name = "InvalidLogin")
        public static Object[][] getData1()
    {
        return new Object[][]{
                {"standard_user","All123"},
                {"secret_sauce","secret_sauce"},
                {"problem_user","problem_user"}
        };
    }
    @DataProvider(name = "validLogin")
    public static Object[][] getData2() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
//                {"locked_out_user", "secret_sauce"},
//                {"problem_user", "secret_sauce"}
        };
    }


}



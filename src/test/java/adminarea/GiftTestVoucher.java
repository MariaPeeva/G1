package adminarea;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Browser;

public class GiftTestVoucher {

      @BeforeMethod
      public void setUp(){

      Browser.setup();

      }



      @Test
      public void GiftVoucherCheck(){
          GVoucher.goTo();
          GVoucher.loginAdmin("admin29", "parola123!");
          GVoucher.vouchercheck("Peeva", "You Have A BUG");
          GVoucher.voucherRemoveAndCreateNew ("Peeva"," Mariya", "mimi_volley@abv.bg","Valio","mimi_volley@abv.bg" , "350");
          //GVoucher.NewVoucherExsistCheck();






      }



    @AfterMethod
    public void quit(){
         // Browser.quit();

    }



























}




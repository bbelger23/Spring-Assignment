package brandon;

import brandon.iface.SalesInput;
import brandon.iface.SalesReport;
import brandon.iface.ShippingPolicy;
import brandon.impl.FileInput;
import brandon.impl.FreeShipping;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Report {
    private SalesReport salesReport;

    //public void run() {
        //System.out.println("Customer");
        //SalesInput theInput = new FileInput();
        //List<Sale> sales = theInput.getSales();
        //for (Sale sale : sales) {
            //System.out.println(sale.getName());
        //}

    //}

    public void generateReport(){
        System.out.println("Customer");
        SalesInput salesInput = new FileInput();
        List<Sale> sales = salesInput.getSales();
        for(Sale aSale : sales)
            System.out.println(aSale.getName());
            //shippingPolicy.applyShipping(aSale);
        //salesReport.generateReport(sales);

    }

}

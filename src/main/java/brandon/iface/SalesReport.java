package brandon.iface;

import brandon.Sale;

import java.util.List;

public interface SalesReport {
    void generateReport(List<Sale> salesList);
}

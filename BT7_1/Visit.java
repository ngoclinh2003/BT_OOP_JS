package OOP.BT7_1;

public class Visit{
    private Customer customer;
    private double serviceCost;
    private double productCost;

    public Visit(Customer customer, double serviceCost, double productCost) {
        this.customer = customer;
        this.serviceCost = serviceCost;
        this.productCost = productCost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getServiceCost() {
        return serviceCost;
    }

    public double getProductCost() {
        return productCost;
    }

    public void setServiceCost(double cost) {
        serviceCost = cost;
    }

    public void setProductCost(double cost) {
        productCost = cost;
    }

    public double getTotalCost() {
        double serviceDiscount = serviceCost * new Discount(0.2, 0.15, 0.1, 0.1).getServiceDiscount(customer.getMemberType());
        double productDiscount = productCost * new Discount(0.2, 0.15, 0.1, 0.1).getProductDiscount();
        return (serviceCost - serviceDiscount) + (productCost - productDiscount);
    }
}

	public class Order
	{
	    private int orderNum;
	    private double orderAmount;
	    private double orderDiscount;

	    public Order(int orderNumber, double orderAmt,
	        double orderDisc)
	    {
	    orderNum = orderNumber;
	    orderAmount = orderAmt;
	    orderDiscount = orderDisc;
	    }
	    public int getOrderAmount()
	    {
	        return orderAmount;
	    }
	    public int getOrderDisc()
	    {
	        return orderDisc;
	    }
	}

	public class CustomerOrder
	{
	    public static void main(String[] args)
	    {
	    int ordNum = 1234;
	    double ordAmount = 580.00;
	    double discountPer = .1;
	    Order order;
	    double finalAmount = order.getOrderAmount() —
	        order.getOrderAmount() * order.getOrderDisc();
	    System.out.println("Final order amount = $" +
	        finalAmount);
	    }
	}
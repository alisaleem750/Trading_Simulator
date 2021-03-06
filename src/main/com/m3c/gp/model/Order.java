package main.com.m3c.gp.model;

public class Order implements OrderInterface {
	private int orderId = -1;
	private Instrument instrument;
	private int clientId;
	private double price;
	private int quantity;
	private OrderType type;

	// Creating new orders from front-end
	public Order(Instrument instrument, int clientId, double price, int quantity, OrderType type) {
		this.instrument = instrument;
		this.clientId = clientId;
		this.price = price;
		this.quantity = quantity;
		this.type = type;
	}

	public int getOrderId() {
		return orderId;
	}

	@Override
	public Instrument getInstrument() {
		return instrument;
	}

	@Override
	public int getClientId() {
		return clientId;
	}

	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public OrderType getType() {
		return type;
	}

	@Override
	public int getQuantity() {
		return quantity;
	}
}

package functional;

public class Recharge {
	 private int customerId;
	    private float amount;
	    private String validoate;
	    
	    
		public Recharge(int customerId, float amount, String validoate) {
			super();
			this.customerId = customerId;
			this.amount = amount;
			this.validoate = validoate;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public float getAmount() {
			return amount;
		}
		public void setAmount(float amount) {
			this.amount = amount;
		}
		public String getValidoate() {
			return validoate;
		}
		public void setValidoate(String validoate) {
			this.validoate = validoate;
		}
		
	    
}

package controller;

public class calculModel {
	private int op1;
	private int op2;
	private int res;
	private String operator;
	public calculModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public calculModel(int op1, int op2, int res, String operator) {
		super();
		this.op1 = op1;
		this.op2 = op2;
		this.res = res;
		this.operator = operator;
	}
	public int getOp1() {
		return op1;
	}
	public void setOp1(int op1) {
		this.op1 = op1;
	}
	public int getOp2() {
		return op2;
	}
	public void setOp2(int op2) {
		this.op2 = op2;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

}

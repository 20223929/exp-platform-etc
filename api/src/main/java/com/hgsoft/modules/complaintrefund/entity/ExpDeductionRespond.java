package com.hgsoft.modules.complaintrefund.entity;

import lombok.Data;

@Data
public class ExpDeductionRespond {

	public ExpDeductionRespond() {
		super();
	}

	//如果发现了异常请求，就只能返回以下两个字段
	public ExpDeductionRespond(String return_code, String return_msg) {
		super();
		this.return_code = return_code;
		this.return_msg = return_msg;
	}
	// 交易结果 16 SUCCESS-成功；FAILURE-失败； 是
	private String return_code;
	// 交易结果描述 150 是
	private String return_msg;
	// 商户交易日期 10 格式为 yyyy-mm-dd 是
	private String trx_date;
	// 商户交易时间 8 格式为HH24:MI:SS 是
	private String trx_time;
	// 交易流水号 60 是
	private String trx_serno;
	// 交易金额 - 单位分 是
	private Integer trx_amt;

	//银行扣款金额(分)
	private Long deduction_fee;

	//银行优惠金额(分)
	private Long discount_fee;

	//银行交易检索参考号
	private String bank_deduction_serno;

	public boolean isSuccess(){
		return return_code!=null && return_code.equals("SUCCESS");
	}
	
	
}

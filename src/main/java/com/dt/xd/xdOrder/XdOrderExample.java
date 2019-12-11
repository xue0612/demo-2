package com.dt.xd.xdOrder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XdOrderExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected int pageStart;

	protected int pageSize;
	
	protected String orderNumber;
	
	public int getPageStart() {
		return pageStart;
	}

	public void setPageStart(int pageStart) {
		this.pageStart = pageStart;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public XdOrderExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	public String getOrderByClause() {
		return orderByClause;
	}

	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	public boolean isDistinct() {
		return distinct;
	}

	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	protected abstract static class GeneratedCriteria {
		protected List<Criterion> criteria;

		protected GeneratedCriteria() {
			super();
			criteria = new ArrayList<Criterion>();
		}

		public boolean isValid() {
			return criteria.size() > 0;
		}

		public List<Criterion> getAllCriteria() {
			return criteria;
		}

		public List<Criterion> getCriteria() {
			return criteria;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteria.add(new Criterion(condition));
		}

		protected void addCriterion(String condition, Object value, String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1, Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property + " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		public Criteria andIdIsNull() {
			addCriterion("id is null");
			return (Criteria) this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("id is not null");
			return (Criteria) this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("id =", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("id <>", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("id >", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("id >=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("id <", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("id <=", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("id like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("id not like", value, "id");
			return (Criteria) this;
		}

		public Criteria andIdIn(List<String> values) {
			addCriterion("id in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotIn(List<String> values) {
			addCriterion("id not in", values, "id");
			return (Criteria) this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("id between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("id not between", value1, value2, "id");
			return (Criteria) this;
		}

		public Criteria andOrderNumberIsNull() {
			addCriterion("order_number is null");
			return (Criteria) this;
		}

		public Criteria andOrderNumberIsNotNull() {
			addCriterion("order_number is not null");
			return (Criteria) this;
		}

		public Criteria andOrderNumberEqualTo(String value) {
			addCriterion("order_number =", value, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberNotEqualTo(String value) {
			addCriterion("order_number <>", value, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberGreaterThan(String value) {
			addCriterion("order_number >", value, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberGreaterThanOrEqualTo(String value) {
			addCriterion("order_number >=", value, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberLessThan(String value) {
			addCriterion("order_number <", value, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberLessThanOrEqualTo(String value) {
			addCriterion("order_number <=", value, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberLike(String value) {
			addCriterion("order_number like", value, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberNotLike(String value) {
			addCriterion("order_number not like", value, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberIn(List<String> values) {
			addCriterion("order_number in", values, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberNotIn(List<String> values) {
			addCriterion("order_number not in", values, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberBetween(String value1, String value2) {
			addCriterion("order_number between", value1, value2, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andOrderNumberNotBetween(String value1, String value2) {
			addCriterion("order_number not between", value1, value2, "orderNumber");
			return (Criteria) this;
		}

		public Criteria andBoughtUserIsNull() {
			addCriterion("bought_user is null");
			return (Criteria) this;
		}

		public Criteria andBoughtUserIsNotNull() {
			addCriterion("bought_user is not null");
			return (Criteria) this;
		}

		public Criteria andBoughtUserEqualTo(String value) {
			addCriterion("bought_user =", value, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserNotEqualTo(String value) {
			addCriterion("bought_user <>", value, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserGreaterThan(String value) {
			addCriterion("bought_user >", value, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserGreaterThanOrEqualTo(String value) {
			addCriterion("bought_user >=", value, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserLessThan(String value) {
			addCriterion("bought_user <", value, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserLessThanOrEqualTo(String value) {
			addCriterion("bought_user <=", value, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserLike(String value) {
			addCriterion("bought_user like", value, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserNotLike(String value) {
			addCriterion("bought_user not like", value, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserIn(List<String> values) {
			addCriterion("bought_user in", values, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserNotIn(List<String> values) {
			addCriterion("bought_user not in", values, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserBetween(String value1, String value2) {
			addCriterion("bought_user between", value1, value2, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andBoughtUserNotBetween(String value1, String value2) {
			addCriterion("bought_user not between", value1, value2, "boughtUser");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIsNull() {
			addCriterion("order_info is null");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIsNotNull() {
			addCriterion("order_info is not null");
			return (Criteria) this;
		}

		public Criteria andOrderInfoEqualTo(String value) {
			addCriterion("order_info =", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotEqualTo(String value) {
			addCriterion("order_info <>", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoGreaterThan(String value) {
			addCriterion("order_info >", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoGreaterThanOrEqualTo(String value) {
			addCriterion("order_info >=", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLessThan(String value) {
			addCriterion("order_info <", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLessThanOrEqualTo(String value) {
			addCriterion("order_info <=", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoLike(String value) {
			addCriterion("order_info like", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotLike(String value) {
			addCriterion("order_info not like", value, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoIn(List<String> values) {
			addCriterion("order_info in", values, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotIn(List<String> values) {
			addCriterion("order_info not in", values, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoBetween(String value1, String value2) {
			addCriterion("order_info between", value1, value2, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderInfoNotBetween(String value1, String value2) {
			addCriterion("order_info not between", value1, value2, "orderInfo");
			return (Criteria) this;
		}

		public Criteria andOrderPriceIsNull() {
			addCriterion("order_price is null");
			return (Criteria) this;
		}

		public Criteria andOrderPriceIsNotNull() {
			addCriterion("order_price is not null");
			return (Criteria) this;
		}

		public Criteria andOrderPriceEqualTo(Float value) {
			addCriterion("order_price =", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceNotEqualTo(Float value) {
			addCriterion("order_price <>", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceGreaterThan(Float value) {
			addCriterion("order_price >", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceGreaterThanOrEqualTo(Float value) {
			addCriterion("order_price >=", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceLessThan(Float value) {
			addCriterion("order_price <", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceLessThanOrEqualTo(Float value) {
			addCriterion("order_price <=", value, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceIn(List<Float> values) {
			addCriterion("order_price in", values, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceNotIn(List<Float> values) {
			addCriterion("order_price not in", values, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceBetween(Float value1, Float value2) {
			addCriterion("order_price between", value1, value2, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderPriceNotBetween(Float value1, Float value2) {
			addCriterion("order_price not between", value1, value2, "orderPrice");
			return (Criteria) this;
		}

		public Criteria andOrderNoIsNull() {
			addCriterion("order_no is null");
			return (Criteria) this;
		}

		public Criteria andOrderNoIsNotNull() {
			addCriterion("order_no is not null");
			return (Criteria) this;
		}

		public Criteria andOrderNoEqualTo(String value) {
			addCriterion("order_no =", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotEqualTo(String value) {
			addCriterion("order_no <>", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoGreaterThan(String value) {
			addCriterion("order_no >", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoGreaterThanOrEqualTo(String value) {
			addCriterion("order_no >=", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLessThan(String value) {
			addCriterion("order_no <", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLessThanOrEqualTo(String value) {
			addCriterion("order_no <=", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoLike(String value) {
			addCriterion("order_no like", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotLike(String value) {
			addCriterion("order_no not like", value, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoIn(List<String> values) {
			addCriterion("order_no in", values, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotIn(List<String> values) {
			addCriterion("order_no not in", values, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoBetween(String value1, String value2) {
			addCriterion("order_no between", value1, value2, "orderNo");
			return (Criteria) this;
		}

		public Criteria andOrderNoNotBetween(String value1, String value2) {
			addCriterion("order_no not between", value1, value2, "orderNo");
			return (Criteria) this;
		}

		public Criteria andTsIsNull() {
			addCriterion("ts is null");
			return (Criteria) this;
		}

		public Criteria andTsIsNotNull() {
			addCriterion("ts is not null");
			return (Criteria) this;
		}

		public Criteria andTsEqualTo(Date value) {
			addCriterion("ts =", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotEqualTo(Date value) {
			addCriterion("ts <>", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsGreaterThan(Date value) {
			addCriterion("ts >", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsGreaterThanOrEqualTo(Date value) {
			addCriterion("ts >=", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLessThan(Date value) {
			addCriterion("ts <", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsLessThanOrEqualTo(Date value) {
			addCriterion("ts <=", value, "ts");
			return (Criteria) this;
		}

		public Criteria andTsIn(List<Date> values) {
			addCriterion("ts in", values, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotIn(List<Date> values) {
			addCriterion("ts not in", values, "ts");
			return (Criteria) this;
		}

		public Criteria andTsBetween(Date value1, Date value2) {
			addCriterion("ts between", value1, value2, "ts");
			return (Criteria) this;
		}

		public Criteria andTsNotBetween(Date value1, Date value2) {
			addCriterion("ts not between", value1, value2, "ts");
			return (Criteria) this;
		}

		public Criteria andPayIsNull() {
			addCriterion("pay is null");
			return (Criteria) this;
		}

		public Criteria andPayIsNotNull() {
			addCriterion("pay is not null");
			return (Criteria) this;
		}

		public Criteria andPayEqualTo(String value) {
			addCriterion("pay =", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayNotEqualTo(String value) {
			addCriterion("pay <>", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayGreaterThan(String value) {
			addCriterion("pay >", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayGreaterThanOrEqualTo(String value) {
			addCriterion("pay >=", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayLessThan(String value) {
			addCriterion("pay <", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayLessThanOrEqualTo(String value) {
			addCriterion("pay <=", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayLike(String value) {
			addCriterion("pay like", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayNotLike(String value) {
			addCriterion("pay not like", value, "pay");
			return (Criteria) this;
		}

		public Criteria andPayIn(List<String> values) {
			addCriterion("pay in", values, "pay");
			return (Criteria) this;
		}

		public Criteria andPayNotIn(List<String> values) {
			addCriterion("pay not in", values, "pay");
			return (Criteria) this;
		}

		public Criteria andPayBetween(String value1, String value2) {
			addCriterion("pay between", value1, value2, "pay");
			return (Criteria) this;
		}

		public Criteria andPayNotBetween(String value1, String value2) {
			addCriterion("pay not between", value1, value2, "pay");
			return (Criteria) this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("status is null");
			return (Criteria) this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("status is not null");
			return (Criteria) this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("status =", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("status <>", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("status >", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("status >=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("status <", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("status <=", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("status like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("status not like", value, "status");
			return (Criteria) this;
		}

		public Criteria andStatusIn(List<String> values) {
			addCriterion("status in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotIn(List<String> values) {
			addCriterion("status not in", values, "status");
			return (Criteria) this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("status between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("status not between", value1, value2, "status");
			return (Criteria) this;
		}

		public Criteria andAppraiseIsNull() {
			addCriterion("appraise is null");
			return (Criteria) this;
		}

		public Criteria andAppraiseIsNotNull() {
			addCriterion("appraise is not null");
			return (Criteria) this;
		}

		public Criteria andAppraiseEqualTo(String value) {
			addCriterion("appraise =", value, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseNotEqualTo(String value) {
			addCriterion("appraise <>", value, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseGreaterThan(String value) {
			addCriterion("appraise >", value, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseGreaterThanOrEqualTo(String value) {
			addCriterion("appraise >=", value, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseLessThan(String value) {
			addCriterion("appraise <", value, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseLessThanOrEqualTo(String value) {
			addCriterion("appraise <=", value, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseLike(String value) {
			addCriterion("appraise like", value, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseNotLike(String value) {
			addCriterion("appraise not like", value, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseIn(List<String> values) {
			addCriterion("appraise in", values, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseNotIn(List<String> values) {
			addCriterion("appraise not in", values, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseBetween(String value1, String value2) {
			addCriterion("appraise between", value1, value2, "appraise");
			return (Criteria) this;
		}

		public Criteria andAppraiseNotBetween(String value1, String value2) {
			addCriterion("appraise not between", value1, value2, "appraise");
			return (Criteria) this;
		}
	}

	public static class Criteria extends GeneratedCriteria {

		protected Criteria() {
			super();
		}
	}

	public static class Criterion {
		private String condition;

		private Object value;

		private Object secondValue;

		private boolean noValue;

		private boolean singleValue;

		private boolean betweenValue;

		private boolean listValue;

		private String typeHandler;

		public String getCondition() {
			return condition;
		}

		public Object getValue() {
			return value;
		}

		public Object getSecondValue() {
			return secondValue;
		}

		public boolean isNoValue() {
			return noValue;
		}

		public boolean isSingleValue() {
			return singleValue;
		}

		public boolean isBetweenValue() {
			return betweenValue;
		}

		public boolean isListValue() {
			return listValue;
		}

		public String getTypeHandler() {
			return typeHandler;
		}

		protected Criterion(String condition) {
			super();
			this.condition = condition;
			this.typeHandler = null;
			this.noValue = true;
		}

		protected Criterion(String condition, Object value, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.typeHandler = typeHandler;
			if (value instanceof List<?>) {
				this.listValue = true;
			} else {
				this.singleValue = true;
			}
		}

		protected Criterion(String condition, Object value) {
			this(condition, value, null);
		}

		protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
			super();
			this.condition = condition;
			this.value = value;
			this.secondValue = secondValue;
			this.typeHandler = typeHandler;
			this.betweenValue = true;
		}

		protected Criterion(String condition, Object value, Object secondValue) {
			this(condition, value, secondValue, null);
		}
	}
}
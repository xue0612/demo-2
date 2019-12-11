package com.dt.xd.xdServiceUser;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XdServiceUserExample {
	protected String orderByClause;

	protected boolean distinct;

	protected List<Criteria> oredCriteria;

	protected int pageStart;

	protected int pageSize;

	protected String serviceName;
	
	protected byte[] img;

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

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

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public XdServiceUserExample() {
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

		public Criteria andServiceHeadIsNull() {
			addCriterion("service_head is null");
			return (Criteria) this;
		}

		public Criteria andServiceHeadIsNotNull() {
			addCriterion("service_head is not null");
			return (Criteria) this;
		}

		public Criteria andServiceHeadEqualTo(String value) {
			addCriterion("service_head =", value, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadNotEqualTo(String value) {
			addCriterion("service_head <>", value, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadGreaterThan(String value) {
			addCriterion("service_head >", value, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadGreaterThanOrEqualTo(String value) {
			addCriterion("service_head >=", value, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadLessThan(String value) {
			addCriterion("service_head <", value, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadLessThanOrEqualTo(String value) {
			addCriterion("service_head <=", value, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadLike(String value) {
			addCriterion("service_head like", value, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadNotLike(String value) {
			addCriterion("service_head not like", value, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadIn(List<String> values) {
			addCriterion("service_head in", values, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadNotIn(List<String> values) {
			addCriterion("service_head not in", values, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadBetween(String value1, String value2) {
			addCriterion("service_head between", value1, value2, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceHeadNotBetween(String value1, String value2) {
			addCriterion("service_head not between", value1, value2, "serviceHead");
			return (Criteria) this;
		}

		public Criteria andServiceNameIsNull() {
			addCriterion("service_name is null");
			return (Criteria) this;
		}

		public Criteria andServiceNameIsNotNull() {
			addCriterion("service_name is not null");
			return (Criteria) this;
		}

		public Criteria andServiceNameEqualTo(String value) {
			addCriterion("service_name =", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotEqualTo(String value) {
			addCriterion("service_name <>", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameGreaterThan(String value) {
			addCriterion("service_name >", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
			addCriterion("service_name >=", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLessThan(String value) {
			addCriterion("service_name <", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLessThanOrEqualTo(String value) {
			addCriterion("service_name <=", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameLike(String value) {
			addCriterion("service_name like", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotLike(String value) {
			addCriterion("service_name not like", value, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameIn(List<String> values) {
			addCriterion("service_name in", values, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotIn(List<String> values) {
			addCriterion("service_name not in", values, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameBetween(String value1, String value2) {
			addCriterion("service_name between", value1, value2, "serviceName");
			return (Criteria) this;
		}

		public Criteria andServiceNameNotBetween(String value1, String value2) {
			addCriterion("service_name not between", value1, value2, "serviceName");
			return (Criteria) this;
		}

		public Criteria andAreaIsNull() {
			addCriterion("area is null");
			return (Criteria) this;
		}

		public Criteria andAreaIsNotNull() {
			addCriterion("area is not null");
			return (Criteria) this;
		}

		public Criteria andAreaEqualTo(String value) {
			addCriterion("area =", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotEqualTo(String value) {
			addCriterion("area <>", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThan(String value) {
			addCriterion("area >", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaGreaterThanOrEqualTo(String value) {
			addCriterion("area >=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThan(String value) {
			addCriterion("area <", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLessThanOrEqualTo(String value) {
			addCriterion("area <=", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaLike(String value) {
			addCriterion("area like", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotLike(String value) {
			addCriterion("area not like", value, "area");
			return (Criteria) this;
		}

		public Criteria andAreaIn(List<String> values) {
			addCriterion("area in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotIn(List<String> values) {
			addCriterion("area not in", values, "area");
			return (Criteria) this;
		}

		public Criteria andAreaBetween(String value1, String value2) {
			addCriterion("area between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andAreaNotBetween(String value1, String value2) {
			addCriterion("area not between", value1, value2, "area");
			return (Criteria) this;
		}

		public Criteria andServicePhoneIsNull() {
			addCriterion("service_phone is null");
			return (Criteria) this;
		}

		public Criteria andServicePhoneIsNotNull() {
			addCriterion("service_phone is not null");
			return (Criteria) this;
		}

		public Criteria andServicePhoneEqualTo(String value) {
			addCriterion("service_phone =", value, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneNotEqualTo(String value) {
			addCriterion("service_phone <>", value, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneGreaterThan(String value) {
			addCriterion("service_phone >", value, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneGreaterThanOrEqualTo(String value) {
			addCriterion("service_phone >=", value, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneLessThan(String value) {
			addCriterion("service_phone <", value, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneLessThanOrEqualTo(String value) {
			addCriterion("service_phone <=", value, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneLike(String value) {
			addCriterion("service_phone like", value, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneNotLike(String value) {
			addCriterion("service_phone not like", value, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneIn(List<String> values) {
			addCriterion("service_phone in", values, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneNotIn(List<String> values) {
			addCriterion("service_phone not in", values, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneBetween(String value1, String value2) {
			addCriterion("service_phone between", value1, value2, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePhoneNotBetween(String value1, String value2) {
			addCriterion("service_phone not between", value1, value2, "servicePhone");
			return (Criteria) this;
		}

		public Criteria andServicePasswordIsNull() {
			addCriterion("service_password is null");
			return (Criteria) this;
		}

		public Criteria andServicePasswordIsNotNull() {
			addCriterion("service_password is not null");
			return (Criteria) this;
		}

		public Criteria andServicePasswordEqualTo(String value) {
			addCriterion("service_password =", value, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordNotEqualTo(String value) {
			addCriterion("service_password <>", value, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordGreaterThan(String value) {
			addCriterion("service_password >", value, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordGreaterThanOrEqualTo(String value) {
			addCriterion("service_password >=", value, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordLessThan(String value) {
			addCriterion("service_password <", value, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordLessThanOrEqualTo(String value) {
			addCriterion("service_password <=", value, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordLike(String value) {
			addCriterion("service_password like", value, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordNotLike(String value) {
			addCriterion("service_password not like", value, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordIn(List<String> values) {
			addCriterion("service_password in", values, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordNotIn(List<String> values) {
			addCriterion("service_password not in", values, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordBetween(String value1, String value2) {
			addCriterion("service_password between", value1, value2, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andServicePasswordNotBetween(String value1, String value2) {
			addCriterion("service_password not between", value1, value2, "servicePassword");
			return (Criteria) this;
		}

		public Criteria andIntroductionIsNull() {
			addCriterion("introduction is null");
			return (Criteria) this;
		}

		public Criteria andIntroductionIsNotNull() {
			addCriterion("introduction is not null");
			return (Criteria) this;
		}

		public Criteria andIntroductionEqualTo(String value) {
			addCriterion("introduction =", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotEqualTo(String value) {
			addCriterion("introduction <>", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionGreaterThan(String value) {
			addCriterion("introduction >", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
			addCriterion("introduction >=", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLessThan(String value) {
			addCriterion("introduction <", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLessThanOrEqualTo(String value) {
			addCriterion("introduction <=", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionLike(String value) {
			addCriterion("introduction like", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotLike(String value) {
			addCriterion("introduction not like", value, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionIn(List<String> values) {
			addCriterion("introduction in", values, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotIn(List<String> values) {
			addCriterion("introduction not in", values, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionBetween(String value1, String value2) {
			addCriterion("introduction between", value1, value2, "introduction");
			return (Criteria) this;
		}

		public Criteria andIntroductionNotBetween(String value1, String value2) {
			addCriterion("introduction not between", value1, value2, "introduction");
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

		public Criteria andEmailIsNull() {
			addCriterion("email is null");
			return (Criteria) this;
		}

		public Criteria andEmailIsNotNull() {
			addCriterion("email is not null");
			return (Criteria) this;
		}

		public Criteria andEmailEqualTo(String value) {
			addCriterion("email =", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotEqualTo(String value) {
			addCriterion("email <>", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThan(String value) {
			addCriterion("email >", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailGreaterThanOrEqualTo(String value) {
			addCriterion("email >=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThan(String value) {
			addCriterion("email <", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLessThanOrEqualTo(String value) {
			addCriterion("email <=", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailLike(String value) {
			addCriterion("email like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotLike(String value) {
			addCriterion("email not like", value, "email");
			return (Criteria) this;
		}

		public Criteria andEmailIn(List<String> values) {
			addCriterion("email in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotIn(List<String> values) {
			addCriterion("email not in", values, "email");
			return (Criteria) this;
		}

		public Criteria andEmailBetween(String value1, String value2) {
			addCriterion("email between", value1, value2, "email");
			return (Criteria) this;
		}

		public Criteria andEmailNotBetween(String value1, String value2) {
			addCriterion("email not between", value1, value2, "email");
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

		public Criteria andSynopsisIsNull() {
			addCriterion("synopsis is null");
			return (Criteria) this;
		}

		public Criteria andSynopsisIsNotNull() {
			addCriterion("synopsis is not null");
			return (Criteria) this;
		}

		public Criteria andSynopsisEqualTo(String value) {
			addCriterion("synopsis =", value, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisNotEqualTo(String value) {
			addCriterion("synopsis <>", value, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisGreaterThan(String value) {
			addCriterion("synopsis >", value, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisGreaterThanOrEqualTo(String value) {
			addCriterion("synopsis >=", value, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisLessThan(String value) {
			addCriterion("synopsis <", value, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisLessThanOrEqualTo(String value) {
			addCriterion("synopsis <=", value, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisLike(String value) {
			addCriterion("synopsis like", value, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisNotLike(String value) {
			addCriterion("synopsis not like", value, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisIn(List<String> values) {
			addCriterion("synopsis in", values, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisNotIn(List<String> values) {
			addCriterion("synopsis not in", values, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisBetween(String value1, String value2) {
			addCriterion("synopsis between", value1, value2, "synopsis");
			return (Criteria) this;
		}

		public Criteria andSynopsisNotBetween(String value1, String value2) {
			addCriterion("synopsis not between", value1, value2, "synopsis");
			return (Criteria) this;
		}

		public Criteria andWorktimeIsNull() {
			addCriterion("worktime is null");
			return (Criteria) this;
		}

		public Criteria andWorktimeIsNotNull() {
			addCriterion("worktime is not null");
			return (Criteria) this;
		}

		public Criteria andWorktimeEqualTo(String value) {
			addCriterion("worktime =", value, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeNotEqualTo(String value) {
			addCriterion("worktime <>", value, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeGreaterThan(String value) {
			addCriterion("worktime >", value, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeGreaterThanOrEqualTo(String value) {
			addCriterion("worktime >=", value, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeLessThan(String value) {
			addCriterion("worktime <", value, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeLessThanOrEqualTo(String value) {
			addCriterion("worktime <=", value, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeLike(String value) {
			addCriterion("worktime like", value, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeNotLike(String value) {
			addCriterion("worktime not like", value, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeIn(List<String> values) {
			addCriterion("worktime in", values, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeNotIn(List<String> values) {
			addCriterion("worktime not in", values, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeBetween(String value1, String value2) {
			addCriterion("worktime between", value1, value2, "worktime");
			return (Criteria) this;
		}

		public Criteria andWorktimeNotBetween(String value1, String value2) {
			addCriterion("worktime not between", value1, value2, "worktime");
			return (Criteria) this;
		}

		public Criteria andQqIsNull() {
			addCriterion("qq is null");
			return (Criteria) this;
		}

		public Criteria andQqIsNotNull() {
			addCriterion("qq is not null");
			return (Criteria) this;
		}

		public Criteria andQqEqualTo(String value) {
			addCriterion("qq =", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotEqualTo(String value) {
			addCriterion("qq <>", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThan(String value) {
			addCriterion("qq >", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqGreaterThanOrEqualTo(String value) {
			addCriterion("qq >=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThan(String value) {
			addCriterion("qq <", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLessThanOrEqualTo(String value) {
			addCriterion("qq <=", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqLike(String value) {
			addCriterion("qq like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotLike(String value) {
			addCriterion("qq not like", value, "qq");
			return (Criteria) this;
		}

		public Criteria andQqIn(List<String> values) {
			addCriterion("qq in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotIn(List<String> values) {
			addCriterion("qq not in", values, "qq");
			return (Criteria) this;
		}

		public Criteria andQqBetween(String value1, String value2) {
			addCriterion("qq between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andQqNotBetween(String value1, String value2) {
			addCriterion("qq not between", value1, value2, "qq");
			return (Criteria) this;
		}

		public Criteria andWechatIsNull() {
			addCriterion("wechat is null");
			return (Criteria) this;
		}

		public Criteria andWechatIsNotNull() {
			addCriterion("wechat is not null");
			return (Criteria) this;
		}

		public Criteria andWechatEqualTo(String value) {
			addCriterion("wechat =", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatNotEqualTo(String value) {
			addCriterion("wechat <>", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatGreaterThan(String value) {
			addCriterion("wechat >", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatGreaterThanOrEqualTo(String value) {
			addCriterion("wechat >=", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatLessThan(String value) {
			addCriterion("wechat <", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatLessThanOrEqualTo(String value) {
			addCriterion("wechat <=", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatLike(String value) {
			addCriterion("wechat like", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatNotLike(String value) {
			addCriterion("wechat not like", value, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatIn(List<String> values) {
			addCriterion("wechat in", values, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatNotIn(List<String> values) {
			addCriterion("wechat not in", values, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatBetween(String value1, String value2) {
			addCriterion("wechat between", value1, value2, "wechat");
			return (Criteria) this;
		}

		public Criteria andWechatNotBetween(String value1, String value2) {
			addCriterion("wechat not between", value1, value2, "wechat");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneIsNull() {
			addCriterion("custom_phone is null");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneIsNotNull() {
			addCriterion("custom_phone is not null");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneEqualTo(String value) {
			addCriterion("custom_phone =", value, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneNotEqualTo(String value) {
			addCriterion("custom_phone <>", value, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneGreaterThan(String value) {
			addCriterion("custom_phone >", value, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneGreaterThanOrEqualTo(String value) {
			addCriterion("custom_phone >=", value, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneLessThan(String value) {
			addCriterion("custom_phone <", value, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneLessThanOrEqualTo(String value) {
			addCriterion("custom_phone <=", value, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneLike(String value) {
			addCriterion("custom_phone like", value, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneNotLike(String value) {
			addCriterion("custom_phone not like", value, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneIn(List<String> values) {
			addCriterion("custom_phone in", values, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneNotIn(List<String> values) {
			addCriterion("custom_phone not in", values, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneBetween(String value1, String value2) {
			addCriterion("custom_phone between", value1, value2, "customPhone");
			return (Criteria) this;
		}

		public Criteria andCustomPhoneNotBetween(String value1, String value2) {
			addCriterion("custom_phone not between", value1, value2, "customPhone");
			return (Criteria) this;
		}

		public Criteria andLicenseIsNull() {
			addCriterion("license is null");
			return (Criteria) this;
		}

		public Criteria andLicenseIsNotNull() {
			addCriterion("license is not null");
			return (Criteria) this;
		}

		public Criteria andLicenseEqualTo(String value) {
			addCriterion("license =", value, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseNotEqualTo(String value) {
			addCriterion("license <>", value, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseGreaterThan(String value) {
			addCriterion("license >", value, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseGreaterThanOrEqualTo(String value) {
			addCriterion("license >=", value, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseLessThan(String value) {
			addCriterion("license <", value, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseLessThanOrEqualTo(String value) {
			addCriterion("license <=", value, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseLike(String value) {
			addCriterion("license like", value, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseNotLike(String value) {
			addCriterion("license not like", value, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseIn(List<String> values) {
			addCriterion("license in", values, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseNotIn(List<String> values) {
			addCriterion("license not in", values, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseBetween(String value1, String value2) {
			addCriterion("license between", value1, value2, "license");
			return (Criteria) this;
		}

		public Criteria andLicenseNotBetween(String value1, String value2) {
			addCriterion("license not between", value1, value2, "license");
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
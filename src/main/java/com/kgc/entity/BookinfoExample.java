package com.kgc.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BookinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BookinfoExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookid is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookid is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(Integer value) {
            addCriterion("bookid =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(Integer value) {
            addCriterion("bookid <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(Integer value) {
            addCriterion("bookid >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bookid >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(Integer value) {
            addCriterion("bookid <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(Integer value) {
            addCriterion("bookid <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<Integer> values) {
            addCriterion("bookid in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<Integer> values) {
            addCriterion("bookid not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(Integer value1, Integer value2) {
            addCriterion("bookid between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(Integer value1, Integer value2) {
            addCriterion("bookid not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookcodeIsNull() {
            addCriterion("bookcode is null");
            return (Criteria) this;
        }

        public Criteria andBookcodeIsNotNull() {
            addCriterion("bookcode is not null");
            return (Criteria) this;
        }

        public Criteria andBookcodeEqualTo(String value) {
            addCriterion("bookcode =", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeNotEqualTo(String value) {
            addCriterion("bookcode <>", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeGreaterThan(String value) {
            addCriterion("bookcode >", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bookcode >=", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeLessThan(String value) {
            addCriterion("bookcode <", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeLessThanOrEqualTo(String value) {
            addCriterion("bookcode <=", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeLike(String value) {
            addCriterion("bookcode like", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeNotLike(String value) {
            addCriterion("bookcode not like", value, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeIn(List<String> values) {
            addCriterion("bookcode in", values, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeNotIn(List<String> values) {
            addCriterion("bookcode not in", values, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeBetween(String value1, String value2) {
            addCriterion("bookcode between", value1, value2, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBookcodeNotBetween(String value1, String value2) {
            addCriterion("bookcode not between", value1, value2, "bookcode");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNull() {
            addCriterion("bookname is null");
            return (Criteria) this;
        }

        public Criteria andBooknameIsNotNull() {
            addCriterion("bookname is not null");
            return (Criteria) this;
        }

        public Criteria andBooknameEqualTo(String value) {
            addCriterion("bookname =", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotEqualTo(String value) {
            addCriterion("bookname <>", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThan(String value) {
            addCriterion("bookname >", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameGreaterThanOrEqualTo(String value) {
            addCriterion("bookname >=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThan(String value) {
            addCriterion("bookname <", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLessThanOrEqualTo(String value) {
            addCriterion("bookname <=", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameLike(String value) {
            addCriterion("bookname like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotLike(String value) {
            addCriterion("bookname not like", value, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameIn(List<String> values) {
            addCriterion("bookname in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotIn(List<String> values) {
            addCriterion("bookname not in", values, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameBetween(String value1, String value2) {
            addCriterion("bookname between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooknameNotBetween(String value1, String value2) {
            addCriterion("bookname not between", value1, value2, "bookname");
            return (Criteria) this;
        }

        public Criteria andBooktypeIsNull() {
            addCriterion("booktype is null");
            return (Criteria) this;
        }

        public Criteria andBooktypeIsNotNull() {
            addCriterion("booktype is not null");
            return (Criteria) this;
        }

        public Criteria andBooktypeEqualTo(String value) {
            addCriterion("booktype =", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotEqualTo(String value) {
            addCriterion("booktype <>", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeGreaterThan(String value) {
            addCriterion("booktype >", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeGreaterThanOrEqualTo(String value) {
            addCriterion("booktype >=", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeLessThan(String value) {
            addCriterion("booktype <", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeLessThanOrEqualTo(String value) {
            addCriterion("booktype <=", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeLike(String value) {
            addCriterion("booktype like", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotLike(String value) {
            addCriterion("booktype not like", value, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeIn(List<String> values) {
            addCriterion("booktype in", values, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotIn(List<String> values) {
            addCriterion("booktype not in", values, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeBetween(String value1, String value2) {
            addCriterion("booktype between", value1, value2, "booktype");
            return (Criteria) this;
        }

        public Criteria andBooktypeNotBetween(String value1, String value2) {
            addCriterion("booktype not between", value1, value2, "booktype");
            return (Criteria) this;
        }

        public Criteria andBookauthorIsNull() {
            addCriterion("bookauthor is null");
            return (Criteria) this;
        }

        public Criteria andBookauthorIsNotNull() {
            addCriterion("bookauthor is not null");
            return (Criteria) this;
        }

        public Criteria andBookauthorEqualTo(String value) {
            addCriterion("bookauthor =", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorNotEqualTo(String value) {
            addCriterion("bookauthor <>", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorGreaterThan(String value) {
            addCriterion("bookauthor >", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorGreaterThanOrEqualTo(String value) {
            addCriterion("bookauthor >=", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorLessThan(String value) {
            addCriterion("bookauthor <", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorLessThanOrEqualTo(String value) {
            addCriterion("bookauthor <=", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorLike(String value) {
            addCriterion("bookauthor like", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorNotLike(String value) {
            addCriterion("bookauthor not like", value, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorIn(List<String> values) {
            addCriterion("bookauthor in", values, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorNotIn(List<String> values) {
            addCriterion("bookauthor not in", values, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorBetween(String value1, String value2) {
            addCriterion("bookauthor between", value1, value2, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andBookauthorNotBetween(String value1, String value2) {
            addCriterion("bookauthor not between", value1, value2, "bookauthor");
            return (Criteria) this;
        }

        public Criteria andPublishpressIsNull() {
            addCriterion("publishpress is null");
            return (Criteria) this;
        }

        public Criteria andPublishpressIsNotNull() {
            addCriterion("publishpress is not null");
            return (Criteria) this;
        }

        public Criteria andPublishpressEqualTo(String value) {
            addCriterion("publishpress =", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressNotEqualTo(String value) {
            addCriterion("publishpress <>", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressGreaterThan(String value) {
            addCriterion("publishpress >", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressGreaterThanOrEqualTo(String value) {
            addCriterion("publishpress >=", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressLessThan(String value) {
            addCriterion("publishpress <", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressLessThanOrEqualTo(String value) {
            addCriterion("publishpress <=", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressLike(String value) {
            addCriterion("publishpress like", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressNotLike(String value) {
            addCriterion("publishpress not like", value, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressIn(List<String> values) {
            addCriterion("publishpress in", values, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressNotIn(List<String> values) {
            addCriterion("publishpress not in", values, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressBetween(String value1, String value2) {
            addCriterion("publishpress between", value1, value2, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishpressNotBetween(String value1, String value2) {
            addCriterion("publishpress not between", value1, value2, "publishpress");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNull() {
            addCriterion("publishdate is null");
            return (Criteria) this;
        }

        public Criteria andPublishdateIsNotNull() {
            addCriterion("publishdate is not null");
            return (Criteria) this;
        }

        public Criteria andPublishdateEqualTo(Date value) {
            addCriterionForJDBCDate("publishdate =", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("publishdate <>", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThan(Date value) {
            addCriterionForJDBCDate("publishdate >", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishdate >=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThan(Date value) {
            addCriterionForJDBCDate("publishdate <", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("publishdate <=", value, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateIn(List<Date> values) {
            addCriterionForJDBCDate("publishdate in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("publishdate not in", values, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishdate between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andPublishdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("publishdate not between", value1, value2, "publishdate");
            return (Criteria) this;
        }

        public Criteria andIsborrowIsNull() {
            addCriterion("isborrow is null");
            return (Criteria) this;
        }

        public Criteria andIsborrowIsNotNull() {
            addCriterion("isborrow is not null");
            return (Criteria) this;
        }

        public Criteria andIsborrowEqualTo(String value) {
            addCriterion("isborrow =", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowNotEqualTo(String value) {
            addCriterion("isborrow <>", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowGreaterThan(String value) {
            addCriterion("isborrow >", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowGreaterThanOrEqualTo(String value) {
            addCriterion("isborrow >=", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowLessThan(String value) {
            addCriterion("isborrow <", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowLessThanOrEqualTo(String value) {
            addCriterion("isborrow <=", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowLike(String value) {
            addCriterion("isborrow like", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowNotLike(String value) {
            addCriterion("isborrow not like", value, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowIn(List<String> values) {
            addCriterion("isborrow in", values, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowNotIn(List<String> values) {
            addCriterion("isborrow not in", values, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowBetween(String value1, String value2) {
            addCriterion("isborrow between", value1, value2, "isborrow");
            return (Criteria) this;
        }

        public Criteria andIsborrowNotBetween(String value1, String value2) {
            addCriterion("isborrow not between", value1, value2, "isborrow");
            return (Criteria) this;
        }

        public Criteria andVreatedbyIsNull() {
            addCriterion("vreatedBy is null");
            return (Criteria) this;
        }

        public Criteria andVreatedbyIsNotNull() {
            addCriterion("vreatedBy is not null");
            return (Criteria) this;
        }

        public Criteria andVreatedbyEqualTo(String value) {
            addCriterion("vreatedBy =", value, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyNotEqualTo(String value) {
            addCriterion("vreatedBy <>", value, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyGreaterThan(String value) {
            addCriterion("vreatedBy >", value, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyGreaterThanOrEqualTo(String value) {
            addCriterion("vreatedBy >=", value, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyLessThan(String value) {
            addCriterion("vreatedBy <", value, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyLessThanOrEqualTo(String value) {
            addCriterion("vreatedBy <=", value, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyLike(String value) {
            addCriterion("vreatedBy like", value, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyNotLike(String value) {
            addCriterion("vreatedBy not like", value, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyIn(List<String> values) {
            addCriterion("vreatedBy in", values, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyNotIn(List<String> values) {
            addCriterion("vreatedBy not in", values, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyBetween(String value1, String value2) {
            addCriterion("vreatedBy between", value1, value2, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andVreatedbyNotBetween(String value1, String value2) {
            addCriterion("vreatedBy not between", value1, value2, "vreatedby");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNull() {
            addCriterion("creationTime is null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIsNotNull() {
            addCriterion("creationTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreationtimeEqualTo(Date value) {
            addCriterionForJDBCDate("creationTime =", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("creationTime <>", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("creationTime >", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creationTime >=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThan(Date value) {
            addCriterionForJDBCDate("creationTime <", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("creationTime <=", value, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeIn(List<Date> values) {
            addCriterionForJDBCDate("creationTime in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("creationTime not in", values, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creationTime between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andCreationtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("creationTime not between", value1, value2, "creationtime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNull() {
            addCriterion("lastupdatetime is null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIsNotNull() {
            addCriterion("lastupdatetime is not null");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("lastupdatetime =", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("lastupdatetime <>", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("lastupdatetime >", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastupdatetime >=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("lastupdatetime <", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("lastupdatetime <=", value, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("lastupdatetime in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("lastupdatetime not in", values, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastupdatetime between", value1, value2, "lastupdatetime");
            return (Criteria) this;
        }

        public Criteria andLastupdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("lastupdatetime not between", value1, value2, "lastupdatetime");
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
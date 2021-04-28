package com.excel.model;

import com.excel.model.CampsUserExample.C;
import com.excel.model.CampsUserExample.Criteria;
import java.io.Serializable;
import java.sql.Types;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import mboog.support.example.AbstractExample;
import mboog.support.example.AbstractGeneratedCriteria;
import mboog.support.example.CInterface;
import mboog.support.example.CItem;
import mboog.support.example.ColumnListAble;
import mboog.support.example.PaginationAble;

@SuppressWarnings("unused")
public class CampsUserExample extends AbstractExample<CampsUserExample, Criteria, C> implements Serializable, PaginationAble<CampsUserExample>, ColumnListAble<CampsUserExample, C, C> {
    
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table camps_user
     *
     * @mbg.generated Wed Apr 28 09:49:25 CST 2021
     */
    public CampsUserExample() {
        supplier = Criteria::new;
        initColumnList(C.class);
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table camps_user
     *
     * @mbg.generated Wed Apr 28 09:49:25 CST 2021
     */
    protected abstract static class GeneratedCriteria extends AbstractGeneratedCriteria<Criteria> {

        public Criteria andUseridIsNull() {
            addCriterion("userId is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userId is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userId =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userId <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userId >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userId >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userId <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userId <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String pattern, String value) {
            addCriterionPattern("userId like", pattern, value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String pattern, String value) {
            addCriterionPattern("userId not like", pattern, value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userId in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userId not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userId between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userId not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String pattern, String value) {
            addCriterionPattern("username like", pattern, value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String pattern, String value) {
            addCriterionPattern("username not like", pattern, value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andDescIsNull() {
            addCriterion("`desc` is null");
            return (Criteria) this;
        }

        public Criteria andDescIsNotNull() {
            addCriterion("`desc` is not null");
            return (Criteria) this;
        }

        public Criteria andDescEqualTo(String value) {
            addCriterion("`desc` =", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotEqualTo(String value) {
            addCriterion("`desc` <>", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThan(String value) {
            addCriterion("`desc` >", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescGreaterThanOrEqualTo(String value) {
            addCriterion("`desc` >=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThan(String value) {
            addCriterion("`desc` <", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLessThanOrEqualTo(String value) {
            addCriterion("`desc` <=", value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescLike(String pattern, String value) {
            addCriterionPattern("`desc` like", pattern, value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotLike(String pattern, String value) {
            addCriterionPattern("`desc` not like", pattern, value, "desc");
            return (Criteria) this;
        }

        public Criteria andDescIn(List<String> values) {
            addCriterion("`desc` in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotIn(List<String> values) {
            addCriterion("`desc` not in", values, "desc");
            return (Criteria) this;
        }

        public Criteria andDescBetween(String value1, String value2) {
            addCriterion("`desc` between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andDescNotBetween(String value1, String value2) {
            addCriterion("`desc` not between", value1, value2, "desc");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createTime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(LocalDateTime value) {
            addCriterion("createTime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(LocalDateTime value) {
            addCriterion("createTime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(LocalDateTime value) {
            addCriterion("createTime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(LocalDateTime value) {
            addCriterion("createTime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(LocalDateTime value) {
            addCriterion("createTime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(LocalDateTime value) {
            addCriterion("createTime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<LocalDateTime> values) {
            addCriterion("createTime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<LocalDateTime> values) {
            addCriterion("createTime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("createTime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(LocalDateTime value1, LocalDateTime value2) {
            addCriterion("createTime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table camps_user
     *
     * @mbg.generated do_not_delete_during_merge Wed Apr 28 09:49:25 CST 2021
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {
        
        private static final long serialVersionUID = 1L;

        protected Criteria() {
            super();
        }
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table camps_user
     *
     * @mbg.generated Wed Apr 28 09:49:25 CST 2021
     */
    public enum C implements CInterface {
        //--------------------------------------------------
		//[TABLE]
		//--------------------------------------------------					
						USERID(1, Types.VARCHAR, false, "userId"),					
						USERNAME(2, Types.VARCHAR, false, "username"),					
						DESC(2, Types.VARCHAR, true, "desc"),					
						CREATETIME(2, Types.TIMESTAMP, false, "createTime");

        C(int types, int jdbcType, boolean delimited, String columnName) {
            init(new CItem(types, jdbcType, delimited, columnName, null , "`", "`"));
        }
    }
}
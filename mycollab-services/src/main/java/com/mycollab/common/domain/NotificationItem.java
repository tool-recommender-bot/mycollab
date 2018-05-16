/*Domain class of table m_notification_item*/
package com.mycollab.common.domain;

import com.mycollab.core.arguments.ValuedBean;
import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import java.util.Date;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.ibatis.type.Alias;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
@Table("m_notification_item")
@Alias("NotificationItem")
public class NotificationItem extends ValuedBean {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.id
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Column("id")
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.module
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("module")
    private String module;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.type
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("type")
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.typeId
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("typeId")
    private String typeid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.notificationUser
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Length(max=45, message="Field value is too long")
    @Column("notificationUser")
    private String notificationuser;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.createdTime
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Column("createdTime")
    private Date createdtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.message
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Length(max=1000, message="Field value is too long")
    @Column("message")
    private String message;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.isRead
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Column("isRead")
    private Boolean isread;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_notification_item.sAccountId
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    @Column("sAccountId")
    private Integer saccountid;

    private static final long serialVersionUID = 1;

    public final boolean equals(Object obj) {
        if (obj == null) { return false;}
        if (obj == this) { return true;}
        if (!obj.getClass().isAssignableFrom(getClass())) { return false;}
        NotificationItem item = (NotificationItem)obj;
        return new EqualsBuilder().append(id, item.id).build();
    }

    public final int hashCode() {
        return new HashCodeBuilder(949, 355).append(id).build();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.id
     *
     * @return the value of m_notification_item.id
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.id
     *
     * @param id the value for m_notification_item.id
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.module
     *
     * @return the value of m_notification_item.module
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public String getModule() {
        return module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.module
     *
     * @param module the value for m_notification_item.module
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setModule(String module) {
        this.module = module;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.type
     *
     * @return the value of m_notification_item.type
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.type
     *
     * @param type the value for m_notification_item.type
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.typeId
     *
     * @return the value of m_notification_item.typeId
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public String getTypeid() {
        return typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.typeId
     *
     * @param typeid the value for m_notification_item.typeId
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.notificationUser
     *
     * @return the value of m_notification_item.notificationUser
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public String getNotificationuser() {
        return notificationuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.notificationUser
     *
     * @param notificationuser the value for m_notification_item.notificationUser
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setNotificationuser(String notificationuser) {
        this.notificationuser = notificationuser;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.createdTime
     *
     * @return the value of m_notification_item.createdTime
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.createdTime
     *
     * @param createdtime the value for m_notification_item.createdTime
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.message
     *
     * @return the value of m_notification_item.message
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.message
     *
     * @param message the value for m_notification_item.message
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.isRead
     *
     * @return the value of m_notification_item.isRead
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public Boolean getIsread() {
        return isread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.isRead
     *
     * @param isread the value for m_notification_item.isRead
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setIsread(Boolean isread) {
        this.isread = isread;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_notification_item.sAccountId
     *
     * @return the value of m_notification_item.sAccountId
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public Integer getSaccountid() {
        return saccountid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_notification_item.sAccountId
     *
     * @param saccountid the value for m_notification_item.sAccountId
     *
     * @mbg.generated Fri Dec 01 20:52:18 ICT 2017
     */
    public void setSaccountid(Integer saccountid) {
        this.saccountid = saccountid;
    }

    public enum Field {
        id,
        module,
        type,
        typeid,
        notificationuser,
        createdtime,
        message,
        isread,
        saccountid;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}
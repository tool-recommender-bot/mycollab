package com.mycollab.module.tracker.domain;

import com.mycollab.db.metadata.Column;
import com.mycollab.db.metadata.Table;
import org.hibernate.validator.constraints.Length;

@SuppressWarnings("ucd")
public class BugWithBLOBs extends Bug {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug.detail
     *
     * @mbg.generated Fri Dec 01 20:52:19 ICT 2017
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("detail")
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_tracker_bug.description
     *
     * @mbg.generated Fri Dec 01 20:52:19 ICT 2017
     */
    @Length(max=16777215, message="Field value is too long")
    @Column("description")
    private String description;

    private static final long serialVersionUID = 1;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug.detail
     *
     * @return the value of m_tracker_bug.detail
     *
     * @mbg.generated Fri Dec 01 20:52:19 ICT 2017
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug.detail
     *
     * @param detail the value for m_tracker_bug.detail
     *
     * @mbg.generated Fri Dec 01 20:52:19 ICT 2017
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column m_tracker_bug.description
     *
     * @return the value of m_tracker_bug.description
     *
     * @mbg.generated Fri Dec 01 20:52:19 ICT 2017
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column m_tracker_bug.description
     *
     * @param description the value for m_tracker_bug.description
     *
     * @mbg.generated Fri Dec 01 20:52:19 ICT 2017
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public enum Field {
        id,
        name,
        assignuser,
        createdtime,
        createduser,
        severity,
        priority,
        lastupdatedtime,
        status,
        duedate,
        environment,
        resolution,
        cusInt01,
        cusInt02,
        cusInt03,
        cusInt04,
        cusInt05,
        cusInt06,
        cusInt07,
        cusInt08,
        cusInt09,
        cusInt10,
        cusStr01,
        cusStr02,
        cusStr03,
        cusStr04,
        cusStr05,
        cusTime01,
        cusTime02,
        cusTime03,
        cusTime04,
        cusDbl01,
        cusDbl02,
        cusDbl03,
        projectid,
        resolveddate,
        originalestimate,
        remainestimate,
        saccountid,
        milestoneid,
        bugkey,
        bugindex,
        startdate,
        enddate,
        ganttindex,
        percentagecomplete,
        detail,
        description;

        public boolean equalTo(Object value) {
            return name().equals(value);
        }
    }
}
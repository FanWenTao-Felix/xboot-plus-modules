package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @TableName CT_PIG_COMPLETESTATUS
 */
@Table(name="CT_PIG_COMPLETESTATUS")
@Data
public class CtPigCompletestatus implements Serializable {
    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FSIMPLENAME")
    private String fsimplename;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FNAME_L1")
    private String fnameL1;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FNAME_L2")
    private String fnameL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FNAME_L3")
    private String fnameL3;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FDESCRIPTION_L1")
    private String fdescriptionL1;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FDESCRIPTION_L2")
    private String fdescriptionL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    @Column(name = "FDESCRIPTION_L3")
    private String fdescriptionL3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CT_PIG_COMPLETESTATUS
     *
     * @mbg.generated Mon Jan 11 09:39:07 CST 2021
     */
    private static final long serialVersionUID = 1L;
}
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 * @TableName CT_PIG_SEMENSELLRECORD
 */
@Table(name="CT_PIG_SEMENSELLRECORD")
@Data
public class CtPigSemensellrecord implements Serializable {
    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FBIZDATE")
    private Date fbizdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FHANDLERID")
    private String fhandlerid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FDESCRIPTION")
    private String fdescription;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FHASEFFECTED")
    private Long fhaseffected;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FAUDITORID")
    private String fauditorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FSOURCEBILLID")
    private String fsourcebillid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FSOURCEFUNCTION")
    private String fsourcefunction;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "FFIVOUCHERED")
    private Long ffivouchered;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFORGUNITID")
    private String cforgunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFWEEKHAO")
    private String cfweekhao;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFBUYERS")
    private String cfbuyers;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFPEIJINGPERSONID")
    private String cfpeijingpersonid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFQTY")
    private Long cfqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFJINGYEAMT")
    private BigDecimal cfjingyeamt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFEARNUMBERID")
    private String cfearnumberid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFWRITEQTY")
    private BigDecimal cfwriteqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFNOWRITEQTY")
    private BigDecimal cfnowriteqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFWRITEAMT")
    private BigDecimal cfwriteamt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFNOWRITEAMT")
    private BigDecimal cfnowriteamt;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFGENETICSID")
    private String cfgeneticsid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFDOSEID")
    private String cfdoseid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFHUOLI")
    private String cfhuoli;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFYOUXIAOQTY")
    private Long cfyouxiaoqty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFDILUENTSPECIFICA")
    private String cfdiluentspecifica;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFBATCHNUMBER")
    private String cfbatchnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFPRICE")
    private BigDecimal cfprice;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFBIRTHDATE")
    private Date cfbirthdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFSHELF")
    private Long cfshelf;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFENDDATE")
    private Date cfenddate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFSEMENNUMBERID")
    private String cfsemennumberid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFISCHECKED")
    private Long cfischecked;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFIFAUDITING")
    private Long cfifauditing;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFAUDITUSERID")
    private String cfaudituserid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFNOTE")
    private String cfnote;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFAPPLICATIONID")
    private String cfapplicationid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    @Column(name = "CFCOMPLETESTATUSID")
    private String cfcompletestatusid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table CT_PIG_SEMENSELLRECORD
     *
     * @mbg.generated Mon Jan 18 14:43:54 CST 2021
     */
    private static final long serialVersionUID = 1L;
}
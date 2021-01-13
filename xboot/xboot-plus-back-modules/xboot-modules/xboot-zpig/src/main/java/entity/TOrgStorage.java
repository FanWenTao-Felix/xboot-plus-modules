package entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @TableName T_ORG_STORAGE
 */
@Table(name="T_ORG_STORAGE")
@TableName("T_ORG_STORAGE")
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel("库存组织单元")
public class TOrgStorage implements Serializable {
    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Id
    @TableId
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FNAME_L1")
    private String fnameL1;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FNAME_L2")
    private String fnameL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FNAME_L3")
    private String fnameL3;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FDESCRIPTION_L1")
    private String fdescriptionL1;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FDESCRIPTION_L2")
    private String fdescriptionL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FDESCRIPTION_L3")
    private String fdescriptionL3;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FSIMPLENAME")
    private String fsimplename;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISGROUPING")
    private Long fisgrouping;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FEFFECTDATE")
    private Date feffectdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FINVALIDDATE")
    private Date finvaliddate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISFREEZE")
    private Long fisfreeze;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISCOMPANYORGUNIT")
    private Long fiscompanyorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISADMINORGUNIT")
    private Long fisadminorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISSALEORGUNIT")
    private Long fissaleorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISPURCHASEORGUNIT")
    private Long fispurchaseorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISSTORAGEORGUNIT")
    private Long fisstorageorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISPROFITORGUNIT")
    private Long fisprofitorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISCOSTORGUNIT")
    private Long fiscostorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISCU")
    private Long fiscu;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISUNION")
    private Long fisunion;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISHRORGUNIT")
    private Long fishrorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISLEAF")
    private Long fisleaf;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FLEVEL")
    private Long flevel;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FLONGNUMBER")
    private String flongnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FPARENTID")
    private String fparentid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FLEADER")
    private String fleader;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FADDRESSID")
    private String faddressid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISSEALUP")
    private Long fissealup;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISBIZUNIT")
    private Long fisbizunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FTYPE")
    private Long ftype;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FSTATUS")
    private Long fstatus;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISSTART")
    private Long fisstart;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISOUSEALUP")
    private Long fisousealup;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FDISPLAYNAME_L1")
    private String fdisplaynameL1;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FDISPLAYNAME_L2")
    private String fdisplaynameL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FDISPLAYNAME_L3")
    private String fdisplaynameL3;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FPROPERTYSEALUPDATE")
    private Date fpropertysealupdate;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FLOCATION")
    private String flocation;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FVERSIONNUMBER")
    private String fversionnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FCODE")
    private String fcode;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISTRANSPORTORGUNIT")
    private Long fistransportorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FISQUALITYORGUNIT")
    private Long fisqualityorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "FORGTYPESTR")
    private String forgtypestr;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "JING")
    private String jing;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "WEI")
    private String wei;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    @Column(name = "JINGWEIUSER")
    private String jingweiuser;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_ORG_STORAGE
     *
     * @mbg.generated Mon Jan 11 08:42:22 CST 2021
     */
    private static final long serialVersionUID = 1L;
}
package entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @TableName T_BD_MATERIAL
 */
@Table(name="T_BD_MATERIAL")
@TableName("T_BD_MATERIAL")
@Data
@Entity
@DynamicInsert
@DynamicUpdate
@ApiModel(value = "物料")
public class TBdMaterial implements Serializable {
    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "FID")
    private String fid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FCREATORID")
    private String fcreatorid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FCREATETIME")
    private Date fcreatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FLASTUPDATEUSERID")
    private String flastupdateuserid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FLASTUPDATETIME")
    private Date flastupdatetime;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FCONTROLUNITID")
    private String fcontrolunitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNAME_L1")
    private String fnameL1;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNAME_L2")
    private String fnameL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNAME_L3")
    private String fnameL3;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNUMBER")
    private String fnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FDESCRIPTION_L1")
    private String fdescriptionL1;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FDESCRIPTION_L2")
    private String fdescriptionL2;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FDESCRIPTION_L3")
    private String fdescriptionL3;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FSIMPLENAME")
    private String fsimplename;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FVERSION")
    private Long fversion;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FLONGNUMBER")
    private String flongnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FSHORTNAME")
    private String fshortname;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FMODEL")
    private String fmodel;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FBASEUNIT")
    private String fbaseunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FPRICEPRECISION")
    private Long fpriceprecision;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FHELPCODE")
    private String fhelpcode;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FBARCODE")
    private String fbarcode;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FPICTURENUMBER")
    private String fpicturenumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FASSISTATTR")
    private String fassistattr;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FGROSSWEIGHT")
    private BigDecimal fgrossweight;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNETWEIGHT")
    private BigDecimal fnetweight;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FLENGTH")
    private BigDecimal flength;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FWIDTH")
    private BigDecimal fwidth;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FHEIGHT")
    private BigDecimal fheight;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FVOLUME")
    private BigDecimal fvolume;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FWEIGHTUNIT")
    private String fweightunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FLENGTHUNIT")
    private String flengthunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FVOLUMNUNIT")
    private String fvolumnunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FMATERIALGROUPID")
    private String fmaterialgroupid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FEFFECTEDSTATUS")
    private Long feffectedstatus;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FALIAS")
    private String falias;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FFOREIGNNAME")
    private String fforeignname;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FREGISTEREDMARK")
    private String fregisteredmark;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FWARRANTNUMBER")
    private String fwarrantnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FSTATUS")
    private Long fstatus;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FFREEZEORGUNIT")
    private String ffreezeorgunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FADMINCUID")
    private String fadmincuid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FASSISTUNIT")
    private String fassistunit;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FSEQUNITID")
    private String fsequnitid;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FISWEIGHTED")
    private Long fisweighted;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FUSEASSTATTRRELATION")
    private Long fuseasstattrrelation;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FISOUTSOURCEDPART")
    private Long fisoutsourcedpart;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FEQUIPPROPERTY")
    private Long fequipproperty;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FMATERIALTRADEMARK")
    private String fmaterialtrademark;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FOLDNUMBER")
    private String foldnumber;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNUMBER4IDX")
    private String fnumber4idx;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNAME4IDX")
    private String fname4idx;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FISSYNOCHRONOUS")
    private Long fissynochronous;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FISGOODS")
    private Long fisgoods;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNAMEPINYIN")
    private String fnamepinyin;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "FNAMESHORTPINYIN")
    private String fnameshortpinyin;

    /**
     * 
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    @Column(name = "CFMATTYPE")
    private String cfmattype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table T_BD_MATERIAL
     *
     * @mbg.generated Mon Jan 11 09:14:39 CST 2021
     */
    private static final long serialVersionUID = 1L;
}